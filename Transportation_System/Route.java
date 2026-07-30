public class Route {

    private String source;
    private String destination;
    private double distance;

    public Route(String source, String destination, double distance) {
        this.source = source;
        this.destination = destination;
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void displayRoute() {
        System.out.println(source + " -> " + destination);
    }
}