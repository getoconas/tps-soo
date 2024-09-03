/**
 * @author mago
 */
package gestionsueldos.dominio;

import java.util.List;
import gestionsueldos.util.Constantes;

public class Profesional extends Empleado {
	private boolean titulo;
	private double sueldo_neto;
	
	/**
	 * Constructor de la clase Profesional
	 * @param id
	 * @param legajo
	 * @param nombre
	 * @param cantidad_hijos
	 * @param antiguedad
	 * @param titulo
	 */
	public Profesional(int id, int legajo, String nombre, int cantidad_hijos, int antiguedad, boolean titulo) {
		super(id, legajo, nombre, cantidad_hijos, antiguedad);
		this.titulo = titulo;
	}
	
	/**
	 * 
	 * @param cantidad_hijos
	 * @param antiguedad
	 * @param titulo
	 */
	public void obtenerSalario(int cantidad_hijos, int antiguedad, boolean titulo) {
		if (cantidad_hijos > 0) {
			this.sueldo_neto = this.obtenerRemunerativos(antiguedad, titulo) + this.obtenerPagoPorHijoACargo(cantidad_hijos) - this.obtenerDescuentos(antiguedad, titulo);
		} else {
			this.sueldo_neto = this.obtenerRemunerativos(antiguedad, titulo) - this.obtenerDescuentos(antiguedad, titulo);
		}		
	}
	
	/**
	 * 
	 * @param antiguedad
	 * @param titulo
	 * @return
	 */
	private double obtenerRemunerativos(int antiguedad, boolean titulo) {
		if (titulo) {
			return Constantes.SUELDO_BASICO + Constantes.TITULO + this.obtenerPagoPorAntiguedad(antiguedad) ;
		} else {
			return Constantes.SUELDO_BASICO + this.obtenerPagoPorAntiguedad(antiguedad) ;
		}
	}
	
	
	/**
	 * 
	 * @param antiguedad
	 * @param titulo
	 * @return
	 */
	private double obtenerDescuentos(int antiguedad, boolean titulo) {
		return this.obtenerRemunerativos(antiguedad, titulo) * Constantes.DESCUENTO;
	}
	
	/**
	 * 
	 * @return
	 */
	@Override
	public String toString() {
		return "";
	}
	
	/**
	 * 
	 * @param anio
	 * @return
	 */
	@Override
	public List mostrarEmpleadoAntiguedad(int anio) {
		return null;	
	}
	
	/**
	 * @return the titulo
	 */
	public boolean isTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(boolean titulo) {
		this.titulo = titulo;
	}	
}
