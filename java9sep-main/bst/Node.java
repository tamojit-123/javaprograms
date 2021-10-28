public class Node {

    //node value
    int data;

    //left and right node address
    Node left, right;

    public Node(int data) {

        this.data = data;
        left = right = null;
    }

    public int getData() {

        return data;
    }

}
