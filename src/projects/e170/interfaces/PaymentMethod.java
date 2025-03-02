package projects.e170.interfaces;

public interface  PaymentMethod {

    Double tax(Double n1);

    Double fee(Integer n2, Double n3);

}