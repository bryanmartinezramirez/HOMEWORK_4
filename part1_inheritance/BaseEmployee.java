public class BaseEmployee extends Employee {
    private double baseSalary;

    public BaseEmployee() {
        super();
    }

    public BaseEmployee(
            String firstName,
            String lastName,
            String socialSecurityNumber,
            double baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        setBaseSalary(baseSalary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary cannot be negative.");
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return String.format(
                "Base employee: %s | SSN: %s | Base salary: $%,.2f",
                getFullName(),
                getSocialSecurityNumber(),
                baseSalary);
    }
}
