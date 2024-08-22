public class Truck extends Vehicle implements Engine {
    private Engine engine;

    public Truck(String model) {
        super(model);
        this.engine = new Engine() {
            @Override
            public void startEngine() {
                System.out.println("Truck engine started.");
            }

            @Override
            public void stopEngine() {
                System.out.println("Truck engine stopped.");
            }
        };
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck Model: " + model);
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