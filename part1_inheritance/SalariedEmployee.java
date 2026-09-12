public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee() {
        super();
    }

    public SalariedEmployee(
            String firstName,
            String lastName,
            String socialSecurityNumber,
            double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        setWeeklySalary(weeklySalary);
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0) {
            throw new IllegalArgumentException("Weekly salary cannot be negative.");
        }
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return String.format(
                "SalariedEmployee: %s | SSN: %s | Weekly salary: $%,.2f",
                getFullName(),
                getSocialSecurityNumber(),
                weeklySalary);
    }
}
