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

    public void startTrip() {

        System.out.println("Trip Started");

        route.displayRoute();

        vehicle.start();

        double fare = vehicle.calculateFare(route.getDistance());

        System.out.println("Passenger : " + passenger.getName());

        System.out.println("Fare : " + fare);
    }

    public void endTrip() {

        vehicle.stop();

        System.out.println("Trip Ended");
    }
}