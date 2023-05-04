public class Class {
    public static void main(String[] args) {
        
        // 원의 넓이와 둘레 구하기
        // 반지름을 입력받으면 원의 넓이, 둘레를 구하는 프로그램 구현

        Circle myCircle = new Circle(10);
        Circle myCircle2 = new Circle();
        myCircle2.setRadius(5);

        System.out.println(myCircle.getCircum());
        System.out.println(myCircle.getSize());

        System.out.println(myCircle2.getCircum());
        System.out.println(myCircle2.getSize());
    }
}
