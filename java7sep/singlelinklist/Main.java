class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 5; i++) {
            list.insertData();
        }
        list.traverse();
        list.delete("believer");
        list.traverse();
        list.search("lifeisbeautiful");
    }
}