public class CommisionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public CommisionEmployee() {
        super();
    }

    public CommisionEmployee(
            String firstName,
            String lastName,
            String socialSecurityNumber,
            double commissionRate,
            double grossSales) {
        super(firstName, lastName, socialSecurityNumber);
        setCommissionRate(commissionRate);
        setGrossSales(grossSales);
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate < 0 || commissionRate > 1) {
            throw new IllegalArgumentException(
                    "Commission rate must be between 0 and 1.");
        }
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0) {
            throw new IllegalArgumentException("Gross sales cannot be negative.");
        }
        this.grossSales = grossSales;
    }

    @Override
    public String toString() {
        return String.format(
                "Commission employee: %s | SSN: %s | Commission rate: %.0f%% | Gross sales: $%,.2f",
                getFullName(),
                getSocialSecurityNumber(),
                commissionRate * 100,
                grossSales);
    }
}
