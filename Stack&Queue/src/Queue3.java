import javax.lang.model.util.ElementScanner14;

public class Queue3 {
    // 방법1
    // % 연산자 응용
    
    private int rear;
    private int front;

    private int[] ar;
    private int size;
    private int count;      // 큐에 존재하는 데이터 개수

    public static final int EMPTY_QUEUE = Integer.MIN_VALUE;

    public Queue3()
    {
        this.rear = -1;
        this.front = -1;
        ar = null;
        this.size = 0;
        this.count = 0;
    }

    public Queue3(int size)
    {
        this.rear = -1;
        this.front = -1;
        this.size = size;
        this.ar = new int[size];
        this.count = 0;
    }
    
    public int getCount()
    {
        return this.count;
    }

    public boolean isEmpty()
    {
        // 뒤 코드는 무슨 의미?
        if (getCount() == 0)
        {
            return true;
        }
        return false;
    }

    public boolean isFull()
    {
        if(getCount() == this.size)
        {
            return true;
        }
        return false;
    }

    public int getRear()
    {
        this.rear++;

        if (this.rear == this.size)
        {
            this.rear = 0;
            return this.rear;
        }

        return this.rear;
    }

    public int getFront()
    {
        this.front++;
        
        if (this.front == this.size)
        {
            this.front = 0;
            return this.front;
        }

        return this.front;
    }

    // rear 데이터 등록
    public boolean enqueue(int num)
    {
        if(isFull() == true)
        {
            System.out.println("큐가 가득차있습니다.");
            return false;
        }
        
        else
        {
            rear = getRear();
            ar[rear] = num;
            count++;
            return true;
        }
    }

    // front 데이터 추출
    public int dequeue()
    {
        if (isEmpty() == true)
        {
            System.out.println("큐가 비어있습니다.");
            return EMPTY_QUEUE;
        }
        
        else
        {
            front = getFront();
            count--;
            return ar[front];
        }
    }
}
