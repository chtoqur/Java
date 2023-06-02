package exam9_WildCard;

public class WildCardApp {
    public static void main(String[] args) throws Exception {
        
        Box<Integer> iBox = new Box<>(10);
        Box<Double> dBox = new Box<>(11.0);
        Box<String> sBox = new Box<>("abc");

        BoxManager.printBox(iBox);
        BoxManager.printBox(dBox);
        // BoxManager.printBox(sBox);

    }
}
