public class FlightDetails {
    private String flightName;
    private  int flightNumber;
    private String flightDestination;
    private int passPortNo;
    private int FlightTime;


    public FlightDetails(String flightName, int flightNumber, String flightDestination, int passPortNo, int flightTime) {
        this.flightName = flightName;
        this.flightNumber = flightNumber;
        this.flightDestination = flightDestination;
        this.passPortNo = passPortNo;
        FlightTime = flightTime;
    }

    @Override
    public String toString() {
        return "FlightDetails{" +
                "flightName='" + flightName + '\'' +
                ", flightNumber=" + flightNumber +
                ", flightDestination='" + flightDestination + '\'' +
                ", passPortNo=" + passPortNo +
                ", FlightTime=" + FlightTime +
                '}';
    }
}
