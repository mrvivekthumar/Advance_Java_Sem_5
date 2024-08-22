public class Bicycle extends Vehicle {

    public Bicycle(String model) {
        super(model);
    }

    @Override
    public void displayInfo() {
        System.out.println("Bicycle Model: " + model);
    }

    @Override
    protected void startEngine() {
        throw new UnsupportedOperationException("Unimplemented method 'startEngine'");
    }

    @Override
    protected void stopEngine() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stopEngine'");
    }
}