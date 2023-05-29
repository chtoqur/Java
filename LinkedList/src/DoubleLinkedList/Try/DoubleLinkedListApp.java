package DoubleLinkedList.Try;

public class DoubleLinkedListApp {
    public static void main(String[] args) {
        
        ListContainer lc = new ListContainer();

        lc.insertNode(new Node(10, "aaa"), 0);
        lc.insertNode(new Node(20, "bbba"), 1);
        lc.insertNode(new Node(30, "ccc"), 2);
        lc.insertNode(new Node(10, "aaa"), 8);
        // lc.insertNode(new Node(50, "ddd"), 0);
        // lc.insertNode(new Node(60, "eee"), 2);

        // lc.deleteNodeByValue("aaa", false);
        // lc.deleteNodeByValue("e", true);
        lc.printNodeList();
    }
}
