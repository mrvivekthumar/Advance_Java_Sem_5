public abstract class Vehicle {

    protected String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public abstract void displayInfo();

    protected abstract void startEngine();

    protected abstract void stopEngine();
}