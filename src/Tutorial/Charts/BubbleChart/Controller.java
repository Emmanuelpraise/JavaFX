package Tutorial.Charts.BubbleChart;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private BubbleChart<Integer, Integer> bubbleChart;

//    Create series
    XYChart.Series series1 = new XYChart.Series();
    XYChart.Series series2 = new XYChart.Series();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        bubbleChart.getXAxis().setLabel("Week");
        bubbleChart.getYAxis().setLabel("Budget");

        series1.setName("Product");
//        add values
        series1.getData().add(new XYChart.Data(1,35));
        series1.getData().add(new XYChart.Data(13,67,7));
        series1.getData().add(new XYChart.Data(22,24));
        series1.getData().add(new XYChart.Data(24,12));
        series1.getData().add(new XYChart.Data(42,5));
        series1.getData().add(new XYChart.Data(45,5));
        series1.getData().add(new XYChart.Data(49,32));
        series1.getData().add(new XYChart.Data(50,44));

 series2.setName("Product_2");
//        add values
        series2.getData().add(new XYChart.Data(12,33));
        series2.getData().add(new XYChart.Data(13,23,7));
        series2.getData().add(new XYChart.Data(43,12));
        series2.getData().add(new XYChart.Data(23,43));
        series2.getData().add(new XYChart.Data(43,34));
        series2.getData().add(new XYChart.Data(12,33));
        series2.getData().add(new XYChart.Data(43,3));
        series2.getData().add(new XYChart.Data(11,41));

//        bubbleChart.getData().add(series1);
        bubbleChart.getData().addAll(series1,series2);

    }
}
