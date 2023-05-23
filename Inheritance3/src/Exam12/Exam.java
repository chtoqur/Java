package Exam12;

public class Exam {

    public static void action(A a) {
        a.method1();
        if (a instanceof C c)
        {
            c.method2();
        }
    }

    public static void main(String[] args) {
        action(new A());
        action(new B());
        action(new C());
    }
}
