package Exam8_8;

public class Example {
    public static void action(A a)
    {
        a.method1();
        if (a instanceof C)
        {
            C c = (C)a;
            // a instanceof C c
            c.method2();
        }
    }
    public static void main(String[] args) {
        action(new B());
        action(new C());
    }
}