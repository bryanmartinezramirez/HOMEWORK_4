public class PolymorphismDriver {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("SS Horizon", "2010");
        ships[1] = new CruiseShip("Ocean Majesty", "2018", 2500);
        ships[2] = new CargoShip("Pacific Trader", "2015", 85000);

        System.out.println("PART 3: POLYMORPHISM");
        System.out.println("=====================");
        for (Ship ship : ships) {
            ship.print();
        }
    }
}
