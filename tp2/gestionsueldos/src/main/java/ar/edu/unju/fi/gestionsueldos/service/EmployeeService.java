package ar.edu.unju.fi.gestionsueldos.service;

import ar.edu.unju.fi.gestionsueldos.models.Administrative;
import ar.edu.unju.fi.gestionsueldos.models.Employee;
import ar.edu.unju.fi.gestionsueldos.models.Professional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class EmployeeService {
    public List<Employee> listEmployees = new ArrayList<>();

    public EmployeeService() {
        addProfessional(1, 101, "MARTIN LOPEZ", 0, 0);
        addProfessional(2, 102, "MARIA MARTINEZ", 2, 3);
        addAdministrative(3, 103, "JOSE HEREDIA", 1, 4, 2);
        addAdministrative(4, 104, "NAHUEL VILLARUBIA", 3, 10, 5);
        addAdministrative(5, 105, "BELEN GOMEZ", 1, 5, 3);
        addProfessional(6, 106, "AGUSTIN FERNANDEZ", 0, 8);
        addProfessional(7, 107, "SERGIO BALCARCE", 2, 12);
    }

    public List<Employee> getAllEmployee() {
        return listEmployees;
    }

    public List<Employee> getAllEmployeeSeniority(Integer year) {
        List<Employee> list = new ArrayList<>();
        for (Employee e : listEmployees) {
            if (e.getSeniority() > year) {
                list.add(e);
            }
        }
        return list;
    }

    public Double getTotalRemunerative(List<Employee> employees) {
        double totalRemunerative = 0;
        for (Employee e : employees) {
            totalRemunerative += e.getRemunerative();
        }
        return totalRemunerative;
    }

    public Double getTotalDiscount(List<Employee> employees) {
        double totalDiscount = 0;
        for (Employee e : employees) {
            totalDiscount += e.getDiscount();
        }
        return totalDiscount;
    }

    public Double getTotalPaymentChildren(List<Employee> employees) {
        double totalPaymentChildren = 0;
        for (Employee e : employees) {
            totalPaymentChildren += e.getPaymentChildren();
        }
        return totalPaymentChildren;
    }

    public Double getTotalSalary(List<Employee> employees) {
        double totalSalary = 0;
        for (Employee e : employees) {
            totalSalary += e.getSalary();
        }
        return totalSalary;
    }

    private void addAdministrative(Integer id, Integer record, String name, Integer children, Integer seniority, Integer category) {
        Administrative administrative = new Administrative();
        administrative.setId(id);
        administrative.setRecord(record);
        administrative.setName(name);
        administrative.setChildren(children);
        administrative.setSeniority(seniority);
        administrative.setCategory(category);
        listEmployees.add(administrative);
    }

    private void addProfessional(Integer id, Integer record, String name, Integer children, Integer seniority) {
        Professional professional = new Professional();
        professional.setId(id);
        professional.setRecord(record);
        professional.setName(name);
        professional.setChildren(children);
        professional.setSeniority(seniority);
        listEmployees.add(professional);
    }
}
