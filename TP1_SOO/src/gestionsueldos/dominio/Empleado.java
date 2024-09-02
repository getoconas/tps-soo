/**
 * @author mago
 */
package gestionsueldos.dominio;

public class Empleado {
	private int id;
	private int legajo;
	private String nombre;
	private int cantidad_hijos;
	private int antiguedad;
	
	/**
	 * Constructor clase Empleado
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
