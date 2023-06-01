package exam4;

public class DBoxApp2 {
    public static void main(String[] args) throws Exception {
        
        DBox<Box<Apple>, Box<Banana>> dBox = new DBox<>();

        // way1
        dBox.set(new Box<Apple>(new Apple()), new Box<Banana>(new Banana()));
        System.out.println(dBox);

        // way2
        // Box<Apple> aBox = new Box<>();
        // Box<Banana> bBox = new Box<>();
        // dBox.set(aBox, bBox);
        // aBox.setContent(new Apple());
        // bBox.setContent(new Banana());
        // System.out.println(dBox);

    }
}
