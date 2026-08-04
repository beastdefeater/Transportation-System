public class Train extends Vehicle {

    public Train(String regNo, String vehicleName, int seatCount) {
        super(regNo, vehicleName, seatCount);
    }

    @Override
    public double calculateCost(double distance) {
        return 25 + (distance * 3);
    }
}