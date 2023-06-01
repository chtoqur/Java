package exam2;

public class Exam2App2 {
    public static void main(String[] args) throws Exception {
        
        Box<Apple> aBox = new Box<Apple>();
        Box<Banana> bBox = new Box<Banana>();

        // 슈가코드
        // Box<Apple> aBox = new Box<>();
        // Box<Banana> bBox = new Box<>();

        // aBox.set(new String("정성훈")); // Apple형이 아니므로 ERROR
        bBox.set(new Banana());

        Banana banana = bBox.get();
        System.out.println(banana);
    }
}
