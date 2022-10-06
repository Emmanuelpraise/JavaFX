package Tutorial.Charts.PieChart;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;

import java.net.URL;
import java.util.ResourceBundle;

import static javafx.beans.binding.Bindings.concat;


public class Controller implements Initializable {

    @FXML
    private PieChart piechart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Apples", 2),
                new PieChart.Data("Oranges", 25),
                new PieChart.Data("Grapes", 50),
                new PieChart.Data("Apples", 3));

//        This is to define the name Convention
//        We you comment the bellow you will see
        pieChartData.forEach(data ->
                data.nameProperty().bind(
                        concat(
                                data.getName(), " amount: ", data.pieValueProperty()
                        )
                )
        );
//
        piechart.getData().addAll(pieChartData);
    }
}
