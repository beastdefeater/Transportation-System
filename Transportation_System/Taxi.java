public class Taxi extends Vehicle {

    public Taxi(String id, String model, int capacity) {
        super(id, model, capacity);
    }

    @Override
    public double calculateFare(double distance) {
        return 50 + (distance * 15);
    }
}