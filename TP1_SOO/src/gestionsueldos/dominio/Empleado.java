/**
 * @author Gaston Toconas
 */
package gestionsueldos.dominio;

import gestionsueldos.util.Importes;

public abstract class Empleado {
	protected int id;
	protected int legajo;
	protected String nombre;
	protected int cantidad_hijos;
	protected int antiguedad;
	
	/**
	 * Constructor de la clase Empleado
	 * @param id
	 * @param legajo
	 * @param nombre
	 * @param cantidad_hijos
	 * @param antiguedad
	 * */
	public Empleado(int id, int legajo, String nombre, int cantidad_hijos, int antiguedad) {
		this.id = id;
		this.legajo = legajo;
		this.nombre = nombre;
		this.cantidad_hijos = cantidad_hijos;
		this.antiguedad = antiguedad;
	}

	/**
	 * 
	 * @return remunerativos bonificables
	 */
	public abstract double calcularRemunerativos();
	
	/**
	 * 
	 * @return pago por antiguedad
	 */
	public double calcularPagoPorAntiguedad() {
		return this.antiguedad * Importes.ANTIGUEDAD;
	}
		
	/**
	 * 
	 * @return pago por hijos a cargo
	 */
	public double calcularPagoPorHijoACargo() {
		return this.cantidad_hijos * Importes.HIJO_A_CARGO;
	}

	/**
	 * 
	 * @return descuentos realizados a los remunerativos bonificables
	 */
	public double calcularDescuentos() {
		return this.calcularRemunerativos() * Importes.DESCUENTO;
	}

	/**
	 * 
	 * @return sueldo neto a cobrar
	 */
	public double calcularSueldoNeto() {
		return this.calcularRemunerativos() + this.calcularPagoPorHijoACargo() - this.calcularDescuentos();
	}
		
	/**
	 * 
	 * @return informacion de la clase empleado
	 */
	public String toString() {
		return "***************\n" +
				"Legajo: " + this.legajo + " - Empleado: " + this.nombre + "\n";
				
	}
		
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the legajo
	 */
	public int getLegajo() {
		return legajo;
	}

	/**
	 * @param legajo the legajo to set
	 */
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the cantidad_hijos
	 */
	public int getCantidad_hijos() {
		return cantidad_hijos;
	}

	/**
	 * @param cantidad_hijos the cantidad_hijos to set
	 */
	public void setCantidad_hijos(int cantidad_hijos) {
		this.cantidad_hijos = cantidad_hijos;
	}

	/**
	 * @return the antiguedad
	 */
	public int getAntiguedad() {
		return antiguedad;
	}

	/**
	 * @param antiguedad the antiguedad to set
	 */
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
}
