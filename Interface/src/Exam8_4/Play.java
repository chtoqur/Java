package Exam8_4;

public class Play {

    public static void method(A a)
    {
        System.out.println("실행");
    }
    public static void main(String[] args) {
        
        method(new B());
        method(new C());
        method(new D());
        method(new E());
    }
}
