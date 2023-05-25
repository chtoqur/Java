public class ExceptionApp3 {
    
    public static void func2(int val1, int val2) throws ArithmeticException
    {
        System.out.println("func2 start");
        // try {
            System.out.printf("나누기 연산 : %d\n", val1 / val2);
            
        // } catch (java.lang.ArithmeticException e) {
        //     System.out.println(e.getMessage());
        // }
        System.out.println("func2 end");
    }

    public static void func1(int val1, int val2)
    {
        System.out.println("func1 start");
        try {
            func2(val1, val2);
        } catch (java.lang.ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("func1 end");
    }

    public static void main(String[] args) {
        
        int val1 = 10;
        int val2 = 0;

        System.out.println("main start");
        // try {
            func1(val1, val2);
        // } catch (java.lang.ArithmeticException e) {
        //     System.out.println(e.getMessage());
        // }

        System.out.println("main end");
    }
}
