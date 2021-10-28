import java.util.Scanner;

class LinkedList {
    Node start;

    LinkedList() {
        start = null;
    }

    public void insertData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the song names");
        String nodeData = sc.next();
        Node node = new Node(nodeData);
        if (start == null) {
            start = node;
        } else {
            Node tem;
            tem = start;
            while (tem.link != null) {
                tem = tem.link;
            }
            tem.link = node;
        }
    }

    public void traverse() {
        Node temp;
        int count = 0;
        for (temp = start; temp != null; temp = temp.link) {
            System.out.print(temp.data + "====");
            count++;

        }
        System.out.println("total no of names are: " + count);

    }

    public void delete(String data) {
        Node temp1, temp2;
        temp1 = temp2 = start;
        while (temp2 != null) {
            if (temp2.data.equals(data)) {
                temp1.link = temp2.link;
                temp2 = null;
                return;
            }
            temp1 = temp2;
            temp2 = temp2.link;
        }
    }

    public void search(String data) {
        Node temp;
        temp = start;
        while (temp != null) {
            if (temp.data.equals(data)) {
                System.out.println("given song is there");

            } else {
                System.out.println("given song is not there");
            }
            temp = temp.link;
        }
    }

}