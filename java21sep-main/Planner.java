import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Planner
{
    public void display(List<Route> routeData)
    {
        System.out.format("%-20s %-20s %-20s %-20s %-20s\n","From", "To", "Distance in Km", "Travel Time", "Typical Air Fare");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        routeData.forEach(data->System.out.format("%-20s %-20s %-20s %-20s %-20s\n",data.getFrom(),data.getTo(),data.getDistanceInKM(),data.getTravelTime(),data.getTypicalAirFare()));
    }

    public List<Route> displayInfo(String fileName) throws FileNotFoundException, IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String line;
        String[] words;
        List<Route> routeList = new ArrayList<>();
        while((line = br.readLine()) != null)
        {
            words = line.split(",");
            Route obj = new Route();
            obj.setFrom(words[0]);
            obj.setTo(words[1]);
            obj.setDistanceInKM(words[2]);
            obj.setTravelTime(words[3]);
            obj.setTypicalAirFare(words[4]);
            routeList.add(obj);
        }
        return routeList;
    }

    public List<Route> showDirectFlights(List<Route> routeData, String city)
    {
        return routeData.stream().filter(obj->obj.getFrom().equalsIgnoreCase(city)).collect(Collectors.toList());
    }

    public List<Route> sortDirectFlights(List<Route> directFlight)
    {
        return directFlight.stream().sorted((obj1,obj2)-> obj1.getTo().compareToIgnoreCase(obj2.getTo())).collect(Collectors.toList());
    }

    public List<Route> showAllConnections(List<Route> routeData, String source, String destination)
    {
        List<Route> directFlight = showDirectFlights(routeData,source);
        List<Route> direct = directFlight.stream().filter(obj->destination.equalsIgnoreCase(obj.getTo().trim())).collect(Collectors.toList());
        display(direct);

        routeData.forEach(obj->);

        return null;
    }
}
