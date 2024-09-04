/**
 * @author Gaston Toconas
 */
package gestionsueldos.dominio;

import gestionsueldos.util.Importes;

public class Profesional extends Empleado {
	
	/**
	 * Constructor de la clase Profesional
	 * @param id
	 * @param legajo
	 * @param nombre
	 * @param cantidad_hijos
	 * @param antiguedad
	 * @param titulo
	 */
	public Profesional(int id, int legajo, String nombre, int cantidad_hijos, int antiguedad) {
		super(id, legajo, nombre, cantidad_hijos, antiguedad);
	}

	/**
	 * 
	 */
	@Override
	public double calcularRemunerativos() {
		return Importes.SUELDO_BASICO + Importes.TITULO + super.calcularPagoPorAntiguedad();
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return super.toString() + 
				"Sueldo Neto: $" + String.format("%.2f",this.calcularSueldoNeto());
	}
}
