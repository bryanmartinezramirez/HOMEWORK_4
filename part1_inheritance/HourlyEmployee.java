public class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;

    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(
            String firstName,
            String lastName,
            String socialSecurityNumber,
            double wage,
            double hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        setWage(wage);
        setHoursWorked(hoursWorked);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0) {
            throw new IllegalArgumentException("Wage cannot be negative.");
        }
        this.wage = wage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours worked cannot be negative.");
        }
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return String.format(
                "HourlyEmployee: %s | SSN: %s | Wage: $%,.2f | Hours worked: %.2f",
                getFullName(),
                getSocialSecurityNumber(),
                wage,
                hoursWorked);
    }
}
