/**
 * @author mago
 */
package gestionsueldos.dominio;

import java.util.List;

public class Administrativo extends Empleado {
	private int categoria;
	
	/**
	 * Constructor de la clase Administrativo
	 * @param id
	 * @param legajo
	 * @param nombre
	 * @param cantidad_hijos
	 * @param antiguedad
	 */
	public Administrativo(int id, int legajo, String nombre, int cantidad_hijos, int antiguedad, int categoria) {
		super(id, legajo, nombre, cantidad_hijos, antiguedad);
		this.categoria = categoria;
	}

	/**
	 * 
	 * @return
	 */
	/*@Override
	public Double obtenerSalario() {
		return 0.0;
	}*/
	
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
	 * @return the categoria
	 */
	public int getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
}
