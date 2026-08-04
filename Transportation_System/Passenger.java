public class Passenger {

    private String id;
    private String passengerName;

    public Passenger(String id, String passengerName) {
        this.id = id;
        this.passengerName = passengerName;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void showPassenger() {
        System.out.println("\nPassenger Details");
        System.out.println("----------------------");
        System.out.println("Passenger ID : " + id);
        System.out.println("Name : " + passengerName);
    }
}