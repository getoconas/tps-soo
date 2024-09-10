package ar.edu.unju.fi.gestionsueldos;

import ar.edu.unju.fi.gestionsueldos.models.Professional;
import ar.edu.unju.fi.gestionsueldos.util.Amount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProfessionalTest {
    private Professional professional;

    @BeforeEach
    public void setUp() {
        System.out.println("Configurando SetUp...");
        professional = new Professional();
        professional.setId(1);
        professional.setRecord(100);
        professional.setName("JUAN PEREZ");
        professional.setChildren(1);
        professional.setSeniority(10);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Limpiando variables...");
        professional = null;
    }

    @Test
    public void getRemunerativeTest() {
        Double result = Amount.BASIC_SALARY + Amount.DEGREE + (10 * Amount.SENIORITY);
        assertEquals(result, professional.getRemunerative());
    }

    @Test
    public void getPaymentChildrenTest() {
        Double result = 1 * Amount.CHILD;
        assertEquals(result, professional.getPaymentChildren());
    }

    @Test
    public void getDiscountTest() {
        Double result = professional.getRemunerative() * Amount.DISCOUNT;
        assertEquals(result, professional.getDiscount());
    }

    @Test
    public void getSalaryTest() {
        Double result = professional.getRemunerative() + professional.getPaymentChildren() - professional.getDiscount();
        assertEquals(result, professional.getSalary());
    }

}
