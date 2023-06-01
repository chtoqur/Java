package exam4;

public class DBoxApp {
    public static void main(String[] args) throws Exception {
        
        // left : int, right : string
        // 1, "apple"

        DBox<Integer, String> db1 = new DBox<Integer, String>();
        db1.set(1, "apple");
        System.out.println(db1);

        DBox<Integer, String> db2 = new DBox<>();
        db2.set(2, "banana");
        System.out.println(db2.toString());
        

    }
}
