package com.example.javafx.login;

import javafx.application.Application;
import javafx.stage.Stage;

public class Startup extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		LoginController loginController = new LoginController();
		loginController.setStage(stage);
		loginController.show();
	}
	
}
