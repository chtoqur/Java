package clone;

public class RectangleApp {
    public static void main(String[] args) {
        
        Rectangle rec1 = new Rectangle(5, 10, 10, 5);
        Rectangle rec2 = new Rectangle(5, 10, 10, 5);
        int hash1 = rec1.hashCode();
        int hash2 = rec2.hashCode();

        System.out.println(rec1);
        System.out.println(rec2);

        if (rec1.equals(rec2))
        {
            System.out.println("동등합니다.");
        }
        else
        {
            System.out.println("동등하지 않습니다.");
        }

        if (hash1 == hash2)
        {
            System.out.println("동일한 인스턴스입니다.");
        }
        else
        {
            System.out.println("상이한 인스턴스입니다.");
        }

        Rectangle rec3 = null;
        
        try
        {
            rec3 = (Rectangle)rec1.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.getStackTrace();

        }

        System.out.println(rec3.getCircum());
        System.out.println(rec3.getSize());
        System.out.println(rec3.toString());
    }
}
