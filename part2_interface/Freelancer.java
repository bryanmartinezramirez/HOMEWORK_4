public class Freelancer implements Payable {
    private String firstName;
    private String lastName;
    private double hourlyRate;
    private double hoursWorked;

    public Freelancer(
            String firstName,
            String lastName,
            double hourlyRate,
            double hoursWorked) {
        setFirstName(firstName);
        setLastName(lastName);
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        validateNonNegative(hourlyRate, "Hourly rate");
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        validateNonNegative(hoursWorked, "Hours worked");
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayment() {
        double regularHours = Math.min(hoursWorked, 40.0);
        double overtimeHours = Math.max(hoursWorked - 40.0, 0.0);
        return (regularHours * hourlyRate)
                + (overtimeHours * hourlyRate * 1.5);
    }

    @Override
    public String getPayeeName() {
        return firstName + " " + lastName;
    }

    public void print() {
        System.out.printf(
                "Freelancer: %s | Payment: $%,.2f%n",
                getPayeeName(),
                calculatePayment());
    }

    private static void validateNonNegative(double value, String fieldName) {
        if (Double.isNaN(value) || Double.isInfinite(value) || value < 0) {
            throw new IllegalArgumentException(fieldName + " must be non-negative and finite.");
        }
    }
}
