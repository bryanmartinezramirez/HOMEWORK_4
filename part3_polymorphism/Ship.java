public class Ship {
    private String name;
    private String yearBuilt;

    public Ship() {
    }

    public Ship(String name, String yearBuilt) {
        setName(name);
        setYearBuilt(yearBuilt);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void print() {
        System.out.printf("Ship name: %s | Year built: %s%n", name, yearBuilt);
    }
}
