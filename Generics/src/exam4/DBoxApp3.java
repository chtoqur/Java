package exam4;

public class DBoxApp3 {
    public static void main(String[] args) {
        
        Box<Apple> aBox = new Box<>();
        aBox.set(new Apple());
        aBox.eatFruit();

        // 인터페이스 미구현 클래스는 타입 파라메터 제한, ERROR
        // Box<DokMushroom> dBox = new Box<>();

        System.out.println("-----------------");

        Box2<Integer> iBox = new Box2<Integer>();
        iBox.set(100);
        System.out.println(iBox.getIntValue());

        Box2<Double> dBox = new Box2<>();
        dBox.set(30.34);
        System.out.println(dBox.getIntValue());
    }
}
