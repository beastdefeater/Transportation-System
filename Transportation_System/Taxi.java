public class Taxi extends Vehicle {

    public Taxi(String regNo, String vehicleName, int seatCount) {
        super(regNo, vehicleName, seatCount);
    }

    @Override
    public double calculateCost(double distance) {
        return 60 + (distance * 14);
    }
}