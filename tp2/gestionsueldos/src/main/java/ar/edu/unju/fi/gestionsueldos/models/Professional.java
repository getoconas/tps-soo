package ar.edu.unju.fi.gestionsueldos.models;

import ar.edu.unju.fi.gestionsueldos.util.Amount;

public class Professional extends Employee {

    @Override
    public Double getRemunerative() {
        return Amount.BASIC_SALARY + Amount.DEGREE + getPaymentSeniority();
    }

    @Override
    public String toString() {
        return "ID " + getId() + " - LEGAJO " + getRecord() + " - NOMBRE " + getName() + " - SUELDO NETO " + String.format("%.2f",getRemunerative()) + "\n";
    }
}
