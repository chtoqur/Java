public class Typecasting {
    public static void main(String[] args) {
        // 형변환 (type casting)
        // 자료형을 다른 자료형으로 변환하는 것
        // ▶ 1. 비상식적인 형변환은 있을 수 없음
        //      Non-primitive Type은 형변환에서 제외 (비원시끼리 or 비원시-원시끼리도 안됨)
        // ▶ 2. 명시적 형변환 : 비트 규칙이 유사하고 사이즈가 큰 것을 작은 것에 넣을 때
        //      타입을 선언해야 하기 때문에 '명시적', 문제가 생겨도 감내하는 경우
        // ▶ 3. 묵시적 형변환 : 비트 규칙이 유사하고 사이즈가 작은 것을 큰 것에 넣을 때
        //      작은 것을 큰 것에 넣는 문제가 되지 않는 로직. 묵시적으로 진행해도 상관없음

        // 자바의 데이터타입은 두 개가 존재함
        // 1. Primitive Type
        // 복합적인 구조가 아님. 쪼갤 수 없음
        // ex. byte, short, int, long, float, double, boolean, char
        
        // 2. Non-Primitive Type
        // 복합적 구조
        // ex. String, Class, Interface 등

        int v_int = 10;
        // 4byte가 2byte에 들어가는 것은 안됨. error.
        // short v_sho = v_int;

        // 명시적 캐스팅 (explicit type casting)
        // 강제로 끼워맞추는건 되지만, 언제 데이터가 손실될지 모르기 때문에 하지 말아야 함
        // 명시적 캐스팅 또한 상식의 범위 내에서 가능함(boolean > int 이런 경우는 X)
        short v_sho = (short)v_int;
        System.out.println(v_sho);

        // 작은 데이터를 큰 데이터에 넣는 것은 괜찮음
        short s1 = 1200;
        // 같은 정수끼리이기 때문에 비트스트림이 유사함. (int)생략해도 되는 이유
        int il = s1;
        System.out.println(il);

        float f1 = 3.14f;
        // float과 int는 4byte-4byte 사이즈는 맞지만 비트스트림 규칙이 완전히 다름
        // 이렇게 사용하는 경우는 error.
        // int li = f1; // error

        int li = (int)f1;
        System.out.println(li); // 3

        // int는 적당한 수준에서 묵시적 형변환이 가능함
        int fff = 4;
        float ef = fff;
        System.out.println(ef);

        // 형변환은 상식적인 수준에서 가능함을 명심할 것
    }
}
