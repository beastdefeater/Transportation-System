public class Trip {

    private Passenger passenger;
    private Driver driver;
    private Vehicle vehicle;
    private Route route;

    public Trip(Passenger passenger, Driver driver, Vehicle vehicle, Route route) {
        this.passenger = passenger;
        this.driver = driver;
        this.vehicle = vehicle;
        this.route = route;
    }

    public void displayTripDetails() {

        System.out.println("\n========== TRIP DETAILS ==========");

        passenger.showPassenger();
        driver.showDriver();
        vehicle.vehicleInfo();
        route.showRoute();

        double amount = vehicle.calculateCost(route.getDistance());

        System.out.println("\nTrip Cost : ₹" + amount);
    }

    public void beginJourney() {

        System.out.println("\nJourney Started Successfully...");
        vehicle.engineOn();
    }

    public void finishJourney() {

        vehicle.engineOff();
        System.out.println("Journey Completed.");
    }
}