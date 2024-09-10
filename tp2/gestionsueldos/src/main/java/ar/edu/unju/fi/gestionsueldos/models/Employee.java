package ar.edu.unju.fi.gestionsueldos.models;

import ar.edu.unju.fi.gestionsueldos.util.Amount;
import lombok.*;

@Getter @Setter @NoArgsConstructor
@AllArgsConstructor @ToString
public abstract class Employee {
    private Integer id;
    private Integer record;
    private String name;
    private Integer children;
    private Integer seniority;

    public abstract Double getRemunerative();

    public Double getPaymentSeniority() {
        return seniority * Amount.SENIORITY;
    }

    public Double getPaymentChildren() {
        return children * Amount.CHILD;
    }

    public Double getDiscount() {
        return getRemunerative() * Amount.DISCOUNT;
    }

    public Double getSalary() {
        return getRemunerative() + getPaymentChildren() - getDiscount();
    }
}
