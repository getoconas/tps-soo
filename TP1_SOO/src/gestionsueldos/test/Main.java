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
		empleados.add(new Profesional(7, 107, "Sergio Balcarce", 2, 12));
		
		System.out.println("EMPLEADOS CARGADOS");
		System.out.println("---------------");
		System.out.println("PLANILLA DE EMPLEADOS");
		for(Empleado e : empleados) {
			System.out.println(e.toString());
		}
		
		int x = 5;
		double totalRemunerativos = 0, totalDescuentos = 0, totalSalarioFamiliar = 0, totalSueldoNeto = 0;
		System.out.println("---------------");
		System.out.println("EMPLEADOS CON ANTIGUEDAD MAYOR A " + x + " AÑOS");
		for(Empleado e : empleados) {
			if (e.getAntiguedad() > x) {
				System.out.println(e.toString());
				totalRemunerativos += e.calcularRemunerativos();
				totalDescuentos += e.calcularDescuentos();
				totalSalarioFamiliar += e.calcularPagoPorHijoACargo();
				totalSueldoNeto += e.calcularSueldoNeto();
			}
		}
		
		System.out.println("---------------");
		System.out.println("TOTALES ACUMULADOS");
		System.out.println("Remunerativos: $" + String.format("%.2f", totalRemunerativos));
		System.out.println("Salario Familiar: $" + String.format("%.2f", totalSalarioFamiliar));
		System.out.println("Descuentos: $" + String.format("%.2f", totalDescuentos));
		System.out.println("Sueldo Neto: $" + String.format("%.2f", totalSueldoNeto));
	}

}
