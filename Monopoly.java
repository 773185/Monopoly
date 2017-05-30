/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author Ethan Ta
 */
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.Text;
import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.stage.*;
import javafx.scene.*;

public class Monopoly extends Application {

    Stage window;
    Scene scene1, scene2;
    Screen screen;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
public void start(Stage primaryStage) throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("Title.fxml"));
    primaryStage.setTitle("Monopoly '17 LE");
    primaryStage.setScene(new Scene(root, 2560,1440));
    primaryStage.setFullScreen(true);
    primaryStage.show();
}
}
