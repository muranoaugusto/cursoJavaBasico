package projects.e170.model;

import projects.e170.interfaces.PaymentMethod;

public class PayPalMethod implements PaymentMethod {

    @Override
    public Double tax(Double value) {
        return value + (value * 0.02);
        }

    @Override
    public Double fee(Integer parcelas, Double valor) {
        final Double TAXA_JUROS = 0.02;
            return valor + (valor * TAXA_JUROS * parcelas);
        }
}
