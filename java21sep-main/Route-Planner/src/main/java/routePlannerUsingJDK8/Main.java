package routePlannerUsingJDK8;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "src\\main\\resources\\routePlanner.csv";
        RoutePlanner plannerObj = new RoutePlanner();

        System.out.println("==================Task 1==================================");
        List<Route> routes = plannerObj.displayRouteDetails(fileName);
        routes.forEach(System.out::println);

        System.out.println("==================Task 2==================================");
        List<Route> directFlight = plannerObj.showDirectFlights(routes, "Delhi");
        directFlight.forEach(System.out::println);

        System.out.println("==================Task 3==================================");
        List<Route> sortFight = plannerObj.sortDirectFlights(directFlight);
        sortFight.forEach(System.out::println);
    }
}
