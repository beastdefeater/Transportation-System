public abstract class Vehicle {

    private String vehicleId;
    private String model;
    private int capacity;

    public Vehicle(String vehicleId, String model, int capacity) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.capacity = capacity;
    }

    // Getters
    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void start() {
        System.out.println(model + " started.");
    }

    public void stop() {
        System.out.println(model + " stopped.");
    }

    // Abstract method (Abstraction)
    public abstract double calculateFare(double distance);

    public void displayInfo() {
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Model      : " + model);
        System.out.println("Capacity   : " + capacity);
    }
}