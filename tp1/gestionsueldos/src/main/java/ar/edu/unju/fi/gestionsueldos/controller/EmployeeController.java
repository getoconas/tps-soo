package ar.edu.unju.fi.gestionsueldos.controller;

import ar.edu.unju.fi.gestionsueldos.models.Employee;
import ar.edu.unju.fi.gestionsueldos.service.EmployeeService;

import java.util.List;

public class EmployeeController {
    EmployeeService employeeService = new EmployeeService();

    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    public List<Employee> getAllEmployeeSeniority(Integer year) {
        return employeeService.getAllEmployeeSeniority(year);
    }

    public String getTotalRemunerative(List<Employee> employees) {
        return String.format("%.2f", employeeService.getTotalRemunerative(employees));
    }

    public String getTotalDiscount(List<Employee> employees) {
        return String.format("%.2f", employeeService.getTotalDiscount(employees));
    }

    public String getTotalPaymentChildren(List<Employee> employees) {
        return String.format("%.2f", employeeService.getTotalPaymentChildren(employees));
    }

    public String getTotalSalary(List<Employee> employees) {
        return String.format("%.2f", employeeService.getTotalSalary(employees));
    }
}
