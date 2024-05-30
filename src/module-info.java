module PIF_PARADIGMAS {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	opens co.edu.poli.PIFparadigmas.vista to javafx.graphics, javafx.fxml;
	opens co.edu.poli.PIFparadigmas.controlador to javafx.graphics, javafx.fxml;
}
