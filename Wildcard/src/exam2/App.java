package exam2;
public class App {
    public static void main(String[] args) throws Exception {

        Box<Integer> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();

        box1.set(10);
        box2.set(30);

        System.out.println(box1.get());
        System.out.println(box2.get());

        System.out.println("---------move---------");

        BoxHandler.moveBox(box1, box2);

        System.out.println(box1.get());
        System.out.println(box2.get());

    }
}
