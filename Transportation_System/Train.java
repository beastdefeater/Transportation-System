public class Train extends Vehicle {

    public Train(String id, String model, int capacity) {
        super(id, model, capacity);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 5;
    }
}