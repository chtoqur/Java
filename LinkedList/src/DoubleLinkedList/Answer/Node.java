package DoubleLinkedList.Answer;

public class Node {

    public static final int START = Integer.MIN_VALUE;
    public static final int END = Integer.MAX_VALUE;
    
    // 필드 영역
    private int key;
    private String value;
    private Node prev;
    private Node next;

    // 생성자 영역
    public Node()
    {
        key = 0;
        value = "";
        prev = null;
        next = null;
    }

    public Node(int key, String value)
    {
        this.key = key;
        this.value = value;
    }

    // Gettet, Setter
    public int getKey()
    {
        return this.key;
    }

    public void setKey(int key)
    {
        this.key = key;
    }

    public String getValue()
    {
        return this.value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public Node getPrev()
    {
        return this.prev;
    }

    public void setPrev(Node prev)
    {
        this.prev = prev;
    }

    public Node getNext()
    {
        return this.next;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

}
