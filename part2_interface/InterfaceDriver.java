import java.util.ArrayList;

public class InterfaceDriver {
    public static void main(String[] args) {
        ArrayList<Payable> payables = new ArrayList<>();

        payables.add(new Freelancer("Ana", "Garcia", 25.00, 45.00));
        payables.add(new Freelancer("David", "Lee", 30.00, 36.00));
        payables.add(new VendorInvoice("Office Supplies Inc.", "INV-1001", 1250.75));
        payables.add(new VendorInvoice("Cloud Services LLC", "INV-1002", 499.99));

        double totalPayout = 0.0;

        System.out.println("PART 2: INTERFACE");
        System.out.println("=================");
        for (Payable payable : payables) {
            printPayable(payable);
            totalPayout += payable.calculatePayment();
        }

        System.out.printf("Total payout: $%,.2f%n", totalPayout);
    }

    private static void printPayable(Payable payable) {
        /*
         * Payable intentionally contains only the two required methods.
         * The assignment asks each concrete class to provide print(), so the
         * driver dispatches to that method after storing objects as Payable.
         */
        if (payable instanceof Freelancer) {
            ((Freelancer) payable).print();
        } else if (payable instanceof VendorInvoice) {
            ((VendorInvoice) payable).print();
        }
    }
}
