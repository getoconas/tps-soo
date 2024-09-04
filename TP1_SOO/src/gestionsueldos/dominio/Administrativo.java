/**
 * @author Gaston Toconas
 */
package gestionsueldos.dominio;

import gestionsueldos.util.Importes;

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

	@Override
	public double calcularRemunerativos() {
		switch (this.categoria) {
			case 1:
				return this.obtenerCalculoCategoria(Importes.CATEGORIA_1);
			case 2:
				return this.obtenerCalculoCategoria(Importes.CATEGORIA_2);
			case 3:
				return this.obtenerCalculoCategoria(Importes.CATEGORIA_3);
			case 4:
				return this.obtenerCalculoCategoria(Importes.CATEGORIA_4);
			case 5:
				return this.obtenerCalculoCategoria(Importes.CATEGORIA_5);
			default:
				return Importes.SUELDO_BASICO + super.calcularPagoPorAntiguedad();
		}
	}
	
	/**
	 * 
	 * @param categoria
	 * @return remunerativos bonificables de acuerdo al tipo de categoria del empleado administrativo
	 */
	private double obtenerCalculoCategoria(double categoria) {
		return Importes.SUELDO_BASICO + categoria + super.calcularPagoPorAntiguedad();
	}
	
	/**
	 * 
	 * @return informacion de la clase administrativo
	 */
	@Override
	public String toString() {
		return super.toString() + 
				"Categoria: " + this.categoria + "\n" +
				"Sueldo Neto: $" + String.format("%.2f",this.calcularSueldoNeto());
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
