package interfaces.example2;
/*
Rule - class should not worry about the calculator object instance.
This class should only use it.
We can inject implementations or dependencies via:
Constructor
Setters
Methods.
 */
public class TaxReport {
    private TaxCalculator2020 taxCalculator2020;
    private TaxCalculator taxCalculator;
    public TaxReport(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }
    public void showCalculatedTax() {
        double tax = taxCalculator.calculateTax();
        System.out.println(tax);
    }
}