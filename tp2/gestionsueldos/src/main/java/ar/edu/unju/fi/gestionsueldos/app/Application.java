package ar.edu.unju.fi.gestionsueldos.app;

import ar.edu.unju.fi.gestionsueldos.controller.EmployeeController;
import ar.edu.unju.fi.gestionsueldos.models.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		Integer year = 5;
		EmployeeController employeeController = new EmployeeController();
		List<Employee> listEmployees = employeeController.getAllEmployee();
		List<Employee> listEmployeesSeniority = employeeController.getAllEmployeeSeniority(year);

		System.out.println(listEmployees.toString());

		System.out.println("EMPLEADO CON ANTIGUEDAD MAYOR A " + year);
		System.out.println(listEmployeesSeniority.toString());

		System.out.println("TOTALES ACUMULADOS");
		System.out.println("REMUNERATIVOS: " + employeeController.getTotalRemunerative(listEmployeesSeniority));
		System.out.println("SALARIO FAMILIAR: " + employeeController.getTotalPaymentChildren(listEmployeesSeniority));
		System.out.println("DESCUENTOS: " + employeeController.getTotalDiscount(listEmployeesSeniority));
		System.out.println("SUELDO NETO: " + employeeController.getTotalSalary(listEmployeesSeniority));
	}
}
