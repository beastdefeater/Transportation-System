public abstract class Vehicle {

    protected String regNo;
    protected String vehicleName;
    protected int seatCount;

    public Vehicle(String regNo, String vehicleName, int seatCount) {
        this.regNo = regNo;
        this.vehicleName = vehicleName;
        this.seatCount = seatCount;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void engineOn() {
        System.out.println(vehicleName + " engine started.");
    }

    public void engineOff() {
        System.out.println(vehicleName + " engine stopped.");
    }

    public void vehicleInfo() {
        System.out.println("\nVehicle Details");
        System.out.println("----------------------");
        System.out.println("Registration : " + regNo);
        System.out.println("Model        : " + vehicleName);
        System.out.println("Seats        : " + seatCount);
    }

    public abstract double calculateCost(double distance);
}