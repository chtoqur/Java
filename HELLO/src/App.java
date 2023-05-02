// 클래스는 필수적인 존재. 어플리케이션이란 클래스의 집합이다.
public class App {
    // ■ main() 함수는 어플리케이션의 시작점이며 반드시 1개만 존재
    public static void main(String[] args) throws Exception {
        // ■ 주석

        // 주석을 붙이는 두가지 방식
        // 1. 라인주석 : // (슬래시 2개)
        // 2. 블록주석 : /* */
        //    블록주석은 거의 사용하지 않는다.
        
        // ■ 문장(statement)의 끝은 반드시 ;로 끝나야 한다.
        // JS는 자동으로 붙여줬지만 Java는 붙이지 않을 경우 error
        System.out.println("Hello, World!");

        // 미션 1 : 두 수를 더하는 코드를 구현해 봅시다.

        // 변수의 유한성 때문에 다음과 같이 나누어져있음

        // 1byte 정수 - byte (-128 ~ +127)
        byte a = 20;
        byte b = 20;
        System.out.println(a + b);
        
        // 2byte 정수 - short (-32000 ~ +32000)
        short c = 10;
        short d = 30;
        System.out.println(c + d);
        
        // 4byte 정수 - int (integer) (-21억 ~ +21억)
        int e = 10;
        int f = 20;
        System.out.println(e + f);

        // 8byte 정수 - long () 63bit = 2의 63승
        long g = 10000000000L;
        long h = 203040;
        System.out.println(g + h);

        // ---------------------------------------------
        
        // 4byte 실수 - float (해상도가 낮다)
        float i = 10.2f;
        float j = 4.0f;
        System.out.println(i + j);

        // 8byte 실수 - double (해상도가 높다)
        double k = 10.5;
        double l = 2.3;
        System.out.println(k + l);

        // 두 개의 수를 더할 때 서로 타입이 다른 경우,
        // 작은 타입을 큰 타입으로 묵시적 형변환(확장)하여 계산
        int val1 = 20;      // 4byte에 20이 들어있음
        short val2 = 30;    // 2byte에 30이 들어있음

        System.out.println(val1 + val2);

        // 진수에 따른 표기법
        // 16진수의 경우 0x를 숫자 앞에 붙여준다 (prefix)
        byte m = 0x10;
        byte n = 21;
        System.out.println(m + n); // 16 + 21 = 37

        // integer의 최대범위를 넘어서는 경우 또는 작은 값이라도 long형의 경우
        // L이라는 postfix (suffix)를 붙여준다.
        long o = 100000000L;
        long p = 30L;
        System.out.println(o + p);

        // 자바는 데이터타입데 대해 굉장히 업격함
        // 값 자체의 리터럴도 
    }
}
