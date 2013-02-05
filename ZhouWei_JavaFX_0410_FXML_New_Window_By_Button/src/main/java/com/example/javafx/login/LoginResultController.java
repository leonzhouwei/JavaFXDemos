package com.example.javafx.login;
 
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class LoginResultController {
	private Stage stage = null;
    
    /**
     * 
     * @param stage  the JavaFX Stage bound to this controller class
     * @param parent  the necessary parent JavaFX Stage of the stage bound to this controller class
     * @throws IOException
     */
    public void init(Stage parent) throws IOException {
    	stage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("login_result.fxml"));
		stage.setTitle("This is a new window created by code");
		stage.setScene(new Scene(root, 400, 300));
		stage.initOwner(parent);
    }
    
    public void show() {
    	stage.show();
    }
    
}
