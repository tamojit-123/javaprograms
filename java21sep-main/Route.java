
public class Route 
{
	private String from;
	private String to;
	private String distanceInKM;
	private String travelTime;
	private String typicalAirFare;

	public Route(){}

	public Route(String from, String to, String distanceInKM, String travelTime,String typicalAirFare)
	{
		this.from = from;
		this.to = to;
		this.distanceInKM = distanceInKM;
		this.travelTime = travelTime;
		this.typicalAirFare = typicalAirFare;

	}
	public String getFrom()
	{
		return from;
	}

	public void setFrom(String from)
	{
		this.from = from;
	}

	public String getTo()
	{
		return to;
	}

	public void setTo(String to)
	{
		this.to = to;
	}

	public String getDistanceInKM()
	{
		return distanceInKM;
	}

	public void setDistanceInKM(String distanceInKM)
	{
		this.distanceInKM = distanceInKM;
	}

	public String getTravelTime()
	{
		return travelTime;
	}

	public void setTravelTime(String travelTime)
	{
		this.travelTime = travelTime;
	}

	public String getTypicalAirFare()
	{
		return typicalAirFare;
	}

	public void setTypicalAirFare(String typicalAirFare)
	{
		this.typicalAirFare = typicalAirFare;
	}

	@Override
	public String toString()
	{
		return "Route [from=" + from + ", to=" + to + ", distanceInKM=" + distanceInKM + ", travelTime=" + travelTime
				+ ", typicalAirFare=" + typicalAirFare + "]";
	}

}