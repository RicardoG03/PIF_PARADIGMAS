package co.edu.poli.PIFparadigmas.vista;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			 TabPane root = (TabPane)FXMLLoader.load(getClass().getResource("/co/edu/poli/PIFparadigmas/vista/PIBparadigmas.fxml"));
	            Scene scene = new Scene(root);
				primaryStage.setScene(scene);
				primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
