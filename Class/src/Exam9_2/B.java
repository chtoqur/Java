package Exam9_2;

public class B {
    
    // 인스턴스 멤버 클래스
    class C
    {
        // 인스턴스 필드
        int field1 = 1;

        // 정적 필드(Java 17부터 허용)
        static int field2 = 2;

        // 생성자
        C()
        {
            System.out.println("C-생성자 실행");
        }

        // 인스턴스 메소드
        void method1()
        {
            System.out.println("B-method1 실행");
        }

        // 정적 메소드(Java 17부터 허용)
        static void method2()
        {
            System.out.println("B-method2 실행");
        }

        // 인스턴스 메소드
        void useC()
        {
            // C 객체 생성 및 인스턴스 필드 및 메소드 사용
            C c = new C();
            System.out.println(c.field1);
            c.method1();

            // C 클래스의 정적 필드 및 메소드 사용
            System.out.println(C.field2);
            C.method2();
        }

    }
}
