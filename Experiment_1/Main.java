public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Swift");
        car.displayInfo();
        car.startEngine();
        car.stopEngine();
        Vehicle truck = new Truck("Tata Signa");
        truck.displayInfo();
        truck.startEngine();
        truck.stopEngine();
        Vehicle bicycle = new Bicycle("Mach City");
        bicycle.displayInfo();
    }
}