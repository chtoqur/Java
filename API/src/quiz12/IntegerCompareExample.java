package quiz12;

public class IntegerCompareExample {
    public static void main(String[] args) {

        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        // -128~127 범위의 값인 obj1과 obj2는 true
        System.out.println(obj1 == obj2);
        // 범위를 벗어난 obj3와 obj4는 false
        // 따라서 값만 비교하기 위해서는 equals 연산자를 이용한다
        System.out.println(obj3.equals(obj4));

    }
}
