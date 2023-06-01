package clone;

public class RectangleApp {
    public static void main(String[] args) throws Exception {
        
        Rectangle rec1 = new Rectangle(10, 10, 5, 5);

        Point p1 = new Point(50, 20);
        Point p2 = new Point(10, 50);
        Rectangle rec2 = new Rectangle(p1, p2);

        System.out.println(rec1);
        System.out.println(rec2);


        // Rectangle rec2 = new Rectangle(5, 10, 10, 5);
        // int hash1 = rec1.hashCode();
        // int hash2 = rec2.hashCode();

        // if (rec1.equals(rec2))
        // {
        //     System.out.println("equals() : rec1과 rec2는 동등합니다.");
        // }
        // else
        // {
        //     System.out.println("equals() : rec1과 rec2는 동등하지 않습니다.");
        // }

        // if (hash1 == hash2)
        // {
        //     System.out.println("hashCode() : rec1과 rec2는 동일한 인스턴스입니다.");
        // }
        // else
        // {
        //     System.out.println("hashCode() : rec1과 rec2는 상이한 인스턴스입니다.");
        // }

        // Rectangle rec3 = null;
        
        // try
        // {
        //     rec3 = (Rectangle)rec1.clone();
        // }
        // catch (CloneNotSupportedException e)
        // {
        //     e.getStackTrace();
        // }

        // Rectangle rec4 = (Rectangle)rec1.clone();
        // System.out.println("rec3 : " + rec3);
        // System.out.println("rec4 : " + rec4);

        // // System.out.println(rec3.getCircum());
        // // System.out.println(rec3.getSize());
    }
}
