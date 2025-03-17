package services;

public class MozambiqueTaxService extends TaxService{

    @Override
    public double tax(double amount) {
        return amount * 0.3;
    }
}
