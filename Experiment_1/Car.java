public class Car extends Vehicle {
    private Engine engine;

    public Car(String model) {
        super(model);
        this.engine = new Engine() {
            @Override
            public void startEngine() {
                System.out.println("Car engine started.");
            }

            @Override
            public void stopEngine() {
                System.out.println("Car engine stopped.");
            }
        };
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Model: " + model);
    }

    @Override
    public void startEngine() {
        engine.startEngine();
    }

    @Override
    public void stopEngine() {
        engine.stopEngine();
    }
}