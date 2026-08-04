public class Route {

    private String startLocation;
    private String endLocation;
    private double totalDistance;

    public Route(String startLocation, String endLocation, double totalDistance) {
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.totalDistance = totalDistance;
    }

    public double getDistance() {
        return totalDistance;
    }

    public void showRoute() {
        System.out.println("\nRoute Information");
        System.out.println("----------------------");
        System.out.println("From : " + startLocation);
        System.out.println("To   : " + endLocation);
        System.out.println("Distance : " + totalDistance + " km");
    }
}