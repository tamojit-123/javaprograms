import java.util.Scanner;

public class JourneyPlanner {

    Node firstNode, lastNode;

    public JourneyPlanner() {

        firstNode = lastNode = null;
    }

    public void insertNode() {

        String nodeData;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the place: ");
        nodeData = scanner.next();

        Node currentNode = new Node(nodeData);

        if (firstNode == null) {
            firstNode = lastNode = currentNode;
        } else {
            lastNode.next = currentNode;
            currentNode.prev = lastNode;
            lastNode = currentNode;
        }
    }

    public void forwardTraversal() {

        for (Node temp = firstNode; temp != null; temp = temp.next) {

            System.out.print(temp.getPlace() + "======>");
        }
    }

    public void backwardTraversal() {

        for (Node temp = lastNode; temp != null; temp = temp.prev) {

            System.out.print(temp.getPlace() + "<======");
        }
    }
}
