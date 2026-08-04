public class App {

    public static void main(String[] args) {

        // -------- TAXI --------

        Vehicle taxi = new Taxi("TX-101", "Toyota Innova", 4);

        Driver taxiDriver = new Driver("D01", "John");
        taxiDriver.setVehicle(taxi);

        Passenger passenger1 = new Passenger("P01", "Alice");

        Route route1 = new Route("Airport", "City", 15);

        Trip taxiTrip = new Trip(passenger1, taxiDriver, taxi, route1);

        taxiTrip.displayTripDetails();
        taxiTrip.beginJourney();
        taxiTrip.finishJourney();

        System.out.println("\n====================================");

        // -------- BUS --------

        Vehicle bus = new Bus("BS-201", "Tata Electric Bus", 40);

        Driver busDriver = new Driver("D02", "Ashish");
        busDriver.setVehicle(bus);

        Passenger passenger2 = new Passenger("P02", "Tom");

        Route route2 = new Route("Panaji", "Margao", 35);

        Trip busTrip = new Trip(passenger2, busDriver, bus, route2);

        busTrip.displayTripDetails();
        busTrip.beginJourney();
        busTrip.finishJourney();

        System.out.println("\n====================================");

        // -------- TRAIN --------

        Vehicle train = new Train("TR-301", "Rajdhani Express", 650);

        Driver trainDriver = new Driver("D03", "Rahul");
        trainDriver.setVehicle(train);

        Passenger passenger3 = new Passenger("P03", "David");

        Route route3 = new Route("Mumbai", "Goa", 590);

        Trip trainTrip = new Trip(passenger3, trainDriver, train, route3);

        trainTrip.displayTripDetails();
        trainTrip.beginJourney();
        trainTrip.finishJourney();

        System.out.println("\n====================================");

        // -------- AIRPLANE --------

        Vehicle airplane = new Airplane("AP-401", "Boeing 737", 180);

        Driver pilot = new Driver("D04", "Captain Smith");
        pilot.setVehicle(airplane);

        Passenger passenger4 = new Passenger("P04", "Emma");

        Route route4 = new Route("Goa", "Delhi", 1900);

        Trip flightTrip = new Trip(passenger4, pilot, airplane, route4);

        flightTrip.displayTripDetails();
        flightTrip.beginJourney();
        flightTrip.finishJourney();
    }
}