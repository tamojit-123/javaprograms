public class MainJourneyPlanner {
    public static void main(String args[]) {

        JourneyPlanner planner = new JourneyPlanner();

        for (int i = 1; i < 5; i++) {
            planner.insertNode();
        }
        planner.forwardTraversal();

        planner.backwardTraversal();
    }
}
