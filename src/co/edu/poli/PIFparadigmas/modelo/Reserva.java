package co.edu.poli.PIFparadigmas.modelo;

import java.util.*;

/**
 * 
 */
public class Reserva {

    /**
     * Default constructor
     */
    public Reserva() {
    }

    /**
     * 
     */
    private Estudiante estudiante;

    /**
     * 
     */
    private Horario horario;

    /**
     * 
     */
    private String id;

    /**
     * @param Reserva 
     * @return
     */
    public String gestionarReserva(String Reserva) {
        // TODO implement here
        return "";
    }

	public Reserva(Estudiante estudiante, Horario horario, String id) {
		super();
		this.estudiante = estudiante;
		this.horario = (Horario) horario;
		this.id = id;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Horario getHorario() {
		return (Horario) horario;
	}

	public void setHorario(Horario horario2) {
		this.horario = horario2;
	}

	public String getId() {
		return id;
	}

	public void setId(String i) {
		this.id = i;
	}

	@Override
	public String toString() {
		return "Reserva [estudiante=" + estudiante + ", horario=" + horario + ", id=" + id + ", getEstudiante()="
				+ getEstudiante() + ", getHorario()=" + getHorario() + ", getId()=" + getId() + "]";
	}
    
    

}