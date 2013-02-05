package com.example.javafx.login;
 
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class LoginController {
	private Stage stage = null;
	
    @FXML
    private Text actionTarget;
    
    /**
     * 
     * @param stage  the JavaFX Stage bound to this controller class
     * @throws IOException
     */
    public void setStage(Stage stage) {
    	this.stage = stage;
    }
    
    public void show() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
		stage.setTitle("FXML welcome");
		stage.setScene(new Scene(root, 300, 275));
    	stage.show();
    }
    
    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) throws IOException {
    	LoginResultController controller = new LoginResultController();
    	controller.init(stage);
    	controller.show();
    }

}
