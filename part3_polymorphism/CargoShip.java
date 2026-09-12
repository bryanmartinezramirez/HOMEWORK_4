public class CargoShip extends Ship {
    private int cargoCapacityTonnage;

    public CargoShip() {
        super();
    }

    public CargoShip(String name, String yearBuilt, int cargoCapacityTonnage) {
        super(name, yearBuilt);
        setCargoCapacityTonnage(cargoCapacityTonnage);
    }

    public int getCargoCapacityTonnage() {
        return cargoCapacityTonnage;
    }

    public void setCargoCapacityTonnage(int cargoCapacityTonnage) {
        if (cargoCapacityTonnage < 0) {
            throw new IllegalArgumentException("Cargo capacity cannot be negative.");
        }
        this.cargoCapacityTonnage = cargoCapacityTonnage;
    }

    @Override
    public void print() {
        System.out.printf(
                "Cargo ship name: %s | Cargo capacity: %d tons%n",
                getName(),
                cargoCapacityTonnage);
    }
}
