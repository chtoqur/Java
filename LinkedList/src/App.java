public class App {
    public static void main(String[] args) throws Exception {

        ListContainer lc = new ListContainer();

        lc.insertNode(new Node(10));
        lc.insertNode(new Node(20));
        lc.insertNode(new Node(30));
        
        // System.out.println(lc.getNode(0).value);
        
        System.out.printf("%d번째 노드의 값입니다.\n", lc.findNode(10));
        
        Node deleteNode = new Node(100);
        lc.insertNode(deleteNode);
        lc.printAll();
        lc.deleteNode(deleteNode);
        lc.printAll();
    }
}
