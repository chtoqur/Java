package exam1_AnonClass;

public class PrintApp {

    public static void printDocumnet(Printable p, String s)
    {
        p.print(s);
    }
    public static void main(String[] args) {
        
        
        Printer prn1 = new Printer();
        prn1.print("Printer");
        PrintApp.printDocumnet(prn1, "abc");

        
        // Printable 인터페이스 기능만 사용
        Printable prn2 = new Printer();
        prn2.print("Printable");
        
        // 익명 객체, Anonymous Object
        // 본래 규약(인터페이스)를 객체로 만들수는 없음
        // 하지만 익명클래스로 생성 후 구현부를 작성할 경우 가능
        // ==> 인터페이스를 익명 객체로 구현하는 것

        Printable prn3 = new Printable() {
            @Override
            public void print(String str)
            {
                System.out.println("출력물 : " + str);
            }
        };

        prn3.print("Anonymous Printer");

        // 익명 객체
        // 일종의 재정의, 클래스 전체를 재정의하는 것
        // ==> Printer 클래스 전체를 재정의 ==> 잘 사용하지 않음
        Printable prn4 = new Printer() {
            @Override
            public void print(String str)
            {
                System.out.println("출력물 : " + str);
            }
        };

        prn4.print("prn4");

        // 실제로는 객체지만, 마치 생략된 함수처럼 표현하는 방식
        // ==> 람다 표현식(Lambda Expression), 람다식
        Printable prn5 = (str) -> { System.out.println("람다식 : " + str); };
        prn5.print("prn5");
        PrintApp.printDocumnet((str) -> System.out.println("람다식 : " + str), "abc");

        // 한줄인 경우 {}를 생략할 수 있다.
        Printable prn6 = (str) -> System.out.println("람다식 : " + str);
        
        // 파라미터가 여러개인 경우 연속해서 작성할 수 있다.
        Scannable scn1 = (dpi, bColor)->{
            System.out.println("dpi = " + dpi);
            System.out.println("color = " + bColor);
        };

        // 파라미터가 없는 경우
        Terminatable tmt = ()->System.out.println("STOP");

        // 리턴값이 있는 경우의 람다식
        Addable add1 = (a, b)->{return a + b;};
        int c = add1.add(10, 20);           
        
        // 구현부 한 줄인 경우는 return도 생략 가능
        Addable add2 = (a, b)-> a + b;

        // 파라미터 한개인 경우 () 생략 가능
        Printable prn7 = str -> System.out.println("람다식 : " + str);

    
    }
}