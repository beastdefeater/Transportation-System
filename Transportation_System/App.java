public class App {

    public static void main(String[] args) {

        Vehicle taxi = new Taxi("T101", "Toyota Innova", 4);

        Driver driver = new Driver("D1", "John");
        driver.assignVehicle(taxi);

        Passenger passenger = new Passenger("P1", "Alice");

        Route route = new Route("Airport", "City", 15);

        Trip trip = new Trip(passenger, driver, taxi, route);

        trip.startTrip();

        trip.endTrip();




        Vehicle bus = new Bus("B1Y2", "Tata eBus", 30);
        Driver busDriver = new Driver("D14", "Ashish");
        Passenger passenger2 = new Passenger("P4", "Naveen");
        Route route2 = new Route("Panaji", "Margao", 35);
        Trip busTrip = new Trip(passenger2, busDriver, bus, route2);
        busTrip.startTrip();
        busTrip.endTrip();

    }
}