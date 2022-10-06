package Project.Browser;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

public class controller implements Initializable {

    @FXML
    private TextField textField;

    @FXML
    private WebView webView;

    private WebEngine engine;

    private String homePage;

    private double webZoom;

    private WebHistory history;

    @FXML
    void back(ActionEvent event) {
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();
        history.go(-1);
        textField.setText(entries.get(history.getCurrentIndex()).getUrl());
    }

    @FXML
    void displayHistory(ActionEvent event) {
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();
        for(WebHistory.Entry entry : entries){
//            System.out.println(entry);
            System.out.println(entry.getUrl()+" "+entry.getLastVisitedDate());
        }
    }

    @FXML
    void executeJS(ActionEvent event) {
        engine.executeScript("window.location = \"https://www.youtube.com\";");
    }

    @FXML
    void forward(ActionEvent event) {
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();
        history.go(1);
        textField.setText(entries.get(history.getCurrentIndex()).getUrl());
    }

    @FXML
    void loadPage() {
//        engine.load("https://"+textField.getText());
        engine.load("https://www.bing.com");
    }

    @FXML
    void enter(KeyEvent event) {
//        if(event.getCode()== KeyCode.ENTER){
//            engine.load("https://www.bing.com"+textField.getText());
//        }
    }

    @FXML
    void refreshPage(ActionEvent event) {
        engine.reload();
    }

    @FXML
    void zoomIn(ActionEvent event) {
        webZoom+=0.25;
        webView.setZoom(webZoom);
    }

    @FXML
    void zoomOut(ActionEvent event) {
        webZoom-=0.25;
        webView.setZoom(webZoom);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        engine = webView.getEngine();
        homePage = "www.google.com";
        textField.setText(homePage);
        webZoom = 1;
        loadPage();
    }
}
