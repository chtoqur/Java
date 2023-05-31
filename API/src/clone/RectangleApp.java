package clone;

public class RectangleApp {
    public static void main(String[] args) {
        
        // (equals) 동일한 위치에 동일한 크기로 존재하는 사각형은 생성X
        
        Rectangle rec1 = new Rectangle(5, 10, 10, 5);
        Rectangle rec2 = new Rectangle(5, 10, 10, 5);

        System.out.println(rec1);
        System.out.println(rec2);

        if (rec1.equals(rec2))
        {
            System.out.println("동등합니다.");
        }
        


        // Student st1 = new Student("jsh", 1);
        // st1.setScore(new int[]{80, 90, 100});

        // Student st2 = null;
        // try
        // {
        //     st2 = (Student)st1.clone();
        // }
        // catch (CloneNotSupportedException e)
        // {
        //     e.printStackTrace();
        // } 

        // System.out.println(st1);    // 80 90 100
        // st1.setScore(20, 20, 20);
        // System.out.println(st2);    // 20 20 20
        // System.out.println(st1);
    }
}
