import java.util.concurrent.Flow.Subscription;

public class QueueApp {
    public static void main(String[] args) {
        
    Queue2 myQueue = new Queue2(4);
    boolean res;

    int data;

    res = myQueue.enqueue(10);
    res = myQueue.enqueue(20);
    res = myQueue.enqueue(30);
    res = myQueue.enqueue(40);

    // // 오버플로우
    // res = myQueue.enqueue(50);     // 큐가 가득차있습니다.
    
    data = myQueue.dequeue();   
    // // // System.out.println(data);      // 10
    res = myQueue.enqueue(60);     // push 성공

    data = myQueue.dequeue();
    // // // System.out.println(data);       // 20
    data = myQueue.dequeue();
    // res = myQueue.enqueue(100);

    // System.out.println(data);       // 30
    data = myQueue.dequeue();                   // ERROR!!!!!!!!!!!!!!!!!!!
    // System.out.println(data);       // 40
    // data = myQueue.dequeue();
    // System.out.println(data);       // 60

    // 언더플로우
    // data = myQueue.dequeue();       // pop 실패

    // System.out.println(myQueue.getCount());
    myQueue.printAll();
    // myQueue.printQueue();
    }
}
