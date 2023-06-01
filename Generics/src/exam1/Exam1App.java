package exam1;

public class Exam1App {
    public static void main(String[] args) throws Exception {
        
        // Adder 객체 생성, Integer = Wrapper Class
        // 마치 T의 자리에 Integer가 들어간 것처럼 가동됨
        Adder<Integer> add1 = new Adder<Integer>();

        add1.val1 = 10;
        add1.val2 = 20;

        System.out.println(add1.val1 + add1.val2);
        
        // T의 자리에 Double이 들어간 것처럼 가동됨
        Adder<Double> add2 = new Adder<Double>();

        add2.val1 = 10.3;
        add2.val2 = 29.2;

        System.out.println(add2.val1 + add2.val2);

    }
}