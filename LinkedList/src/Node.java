public class Node {

    // 저장소
    
    public int value;     // 내부 속성
    public Node next;     // 다음 노드 주소

    // 생성자
    public Node()
    {
        this.value = 0;
        this.next = null;
    }

    // 오버로딩 생성자
    public Node(int value)
    {
        this.value = value;
        this.next = null;
    }

    public Node getNext()
    {
        return next;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
