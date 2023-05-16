public class ListQueue {

    private Queue2 front;
    private Queue2 rear;

    public ListQueue()
    {
        this.front = null;
        this.rear = null;
    }

    // 큐가 비어있는지 확인
    public boolean empty()
    {
        return (front==null);
    }

    public void insert(Object item)
    {
        Queue2 node = new Queue2(item);

    }

}
