package sample;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import sample.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable{
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button player2;
    @FXML
    private Button player3;
    @FXML
    private Button player4;

    @FXML
    private Label outputTextArea;

    public void initialize (URL url, ResourceBundle rb){

    }

    @FXML
    private void handleButtonACtion (ActionEvent actionEvent) throws IOException{
        Scene scene;
        Stage stage;
        Parent root;

        if (actionEvent.getSource() == btn1){
            stage = (Stage) btn1.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("Test.fxml"));

        }else{
            stage = (Stage) btn2.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        }
        scene = new Scene (root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void handleButtonAction1 (ActionEvent actionEvent) throws IOException{
        Stage stage;
        Parent root;

        outputTextArea.setText("Hey I am adding text");


        }

    @FXML
    private void PlayerHandler (ActionEvent actionEvent) throws IOException{
        Stage stage = new Stage();
        Scene scene;
        Parent root = FXMLLoader.load(getClass().getResource("Test.fxml"));
;
        if (actionEvent.getSource() == player2 || actionEvent.getSource() == player3 || actionEvent.getSource() == player4 ) {
            stage = (Stage) player2.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        }
        scene = new Scene (root);
        stage.setScene(scene);
        stage.show();
    }
}


