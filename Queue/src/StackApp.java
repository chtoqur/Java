public class StackApp {
    public static void main(String[] args) throws Exception {

        Stack stack = new Stack(5);
        boolean res;
        int data;

        res = stack.push(10);
        res = stack.push(20);
        res = stack.push(30);

        data = stack.pop(); // 30
        data = stack.pop(); // 20
        data = stack.pop(); // 10
        data = stack.pop(); // 언더플로우
        System.out.println(data); // 정수의 최소값

        if (data == Stack.ERROR_STACK)
        {
            System.out.println("[ERROR]STACK ERROR");
        }
        
        // int[] data = new int [7];

        // int rear = 0;

        // while (true)
        // {
        //     // 반복 공식
        //     // (n + 1) % max
        //     // % 연산은 반복이다!
        //     rear = (rear + 1) % 7;

        //     System.out.println(rear);
        // }
    }
}
