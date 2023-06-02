package exam9_WildCard;

public class BoxManager {

    public static void printBox(Box<? extends Number> box)
    {
        int value = box.get().intValue();
        System.out.println(value);
    }

    public static void printBox2(Box<? super Integer> box)
    {
        // int value = box.get();
        // System.out.println(value);
    }

}
