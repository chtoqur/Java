import javax.lang.model.util.ElementScanner14;

public class Queue2 {
    
    private int front;
    private int rear;
    private int maxSize;
    private Object[] queueArray;

    public Queue2()
    {
        this.front = 0;
        this.rear = -1;
    }

    public Queue2(int maxSize)
    {
        this.front = 0;
        this.rear = -1;
        this.maxSize = maxSize;
        this.queueArray = new Object[maxSize];
    }

    public boolean isEmpty()
    {
        return (front == rear + 1);
    }

    public boolean isFull()
    {
        return (rear == maxSize - 1);
    }

    // rear 데이터 등록
    public void insert (Object item)
    {
    }

    public boolean push(int num)
    {
        if(isFull() == false)
        {
            stackArray[++SP] = num;
            return true;
        }
        
        else
        {
            return false;
        }
    }

    // 데이터 빼기
    public int pop()
    {

        if (isEmpty() == false)
        {
            stackArray[SP] = 0;
            SP--;
            return 
        }

        else
        {

        }
        
    }


}
