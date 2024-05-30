package co.edu.poli.PIFparadigmas.servicios;

import java.io.*;
import java.util.*;

import co.edu.poli.PIFparadigmas.modelo.Reserva;

/**
 * la clase sirve para implementar los metodos en la clase
 * ImplementacionOperacion siendo implementada de la clase Operacion
 * 
 * @author juan esteban pulido jimenez
 * @since 24.04.2024
 */
public class ImplementacionOperacion implements Operacion {
	public Reserva[] arreglo;

	/**
	 * Constructor de la clase ImplementacionOperacion. Inicializa el arreglo de
	 * naves con un tamaño predeterminado de 3.
	 */
	public ImplementacionOperacion(Reserva[] nave) {
		this.arreglo = new Reserva[5];
	}

	@Override
	public String create(Reserva reserva) {
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] == null) {
				arreglo[i] = reserva;
				return "nave creada";
			}
		}

		Reserva[] nuevoArreglo = Arrays.copyOf(arreglo, arreglo.length * 2);
		nuevoArreglo[arreglo.length] = reserva;
		arreglo = nuevoArreglo;
		return "nave creada";
	}

	@Override
	public String update(String id, Reserva reserva) {
		for (int i = 0; i < arreglo.length; i++) {
			Reserva a = arreglo[i];
			if (a.getId().equals(id)) {
				arreglo[i] = reserva;
				return "nave actualizada";
			}
		}
		return "No se encontró la nave ";
	}

	@Override
	public Reserva read(String id) {
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i].getId().equals(id)) {
				return arreglo[i];

			}
		}
		return null;
	}

	
	
	
	@Override
	public Reserva delete(String id) {
		for (int i = 0; i < arreglo.length; i++) {
			Reserva n = arreglo[i];
			if (n != null && n.getId().equals(id)) {
				arreglo[i] = null;
				return n;
			}
		}
		return null;
	}

	public Reserva[] getArreglo() {
		return arreglo;
	}

	public void setArreglo(Reserva[] arreglo) {
		this.arreglo = arreglo;
	}

}
