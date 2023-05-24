package Exam9_2;

public class AExample {
    public static void main(String[] args) {
        
        // A 객체 생성
        A a = new A();

        // A 객체 생성 이후 B 객체 생성

        // B 객체 생성
        A.B b = a.new B();
    }
}
