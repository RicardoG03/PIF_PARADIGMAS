package co.edu.poli.PIFparadigmas.modelo;

import java.util.*;

/**
 * Clase que representa a un estudiante.
 */
public class Estudiante {

	/**
     * Constructor por defecto.
     */
    public Estudiante() {
    }
    /**
     * Nombre del estudiante.
     */
    private String nombre;

    /**
     * Apellido del estudiante.
     */
    private String apellido;


    /**
     * Identificaci�n del estudiante.
     */
    private int identificacion;
    /**
     * M�todo no implementado que parece estar destinado a inicializar los atributos del estudiante.
     * 
     * @param nombre Nombre del estudiante.
     * @param apellido Apellido del estudiante.
     * @param identificacion Identificaci�n del estudiante.
     */
    public void Estudiante(String nombre, String apellido, int identificacion) {
        // TODO implement here
    }
    /**
     * M�todo no implementado que parece estar destinado a gestionar la informaci�n del estudiante.
     * 
     * @param estudiante Informaci�n del estudiante.
     * @return Una cadena de texto relacionada con la gesti�n del estudiante.
     */
    public String gestionarEstudiante(String estudiante) {
        // TODO implement here
        return "";
    }
    /**
     * Constructor que inicializa los atributos del estudiante.
     * 
     * @param nombre Nombre del estudiante.
     * @param apellido Apellido del estudiante.
     * @param identificacion Identificaci�n del estudiante.
     */
	public Estudiante(String nombre, String apellido, int i) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificacion = i;
	}
	 /**
     * Obtiene el nombre del estudiante.
     * 
     * @return Nombre del estudiante.
     */
	public String getNombre() {
		return nombre;
	}
	 /**
     * Establece el nombre del estudiante.
     * 
     * @param nombre Nombre del estudiante.
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
     * Obtiene el apellido del estudiante.
     * 
     * @return Apellido del estudiante.
     */
	public String getApellido() {
		return apellido;
	}
	/**
     * Establece el apellido del estudiante.
     * 
     * @param apellido Apellido del estudiante.
     */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	 /**
     * Obtiene la identificaci�n del estudiante.
     * 
     * @return Identificaci�n del estudiante.
     */
	public int getIdentificacion() {
		return identificacion;
	}
	/**
     * Establece la identificaci�n del estudiante.
     * 
     * @param identificacion Identificaci�n del estudiante.
     */
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	/**
     * Devuelve una representaci�n en cadena de la informaci�n del estudiante.
     * 
     * @return Una cadena de texto con la informaci�n del estudiante.
     */
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", identificacion=" + identificacion
				+ ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + ", getIdentificacion()="
				+ getIdentificacion() + "]";
	}
    
    

}