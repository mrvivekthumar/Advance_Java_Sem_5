
public abstract class Vehicle implements Engine {

    protected String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public abstract void displayInfo();
}