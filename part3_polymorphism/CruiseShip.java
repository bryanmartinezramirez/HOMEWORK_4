public class CruiseShip extends Ship {
    private int maximumPassengers;

    public CruiseShip() {
        super();
    }

    public CruiseShip(String name, String yearBuilt, int maximumPassengers) {
        super(name, yearBuilt);
        setMaximumPassengers(maximumPassengers);
    }

    public int getMaximumPassengers() {
        return maximumPassengers;
    }

    public void setMaximumPassengers(int maximumPassengers) {
        if (maximumPassengers < 0) {
            throw new IllegalArgumentException("Maximum passengers cannot be negative.");
        }
        this.maximumPassengers = maximumPassengers;
    }

    @Override
    public void print() {
        System.out.printf(
                "Cruise ship name: %s | Maximum passengers: %d%n",
                getName(),
                maximumPassengers);
    }
}
