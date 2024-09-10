package ar.edu.unju.fi.gestionsueldos;

import ar.edu.unju.fi.gestionsueldos.models.Administrative;
import ar.edu.unju.fi.gestionsueldos.util.Amount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdministrativeTest {
    private Administrative administrative;

    @BeforeEach
    public void setUp() {
        System.out.println("Configurando SetUp...");
        administrative = new Administrative();
        administrative.setId(2);
        administrative.setRecord(200);
        administrative.setName("MARIA GOMEZ");
        administrative.setChildren(2);
        administrative.setSeniority(3);
        administrative.setCategory(2);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Limpiando variables...");
        administrative = null;
    }

    @Test
    public void getRemunerativeTest() {
        Double result = Amount.BASIC_SALARY + Amount.CATEGORY2 + (3 * Amount.SENIORITY);
        assertEquals(result, administrative.getRemunerative());
    }

    @Test
    public void getPaymentChildrenTest() {
        Double result = 2 * Amount.CHILD;
        assertEquals(result, administrative.getPaymentChildren());
    }

    @Test
    public void getDiscountTest() {
        Double result = administrative.getRemunerative() * Amount.DISCOUNT;
        assertEquals(result, administrative.getDiscount());
    }

    @Test
    public void getSalaryTest() {
        Double result = administrative.getRemunerative() + administrative.getPaymentChildren() - administrative.getDiscount();
        assertEquals(result, administrative.getSalary());
    }
}
