import javax.lang.model.util.ElementScanner14;

public class Queue2 {
    
    private int rear;
    private int front;
    private int maxSize;
    private int[] queueArray;
    public static final int EMPTY_QUEUE = Integer.MIN_VALUE;

    public Queue2()
    {
        this.rear = 0;
        this.front = 0;
        this.maxSize = 0;
        queueArray = null;
    }

    public Queue2(int maxSize)
    {
        this.rear = 0;
        this.front = 0;
        this.maxSize = maxSize;
        this.queueArray = new int[maxSize];
    }

    public boolean isEmpty()
    {
        // 뒤 코드는 무슨 의미?
        if ((front == rear)) // || (front + maxSize == rear))
        {
            return true;
        }
        return false;
    }

    public boolean isFull()
    {
        if(((rear + 1) % this.maxSize) == front)
        {
            return true;
        }
        else
        return false;
    }

    // rear 데이터 등록
    public boolean push(int num)
    {
        if(isFull() == true)
        {
            System.out.println("큐가 가득차있습니다.");
            return false;
        }
        
        else
        {
            queueArray[rear] = num;
            rear++;
            return true;
        }
    }

    // front 데이터 추출
    public int pop()
    {
        if (isEmpty() == true)
        {
            System.out.println("큐가 비어있습니다.");
            return EMPTY_QUEUE;
        }
        
        else
        {
            ++front;
            return queueArray[front] = 0;
        }
    }
}
