package routePlannerUsingJDK8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RoutePlanner {

    List<Route> routeList = new ArrayList<>();

    public List<Route> displayRouteDetails(String fileName) throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String data = "";
            while ((data = bufferedReader.readLine()) != null) {
                String[] routeInfo = data.split(",");
                Route route = new Route();
                route.setFrom(routeInfo[0]);
                route.setTo(routeInfo[1]);
                route.setDistanceInKm(routeInfo[2]);
                route.setTravelTime(routeInfo[3]);
                route.setTypicalAirfare(routeInfo[4]);

                routeList.add(route);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return routeList;
    }

    public List<Route> showDirectFlights(List<Route> routeData, String city) {
        return routeData.stream().filter(r -> r.getFrom().equalsIgnoreCase(city)).collect(Collectors.toList());
    }

    public List<Route> sortDirectFlights(List<Route> directFlight) {
        return directFlight.stream().sorted((r1, r2) -> r1.getTo().compareToIgnoreCase(r2.getTo())).collect(Collectors.toList());
    }


}
