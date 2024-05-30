package co.edu.poli.PIFparadigmas.servicios;

import co.edu.poli.PIFparadigmas.modelo.Reserva;

public interface Operacion {
	/**
     * Método para crear una nueva nave espacial.
     * @param nav La nave espacial que se va a crear.
     * @return Un mensaje indicando el resultado de la operación de creación.
     */
    public String create(Reserva reserva);

    /**
     * Método para leer los detalles de una nave espacial específica.
     * @param id El identificador de la nave espacial que se desea leer.
     * @return La nave espacial correspondiente al identificador proporcionado.
     */
    public Reserva read(String id);

    /**
     * Método para actualizar los detalles de una nave espacial existente.
     * @param id El identificador de la nave espacial que se desea actualizar.
     * @param nav La nueva información de la nave espacial.
     * @return Un mensaje indicando el resultado de la operación de actualización.
     */
    public String update(String id, Reserva reserva);

    /**
     * Método para eliminar una nave espacial existente.
     * @param id El identificador de la nave espacial que se desea eliminar.
     * @return La nave espacial que ha sido eliminada.
     */
    public Reserva delete(String id);
    


}

