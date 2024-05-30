package co.edu.poli.PIFparadigmas.modelo;


import java.util.*;

/**
 * Clase que representa la disponibilidad de una entidad (por ejemplo, un profesor)
 * en los diferentes d�as de la semana.
 */
public class Disponibilidad {

	/**
     * Constructor por defecto
     */
    public Disponibilidad() {
    }

    /**
     * Disponibilidad el lunes
     */
    private boolean lunes;

    /**
     * Disponibilidad el martes
     */
    private boolean martes;

    /**
     * Disponibilidad el mi�rcoles
     */
    private boolean miercoles;

    /**
     * Disponibilidad el jueves
     */
    private boolean jueves;

    /**
     * Disponibilidad el viernes
     */
    private boolean viernes;
    /**
     * Disponibilidad el s�bado
     */
    private boolean sabado;

    /**
     * M�todo no implementado que parece destinado a configurar la disponibilidad de los d�as.
     * 
     * @param lunes     Disponibilidad el lunes
     * @param martes    Disponibilidad el martes
     * @param miercoles Disponibilidad el mi�rcoles
     * @param jueves    Disponibilidad el jueves
     * @param viernes   Disponibilidad el viernes
     * @param sabado    Disponibilidad el s�bado
     */
    public void lunes(boolean lunes, boolean martes, boolean miercoles, boolean jueves, boolean vierenes, boolean sabado) {
        // TODO implement here
    }

    /**
     * M�todo no implementado que parece destinado a proporcionar disponibilidad de un d�a espec�fico.
     * 
     * @param dia D�a espec�fico
     * @return Una cadena que representa la disponibilidad del d�a
     */
    public String proporcionarDisponibilidad(boolean dia) {
        // TODO implement here
        return "";
    }

	public Disponibilidad(boolean lunes, boolean martes, boolean miercoles, boolean jueves, boolean viernes,
			boolean sabado) {
		super();
		this.lunes = lunes;
		this.martes = martes;
		this.miercoles = miercoles;
		this.jueves = jueves;
		this.viernes = viernes;
		this.sabado = sabado;
	}

	public boolean isLunes() {
		return lunes;
	}

	public void setLunes(boolean lunes) {
		this.lunes = lunes;
	}

	public boolean isMartes() {
		return martes;
	}

	public void setMartes(boolean martes) {
		this.martes = martes;
	}

	public boolean isMiercoles() {
		return miercoles;
	}

	public void setMiercoles(boolean miercoles) {
		this.miercoles = miercoles;
	}

	public boolean isJueves() {
		return jueves;
	}

	public void setJueves(boolean jueves) {
		this.jueves = jueves;
	}

	public boolean isViernes() {
		return viernes;
	}

	public void setViernes(boolean viernes) {
		this.viernes = viernes;
	}

	public boolean isSabado() {
		return sabado;
	}

	public void setSabado(boolean sabado) {
		this.sabado = sabado;
	}

	@Override
	public String toString() {
		return "Disponibilidad [lunes=" + lunes + ", martes=" + martes + ", miercoles=" + miercoles + ", jueves="
				+ jueves + ", viernes=" + viernes + ", sabado=" + sabado + ", isLunes()=" + isLunes() + ", isMartes()="
				+ isMartes() + ", isMiercoles()=" + isMiercoles() + ", isJueves()=" + isJueves() + ", isViernes()="
				+ isViernes() + ", isSabado()=" + isSabado() + "]";
	}
	/**
     * M�todo toString que devuelve una representaci�n en cadena de la disponibilidad.
     */
    
    

}