package co.edu.poli.PIFparadigmas.controlador;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import co.edu.poli.PIFparadigmas.modelo.Estudiante;
import co.edu.poli.PIFparadigmas.modelo.Horario;
import co.edu.poli.PIFparadigmas.modelo.Profesor;
import co.edu.poli.PIFparadigmas.modelo.Reserva;
import co.edu.poli.PIFparadigmas.servicios.ImplementacionOperacion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert.AlertType;

public class FormReserva {
	@FXML
	private Button buttonBorrarHorario;

	@FXML
	private Button buttonsalida;

	@FXML
	private Button ButtonRead;

	@FXML
	private Button buttonCrearHorario;

	@FXML
	private Button buttonCreate;

	@FXML
	private Button buttonDelete;

	@FXML
	private Button buttonUpdate;

	@FXML
	private DatePicker dttFecha;

	@FXML
	private TextField txtActualizador;

	@FXML
	private TextField txtApellido;

	@FXML
	private TextField txtApellidoProfesor;

	@FXML
	private TextField txtAsignatura;

	@FXML
	private TextField txtCedula;

	@FXML
	private ComboBox<Horario> txtComboBox;

	@FXML
	private TextField txtEspecialidad;

	@FXML
	private TextField txtFinalizacion;

	@FXML
	private TextField txtHoraInicio;

	@FXML
	private TextField txtIDReserva;

	@FXML
	private TextField txtIdProfesor;

	@FXML
	private TextField txtNombre;

	@FXML
	private TextField txtNombreProfesor;

	@FXML
	private void initialize() {
		// Cargar los horarios desde el archivo al iniciar la aplicación
		cargarHorariosDesdeComboBox();
	}

	private Reserva[] reserva;
	ImplementacionOperacion crud = new ImplementacionOperacion(reserva);

	private void guardarHorariosEnComboBox() {
		try {
			Properties propiedades = new Properties();
			for (int i = 0; i < txtComboBox.getItems().size(); i++) {
				Horario horario = txtComboBox.getItems().get(i);
				propiedades.setProperty("horario." + i + ".inicio", horario.getHoraInicio());
				propiedades.setProperty("horario." + i + ".fin", horario.getHoraFinalización());
				propiedades.setProperty("horario." + i + ".profesor.asignatura", horario.getProfesor().getAsignatura());
				propiedades.setProperty("horario." + i + ".profesor.nombre", horario.getProfesor().getNombre());
				propiedades.setProperty("horario." + i + ".profesor.apellido", horario.getProfesor().getApellido());
				propiedades.setProperty("horario." + i + ".profesor.especialidad",
						horario.getProfesor().getEspecialidad());
				propiedades.setProperty("horario." + i + ".profesor.id", horario.getProfesor().getId());
			}
			propiedades.store(new FileOutputStream("horarios.properties"), null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void cargarHorariosDesdeComboBox() {
		try {
			Properties propiedades = new Properties();
			propiedades.load(new FileInputStream("horarios.properties"));
			listaHorarios.clear();
			int i = 0;
			while (true) {
				String inicio = propiedades.getProperty("horario." + i + ".inicio");
				if (inicio == null) {
					break;
				}
				String fin = propiedades.getProperty("horario." + i + ".fin");
				String asignatura = propiedades.getProperty("horario." + i + ".profesor.asignatura");
				String nombre = propiedades.getProperty("horario." + i + ".profesor.nombre");
				String apellido = propiedades.getProperty("horario." + i + ".profesor.apellido");
				String especialidad = propiedades.getProperty("horario." + i + ".profesor.especialidad");
				String id = propiedades.getProperty("horario." + i + ".profesor.id");
				Profesor profesor = new Profesor(asignatura, nombre, apellido, especialidad, id);
				Horario horario = new Horario(inicio, fin, profesor, null);
				listaHorarios.add(horario);
				i++;
			}
			txtComboBox.setItems(listaHorarios);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	void pressCreate(ActionEvent event) {
		try {
			// La Creacion De Estudiante
			Estudiante estudiante = new Estudiante(null, null, 0);
			estudiante.setNombre(txtNombre.getText());
			estudiante.setApellido(txtApellido.getText());
			estudiante.setIdentificacion(Integer.parseInt(txtCedula.getText()));
			// La creacion de profesor
			Profesor profesor = new Profesor("Matematicas", "jose", "vasquez", "1025304550", null);
			// La creacion de un Horario
			Horario horario = new Horario("3:00pm", "6:00pm", profesor, null);
			// horario.setHoraInicio(null);
			// La Creacion De La Reserva
			Reserva A = new Reserva(null, null, null);
			A.setEstudiante(estudiante);
			A.setHorario(txtComboBox.getSelectionModel().getSelectedItem());
			A.setId(txtIDReserva.getText());

			crud.create(A);
			Alert a = new Alert(AlertType.INFORMATION);
			a.setContentText("se creo la Reserva de forma correcta en la fecha " + dttFecha.getValue());
			a.showAndWait();

		} catch (Exception e) {
			Alert a = new Alert(AlertType.INFORMATION);
			a.setContentText("Error al crear la Reserva: " + e.getMessage());
			a.showAndWait();
		}

	}

	@FXML
	void pressDelete(ActionEvent event) {
		try {
			crud.delete(txtIDReserva.getText());
			Alert a = new Alert(AlertType.INFORMATION);
			a.setContentText(
					"se ha borrado su nave: " + "y" + "la nave fue borrada en la fecha " + dttFecha.getValue());
			a.showAndWait();
		} catch (Exception e) {
			Alert a = new Alert(AlertType.INFORMATION);
			a.setContentText("NO existe tal nave " + e.getMessage());
			a.showAndWait();
		}
	}

	@FXML
	void PressUpdate(ActionEvent event) {
		try {
			// La Creacion De Estudiante
			Estudiante estudiante = new Estudiante(null, null, 0);
			estudiante.setNombre(txtNombre.getText());
			estudiante.setApellido(txtApellido.getText());
			estudiante.setIdentificacion(Integer.parseInt(txtCedula.getText()));
			// La creacion de profesor
			Profesor profesor = new Profesor("Matematicas", "jose", "vasquez", "1025304550", null);
			// La creacion de un Horario
			Horario horario = new Horario("3:00pm", "6:00pm", profesor, null);
			// La Creacion De La Reserva
			Reserva reserva = new Reserva(null, null, null);
			reserva.setEstudiante(estudiante);
			reserva.setHorario(txtComboBox.getSelectionModel().getSelectedItem());
			reserva.setId(txtIDReserva.getText());

			// Actualizar la reserva
			crud.update(txtActualizador.getText(), reserva);

			Alert a = new Alert(AlertType.INFORMATION);
			a.setContentText("La reserva se actualizó correctamente en la fecha " + dttFecha.getValue());
			a.showAndWait();
		} catch (Exception e) {
			Alert a = new Alert(AlertType.INFORMATION);
			a.setContentText("Error al actualizar la reserva: " + e.getMessage());
			a.showAndWait();
		}

	}

	@FXML
	void PressRead(ActionEvent event) {
		try {
			Reserva reserva = crud.read(txtIDReserva.getText());
			if (reserva != null) {
				StringBuilder sb = new StringBuilder();
				sb.append("Reserva:\n");
				sb.append("ID: ").append(reserva.getId()).append("\n");
				sb.append("Estudiante: ").append(reserva.getEstudiante().getNombre()).append(" ")
						.append(reserva.getEstudiante().getApellido()).append("\n");
				sb.append("Cédula: ").append(reserva.getEstudiante().getIdentificacion()).append("\n");
				sb.append("Horario:\n").append(txtComboBox.getSelectionModel().getSelectedItem());

				Alert a = new Alert(AlertType.INFORMATION);
				a.setContentText(sb.toString());
				a.showAndWait();
			} else {
				Alert a = new Alert(AlertType.INFORMATION);
				a.setContentText("No existe tal reserva");
				a.showAndWait();
			}
		} catch (Exception e) {
			Alert a = new Alert(AlertType.INFORMATION);
			a.setContentText("Error al leer la reserva: " + e.getMessage());
			a.showAndWait();
		}
	}

	private ObservableList<Horario> listaHorarios = FXCollections.observableArrayList();

	@FXML
	void pressCrearHorario(ActionEvent event) {
		// PROFESOR
		Profesor profesor = new Profesor(null, null, null, null, null);
		profesor.setAsignatura(txtAsignatura.getText());
		profesor.setNombre(txtNombreProfesor.getText());
		profesor.setApellido(txtApellidoProfesor.getText());
		profesor.setEspecialidad(txtEspecialidad.getText());
		profesor.setId(txtIdProfesor.getText());

		// HORARIO
		Horario horario = new Horario(txtHoraInicio.getText(), txtFinalizacion.getText(), profesor, null);

		// Agregar el nuevo horario a la lista
		listaHorarios.add(horario);

		// Actualizar el ComboBox con la lista de horarios
		txtComboBox.setItems(listaHorarios);
		Alert a = new Alert(AlertType.INFORMATION);
		a.setContentText("ya se creo su Horario: ");
		a.showAndWait();

		guardarHorariosEnComboBox();
	}

	@FXML
	void PressSalida(ActionEvent event) {
		buttonsalida.getText();
		Alert a = new Alert(AlertType.INFORMATION);
		a.setContentText("¡Hasta La Proxima!");
		a.showAndWait();
		System.exit(0);
	}

	@FXML
	private void PressBorrarHorario(ActionEvent event) {
	    String idProfesor = txtIdProfesor.getText();

	    // Eliminar los horarios del ComboBox que tengan el ID del profesor especificado
	    listaHorarios.removeIf(horario -> horario.getProfesor().getId().equals(idProfesor));
	    // Actualizar el ComboBox con la lista actualizada
	    txtComboBox.setItems(listaHorarios);

	    // Guardar los horarios actualizados en el archivo
	    guardarHorariosEnComboBox();
	    Alert a = new Alert(AlertType.INFORMATION);
		a.setContentText("se borro el horario con el id " + txtIdProfesor.getText());
		a.showAndWait();
	}

	@FXML
	void PressSalida2(MouseEvent event) {

	}

}
