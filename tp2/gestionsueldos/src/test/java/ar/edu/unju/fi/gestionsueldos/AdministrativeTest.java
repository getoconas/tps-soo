package ar.edu.unju.fi.gestionsueldos;

import ar.edu.unju.fi.gestionsueldos.models.Administrative;
import ar.edu.unju.fi.gestionsueldos.util.Amount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AdministrativeTest {
    private Administrative a1, a2, a3, a4, a5;

    @BeforeEach
    public void setUp() {
        System.out.println("Configurando SetUp...");
        a1 = new Administrative();
        a2 = new Administrative();
        a3 = new Administrative();
        a4 = new Administrative();
        a5 = new Administrative();
        newAdministrative(a1, 1, 100, "MARIA GOMEZ", 0, 0, 1);
        newAdministrative(a2, 2, 110, "MARTA MERCADO", 0, 0, 2);
        newAdministrative(a3, 3, 120, "LUCAS FERNANDEZ", 0, 0, 3);
        newAdministrative(a4, 4, 130, "MARCOS JUAREZ", 0, 0, 4);
        newAdministrative(a5, 5, 140, "PEDRO HUSARES", 0, 0, 5);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Limpiando variables...");
        a1 = null;
        a2 = null;
        a3 = null;
        a4 = null;
        a5 = null;
    }

    @Test
    public void getRemunerativeEqualsCategory1Test() {
        System.out.println("Calculando remunerativos...");
        Double result = Amount.BASIC_SALARY + Amount.CATEGORY1 + (a1.getSeniority() * Amount.SENIORITY);
        assertEquals(result, a1.getRemunerative());
    }

    @Test
    public void getRemunerativeEqualsCategory2Test() {
        System.out.println("Calculando remunerativos...");
        Double result = Amount.BASIC_SALARY + Amount.CATEGORY2 + (a2.getSeniority() * Amount.SENIORITY);
        assertEquals(result, a2.getRemunerative());
    }

    @Test
    public void getRemunerativeEqualsCategory3Test() {
        System.out.println("Calculando remunerativos...");
        Double result = Amount.BASIC_SALARY + Amount.CATEGORY3 + (a3.getSeniority() * Amount.SENIORITY);
        assertEquals(result, a3.getRemunerative());
    }

    @Test
    public void getRemunerativeEqualsCategory4Test() {
        System.out.println("Calculando remunerativos...");
        Double result = Amount.BASIC_SALARY + Amount.CATEGORY4 + (a4.getSeniority() * Amount.SENIORITY);
        assertEquals(result, a4.getRemunerative());
    }

    @Test
    public void getRemunerativeEqualsCategory5Test() {
        System.out.println("Calculando remunerativos...");
        Double result = Amount.BASIC_SALARY + Amount.CATEGORY5 + (a5.getSeniority() * Amount.SENIORITY);
        assertEquals(result, a5.getRemunerative());
    }

    @Test
    public void getSalaryTest() {
        System.out.println("Calculando salario neto...");
        Double r1 = a1.getRemunerative() + a1.getPaymentChildren() - a1.getDiscount();
        assertEquals(r1, a1.getSalary());

        Double r2 = a2.getRemunerative() + a2.getPaymentChildren() - a2.getDiscount();
        assertEquals(r2, a2.getSalary());

        Double r3 = a3.getRemunerative() + a3.getPaymentChildren() - a3.getDiscount();
        assertEquals(r3, a3.getSalary());

        Double r4 = a4.getRemunerative() + a4.getPaymentChildren() - a4.getDiscount();
        assertEquals(r4, a4.getSalary());

        Double r5 = a5.getRemunerative() + a5.getPaymentChildren() - a5.getDiscount();
        assertEquals(r5, a5.getSalary());
    }

    private void newAdministrative(Administrative adm, Integer id, Integer record, String name, Integer children, Integer seniority, Integer category) {
        adm.setId(id);
        adm.setRecord(record);
        adm.setName(name);
        adm.setChildren(children);
        adm.setSeniority(seniority);
        adm.setCategory(category);
    }
}
