import java.io.IOException;
import java.util.List;

public class PlannerImpl
{
    public static void main(String[] args) throws IOException
    {
        String fileName = "E:\\Shubham\\CoreJava\\MiniProjectJDK8\\src\\routes.csv";
        Planner plannerObj = new Planner();
        List<Route> routeData = plannerObj.displayInfo(fileName);
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println("................................................Available Routes...............................................");
        plannerObj.display(routeData);


        List<Route> directFlight = plannerObj.showDirectFlights(routeData,"Delhi");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println("................................................Direct Flights.................................................");
        plannerObj.display(directFlight);

        List<Route> sortFlight = plannerObj.sortDirectFlights(directFlight);
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println(".................................................Sorted Flights................................................");
        plannerObj.display(sortFlight);

        System.out.println(".................................................Direct Flight.................................................");
        List<Route> linkedFlight = plannerObj.showAllConnections(routeData, "Delhi", "London");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println(".................................................Linked Flights................................................");

    }
}
