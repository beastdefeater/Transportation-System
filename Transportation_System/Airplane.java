public class Airplane extends Vehicle {

    public Airplane(String regNo, String vehicleName, int seatCount) {
        super(regNo, vehicleName, seatCount);
    }

    @Override
    public double calculateCost(double distance) {
        return 500 + (distance * 12);
    }
}