package exam2;

public class Exam2App {
    public static void main(String[] args) {

        AppleBox aBox = new AppleBox();
        BananaBox bBox = new BananaBox();
       
        // 박스에 넣기
        aBox.set(new Apple());
        bBox.set(new Banana());

        // 박스에서 꺼내기
        Apple apple = aBox.get();
        Banana banana = bBox.get();

        System.out.println(apple);
        System.out.println(banana);

        System.out.println("------------------");
        System.out.println("공통 박스 생성 후");
        System.out.println("------------------");

        Box cBox = new Box();
        Box dBox = new Box();

        cBox.set(new Apple());
        dBox.set(new Banana());

        // 캐스팅을 해줘야하는 단점이 생김
        Apple apple2 = (Apple)aBox.get();
        Banana banana2 = (Banana)bBox.get();

        System.out.println(apple2);
        System.out.println(banana2);

        // Object형 필드를 만들 경우 단점
        // 1. 꺼내는 메소드에서 강제 형변환 ==> 형변환의 위험성을 내포
        // 2. Object형은 그 어떤 객체도 다 참조가능 ==> 예외발생 (ClassCastException, NullPointerException)
    }
}
