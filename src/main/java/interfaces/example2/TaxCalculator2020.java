package interfaces.example2;

public class TaxCalculator2020 implements TaxCalculator {

    private double taxableIncome;

    public TaxCalculator2020(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override // Galima naudoti , galima nenaudoti. Good practice - naudoti.
    public double calculateTax() {
        return taxableIncome * 0.2; // gera praktika iskelti i static constanta arba i duombaze
    }
}
