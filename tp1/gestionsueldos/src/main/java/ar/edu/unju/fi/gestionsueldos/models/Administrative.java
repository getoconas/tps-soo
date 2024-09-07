package ar.edu.unju.fi.gestionsueldos.models;

import ar.edu.unju.fi.gestionsueldos.util.Amount;
import lombok.*;

@Getter @Setter
public class Administrative extends Employee {
    private Integer category;

    @Override
    public Double getRemunerative() {
        return switch (getCategory()) {
            case 1 -> getPaymentCategory(Amount.CATEGORY1);
            case 2 -> getPaymentCategory(Amount.CATEGORY2);
            case 3 -> getPaymentCategory(Amount.CATEGORY3);
            case 4 -> getPaymentCategory(Amount.CATEGORY4);
            case 5 -> getPaymentCategory(Amount.CATEGORY5);
            default -> Amount.BASIC_SALARY + getPaymentSeniority();
        };
    }

    private Double getPaymentCategory(Double category) {
        return Amount.BASIC_SALARY + category + getPaymentSeniority();
    }

    @Override
    public String toString() {
        return "ID " + getId() + " - LEGAJO " + getRecord() + " - CATEGORIA " + getCategory() + " - NOMBRE " + getName() + " - SUELDO NETO " + String.format("%.2f",getRemunerative()) + "\n";
    }
}
