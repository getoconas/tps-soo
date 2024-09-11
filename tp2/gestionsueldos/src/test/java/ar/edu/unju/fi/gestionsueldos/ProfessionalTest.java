package ar.edu.unju.fi.gestionsueldos;

import ar.edu.unju.fi.gestionsueldos.models.Professional;
import ar.edu.unju.fi.gestionsueldos.util.Amount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ProfessionalTest {
    private Professional p1, p2;

    @BeforeEach
    public void setUp() {
        System.out.println("Configurando SetUp...");
        p1 = new Professional();
        p2 = new Professional();
        newProfessional(p1, 1, 100, "JUAN PEREZ", 2, 10);
        newProfessional(p2, 2, 110, "LUIS DIAZ", 0, 0);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Limpiando variables...");
        p1 = null;
        p2 = null;
    }

    @Test
    public void getRemunerativeTest() {
        System.out.println("Calculando remunerativos...");
        Double result1 = Amount.BASIC_SALARY + Amount.DEGREE + (p1.getSeniority() * Amount.SENIORITY);
        assertEquals(result1, p1.getRemunerative());
        Double result2 = Amount.BASIC_SALARY + Amount.DEGREE + (p2.getSeniority() * Amount.SENIORITY);
        assertEquals(result2, p2.getRemunerative());
    }

    @Test
    public void getPaymentChildrenTest_WithChildren() {
        System.out.println("Calculando salario familiar...");
        Double result = p1.getChildren() * Amount.CHILD;
        assertEquals(result, p1.getPaymentChildren());
    }

    @Test
    public void getPaymentChildrenTest_NoChildren() {
        System.out.println("Calculando salario familiar...");
        assertEquals(0, p2.getPaymentChildren());
    }

    @Test
    public void getPaymentSeniority_WithSeniority() {
        System.out.println("Calculando antiguedad...");
        Double result = p1.getSeniority() * Amount.SENIORITY;
        assertEquals(result, p1.getPaymentSeniority());
    }

    @Test
    public void getPaymentSeniority_NoSeniority() {
        System.out.println("Calculando antiguedad...");
        assertEquals(0, p2.getPaymentSeniority());
    }

    @Test
    public void getDiscountTest() {
        System.out.println("Calculando descuentos...");
        Double result1 = p1.getRemunerative() * Amount.DISCOUNT;
        assertEquals(result1, p1.getDiscount());
        Double result2 = p2.getRemunerative() * Amount.DISCOUNT;
        assertEquals(result2, p2.getDiscount());
    }

    @Test
    public void getSalaryTest() {
        System.out.println("Calculando salario neto...");
        Double result1 = p1.getRemunerative() + p1.getPaymentChildren() - p1.getDiscount();
        assertEquals(result1, p1.getSalary());
        Double result2 = p2.getRemunerative() + p2.getPaymentChildren() - p2.getDiscount();
        assertEquals(result2, p2.getSalary());
    }

    private void newProfessional(Professional pro, Integer id, Integer record, String name, Integer children, Integer seniority) {
        pro.setId(id);
        pro.setRecord(record);
        pro.setName(name);
        pro.setChildren(children);
        pro.setSeniority(seniority);
    }
}
