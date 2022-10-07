package Tutorial.Charts.BarChart;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

	@FXML
	private BarChart<String, Integer> barChart;

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {

		XYChart.Series<String, Integer> series1 = new XYChart.Series();
		series1.setName("2003");
		series1.getData().add(new XYChart.Data("Austria", 2323));
		series1.getData().add(new XYChart.Data("Brazil", 4333));
		series1.getData().add(new XYChart.Data("France", 10000));
		series1.getData().add(new XYChart.Data("Italy", 35000));
		series1.getData().add(new XYChart.Data("USA", 12000));

		XYChart.Series<String, Integer> series2 = new XYChart.Series();
		series2.setName("2004");
		series2.getData().add(new XYChart.Data("Austria", 23223));
		series2.getData().add(new XYChart.Data("Brazil", 43333));
		series2.getData().add(new XYChart.Data("France", 104000));
		series2.getData().add(new XYChart.Data("Italy", 350200));
		series2.getData().add(new XYChart.Data("USA", 122000));

		barChart.getData().addAll(series1, series2);
	}
}
