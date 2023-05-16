public class QueueApp {
    public static void main(String[] args) {
        
    Queue2 myQueue = new Queue2(3);
    boolean res;

    int data;

    res = myQueue.push(10);
    res = myQueue.push(20);
    res = myQueue.push(30); // isFull true뜨는 이유 검사해야함
    res = myQueue.push(40);

    data = myQueue.pop(); // 30
    data = myQueue.pop(); // 20
    data = myQueue.pop(); // 10
    data = myQueue.pop(); // 언더플로우
    System.out.println(data); // 정수의 최소값
        
    }
}
