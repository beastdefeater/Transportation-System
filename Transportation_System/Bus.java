public class Bus extends Vehicle {

    public Bus(String regNo, String vehicleName, int seatCount) {
        super(regNo, vehicleName, seatCount);
    }

    @Override
    public double calculateCost(double distance) {
        return distance * 4;
    }
}