import java.util.Scanner;

public class BinarySearchTree {
    Node root, parent;

    public BinarySearchTree() {
        root = parent = null;
    }

    public boolean searchNodePos(int searchValue) {
        Node temp;
        temp = root;

        while (temp != null) {
            if (temp.data == searchValue) {
                return false;
            }

            if (temp.data > searchValue) {
                parent = temp;
                temp = temp.left;
            } else {
                parent = temp;
                temp = temp.right;
            }
        }
        return true;
    }

    public void insertNode() {
        int value;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Value for Node:");
        value = scanner.nextInt();

        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return;
        }

        if (searchNodePos(value)) {
            if (parent.data > value) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }
        } else {
            System.out.println("\n === Duplicate Node Value === \n");

        }

    }

    public void inOrder(Node temp) {
        if (temp != null) {
            inOrder(temp.left);
            System.out.print(temp.data + "\t");
            inOrder(temp.right);
        }
    }

    public void preOrder(Node temp) {
        if (temp != null) {

            System.out.print(temp.data + "\t");
            preOrder(temp.left);
            preOrder(temp.right);
        }
    }

    public void postOrder(Node temp) {
        if (temp != null) {
            postOrder(temp.left);
            postOrder(temp.right);
            System.out.print(temp.data + "\t");
        }
    }

    public static void main(String[] arg) {
        BinarySearchTree objBST = new BinarySearchTree();

        objBST.insertNode();
        objBST.insertNode();
        objBST.insertNode();
        objBST.insertNode();
        objBST.insertNode();

        objBST.inOrder(objBST.root);
        objBST.preOrder(objBST.root);
        objBST.postOrder(objBST.root);

        if (objBST.searchNodePos(78)) {
            System.out.println("node found");
        } else {
            System.out.println("node not found");
        }
    }
}