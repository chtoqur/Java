public class StackApp {
    public static void main(String[] args) throws Exception {

        Stack stack = new Stack(5);
        boolean res;
        int data;

        res = stack.push(10);
        res = stack.push(20);
        res = stack.push(30);
        res = stack.push(40);
        res = stack.push(50);

        // data = stack.pop(); // 30
        // data = stack.pop(); // 20
        // data = stack.pop(); // 10
        // data = stack.pop(); // 언더플로우
        // System.out.println(data); // 정수의 최소값

        // if (data == Stack.ERROR_STACK)
        // {
        //     System.out.println("[ERROR]STACK ERROR");
        // }

        stack.printAll();

    }
}
