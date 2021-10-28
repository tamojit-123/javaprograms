public class Node {

    String place;

    Node prev, next;

    public Node(String data) {

        place = data;
        prev = next = null;
    }

    public String getPlace() {
        return place;
    }
}