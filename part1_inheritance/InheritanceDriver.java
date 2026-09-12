public class InheritanceDriver {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500.00),
                new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700.00),
                new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25.00, 32.00),
                new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19.00, 47.00),
                new CommisionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000.00),
                new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000.00),
                new CommisionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000.00)
        };

        System.out.println("PART 1: INHERITANCE");
        System.out.println("====================");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
