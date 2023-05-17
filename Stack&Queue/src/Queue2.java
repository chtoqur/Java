import javax.lang.model.util.ElementScanner14;

public class Queue2 {
    // 방법1
    // % 연산자 응용
    
    private int rear;
    private int front;

    private int[] ar;
    private int size;
    private int count;      // 큐에 존재하는 데이터 개수

    public static final int EMPTY_QUEUE = Integer.MIN_VALUE;

    public Queue2()
    {
        this.rear = -1;
        this.front = -1;
        ar = null;
        this.size = 0;
        this.count = 0;
    }

    public Queue2(int size)
    {
        this.rear = -1;
        this.front = -1;
        this.ar = new int[size];
        this.size = size;
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
        this.rear = (this.rear + 1) % this.size;
        return this.rear;
    }

    public int getFront()
    {
        this.front = (this.front + 1) % this.size;
        return this.front;
    }

    // rear 데이터 등록
    public boolean enqueue(int num)
    {
        if(isFull() == true)
        {
            //수정 : println 빠져야한다.
            System.out.println("큐가 가득차있습니다.");
            return false;
        }

        rear = getRear();
        ar[rear] = num;
        count++;
        return true;

    }

    // front 데이터 추출
    public int dequeue()
    {
        if (isEmpty() == true)
        {
            System.out.println("큐가 비어있습니다.");
            return EMPTY_QUEUE;
        }

        front = getFront();
        count--;
        return ar[front];
    }

    public void printAll()
    {
        rear = getRear();
        front = getFront();

        if (count > 0)
        {
            if (rear > front)
            {
                int printCount;
                printCount = rear - front;
    
                for (int i = 0; i < printCount; i++)
                {
                    System.out.println(ar[front]);
                    front++;
                }
            }
            
            else if (front > rear)
            {
                // front > rear
                int frontCount;
                int printCount;
        
                frontCount = size - front;
                printCount = rear + frontCount;
        
                for (int i = 0; i < printCount; i++)
                {
                    if(front == size)
                    {
                        front = 0;
                    }
                    
                    System.out.println(ar[front]);
        
                    front++;
                }
            }

            // front = rear
            else
            {
                for (int i = 0; i < size; i++)
                {
                    if(front == size)
                    {
                        front = 0;
                    }

                    System.out.println(ar[front]);
        
                    front++;
                }
            }
        }
    }

    // public void printQueue()
    // {
    //     front = getFront();
    //     rear = getRear();

    //     if(rear > front)
    //     {
    //         for(int j = front; j < count; j++)
    //         {
    //             System.out.println(ar[front]);
    //             front++;
    //         }
    //     }
    //     else
    //     {
    //         for(int j = 0; j < count; j++)
    //         {
    //             System.out.println(ar[front]);
    //             front++;
    //             if(front ==size)
    //             {
    //                 front = 0;
    //             }
    //         }
    //     }
    // }
}
