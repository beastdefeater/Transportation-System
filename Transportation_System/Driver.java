public class Driver {

    private String id;
    private String driverName;
    private Vehicle currentVehicle;

    public Driver(String id, String driverName) {
        this.id = id;
        this.driverName = driverName;
    }

    public void setVehicle(Vehicle vehicle) {
        currentVehicle = vehicle;
    }

    public String getDriverName() {
        return driverName;
    }

    public void showDriver() {
        System.out.println("\nDriver Details");
        System.out.println("----------------------");
        System.out.println("ID : " + id);
        System.out.println("Name : " + driverName);

        if (currentVehicle != null) {
            System.out.println("Assigned Vehicle : " + currentVehicle.getVehicleName());
        } else {
            System.out.println("Assigned Vehicle : None");
        }
    }
}