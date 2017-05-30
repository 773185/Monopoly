package monopoly;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
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
import javafx.scene.control.TextField;
import static javafx.scene.paint.Color.*;

public class FXMLController implements Initializable {

    @FXML
    private TextField textField;

    @FXML
    private Button okButton;

    @FXML
    private Button player2;
    @FXML
    private Button player3;
    @FXML
    private Button player4;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Todo
    }

    @FXML
    public void okClicked() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
        Parent root = loader.load();
        GameController gameController = loader.getController();
        gameController.setName(textField.getText());
        okButton.getScene().setRoot(root);
    }

//    @FXML
//    private void inputField(ActionEvent actionEvent) throws IOException {
//        if (actionEvent.getSource() == input || actionEvent.getSource() == btn1) {
//            text = input.getText();
//            work = text;
//            outputTextArea.setText(text);
//            outputTextArea.setTextFill(RED);
//
//        }
//    }
//
//    @FXML
//    private void replace(ActionEvent actionEvent) throws IOException {
//        if (actionEvent.getSource() == btn3) {
//            System.out.println(outputTextArea.getText());
//            //outputTextArea.setText("YOU SUCK AT CODING BOI!!!");
//            outputTextArea.setTextFill(RED);
//            outputTextArea.setText(text);
//            
//        }
//    }
//
//    @FXML
//    private void buttonPlay(ActionEvent actionEvent) throws IOException {
//        Stage stage = new Stage();
//        Scene scene;
//        Parent root = FXMLLoader.load(getClass().getResource("User.fxml"));
//
//        if (actionEvent.getSource() == playMonopoly) {
//            stage = (Stage) playMonopoly.getScene().getWindow();
//            root = FXMLLoader.load(getClass().getResource("Game.fxml"));
//        }
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.setFullScreen(true);
//        stage.show();
//    }
//
//    @FXML
//    private void handleButtonACtion(ActionEvent actionEvent) throws IOException {
//        Scene scene;
//        Stage stage;
//        Parent root;
//
//        if (actionEvent.getSource() == btn1) {
//            stage = (Stage) btn1.getScene().getWindow();
//            root = FXMLLoader.load(getClass().getResource("Title.fxml"));
//
//        } else {
//            stage = (Stage) btn2.getScene().getWindow();
//            root = FXMLLoader.load(getClass().getResource("User.fxml"));
//        }
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.setFullScreen(true);
//        stage.show();
//    }
    
//From Menu to User (Needed)
    @FXML
    private void PlayerHandler(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        Scene scene;
        Parent root = FXMLLoader.load(getClass().getResource("Title.fxml"));

        if (actionEvent.getSource() == player2 || actionEvent.getSource() == player3 || actionEvent.getSource() == player4) {
            stage = (Stage) player2.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("UserInput.fxml"));
        }
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }
}
