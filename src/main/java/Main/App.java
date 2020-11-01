package Main;


import controller.CalcController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
	
	private CalcController controller;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		controller = new CalcController();
		
		Scene escena = new Scene(controller.getPantalla(), 320, 200);
		
		Stage stage = new Stage();
		stage.setTitle("Calculadora Compleja");
		stage.setScene(escena);
		stage.show();
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
