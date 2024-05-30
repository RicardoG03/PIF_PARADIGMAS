package co.edu.poli.PIFparadigmas.modelo;

import java.util.*;

/**
 * 
 */
public class Profesor {

    /**
     * Default constructor
     */
    public Profesor() {
    }

    /**
     * 
     */
    private String asignatura;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String apellido;

    /**
     * 
     */
    private String especialidad;

    /**
     * 
     */
    private String id;

    /**
     * @param asignatura 
     * @param nombre 
     * @param apellido 
     * @param id 
     * @param disponibilidad
     */
    public void Profesor(String asignatura, String nombre, String apellido, String id, Disponibilidad disponibilidad) {
        // TODO implement here
    }

    /**
     * @param Docente 
     * @return
     */
    public String proporcionarDocente(String Docente) {
        // TODO implement here
        return "";
    }

	public Profesor(String asignatura, String nombre, String apellido, String especialidad, String id) {
		super();
		this.asignatura = asignatura;
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
		this.id = id;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Profesor [asignatura=" + asignatura + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", especialidad=" + especialidad + ", id=" + id + ", getAsignatura()=" + getAsignatura()
				+ ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + ", getEspecialidad()="
				+ getEspecialidad() + ", getId()=" + getId() + "]";
	}
    

}