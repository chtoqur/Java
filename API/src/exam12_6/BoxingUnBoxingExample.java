package exam12_6;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        // Boxing
        Integer obj = 100;
        // intValue() 메소드는 Integer 객체 내부의 int 값을 리턴한다.
        System.out.println("value: " + obj.intValue());

        // Unboxing
        int value = obj;
        System.out.println("value: " + value);

        // 연산 시 Unboxing
        int result = obj + 100;
        System.out.println("result: " + result);
    }
}
