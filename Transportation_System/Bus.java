public class Bus extends Vehicle {

    public Bus(String id, String model, int capacity) {
        super(id, model, capacity);
    }

    @Override
    public double calculateFare(double distance) {
        return 20; // Fixed fare
    }
}