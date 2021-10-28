package routePlannerUsingJDK8;

public class Route {
    private String from;
    private String to;
    private String distanceInKm;
    private String travelTime;
    private String typicalAirfare;

    //no-argument costructor(only for method calling)
    public Route() {

    }


    //parameterized constructor(passing data)
    public Route(String from, String to, String distanceInKm, String travelTime, String typicalAirfare) {
        this.from = from;
        this.to = to;
        this.distanceInKm = distanceInKm;
        this.travelTime = travelTime;
        this.typicalAirfare = typicalAirfare;
    }


    //getter-setter methods
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(String distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public String getTypicalAirfare() {
        return typicalAirfare;
    }

    public void setTypicalAirfare(String typicalAirfare) {
        this.typicalAirfare = typicalAirfare;
    }

    @Override
    public String toString() {
        return "Route{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", distanceInKm='" + distanceInKm + '\'' +
                ", travelTime='" + travelTime + '\'' +
                ", typicalAirfare='" + typicalAirfare + '\'' +
                '}';
    }
}