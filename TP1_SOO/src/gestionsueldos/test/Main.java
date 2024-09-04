/**
 * @author Gaston Toconas
 */
package gestionsueldos.test;

import java.util.ArrayList;

import gestionsueldos.dominio.Administrativo;
import gestionsueldos.dominio.Empleado;
import gestionsueldos.dominio.Profesional;

public class Main {

	public static void main(String[] args) {
		ArrayList<Empleado> empleados = new ArrayList<>();
		empleados.add(new Profesional(1, 101, "Martin Lopez", 0, 0));
		empleados.add(new Profesional(2, 102, "Maria Martinez", 2, 3));
		empleados.add(new Administrativo(3, 103, "Jose Heredia", 1, 4, 2));
		empleados.add(new Administrativo(4, 104, "Nahuel Villarubia", 3, 10, 5));
		empleados.add(new Administrativo(5, 105, "Belen Gomez", 1, 5, 3));
		empleados.add(new Profesional(6, 106, "Agustin Fernandez", 0, 8));
		
		System.out.println("EMPLEADOS CARGADOS");
		
		for(Empleado e : empleados) {
			System.out.println(e.toString());
		}
	}

}
