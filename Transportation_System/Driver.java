public class Driver {

    private String driverId;
    private String name;

    // Object Reference
    private Vehicle assignedVehicle;

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
    }

    public void assignVehicle(Vehicle vehicle) {
        assignedVehicle = vehicle;
    }

    public void displayDriver() {

        System.out.println("Driver : " + name);

        if (assignedVehicle != null) {
            System.out.println("Vehicle : " + assignedVehicle.getModel());
        }
    }
}