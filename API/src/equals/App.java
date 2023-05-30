package equals;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("abc");
        System.err.println("abc");
        
        // Animal ani = new Animal(1, "노랭이", 5.6, "yellow");

        // System.out.println(ani.getId());
        // System.out.println(ani.getName());
        // System.out.println(ani.getWeight());
        // System.out.println(ani.getColor());

        // Member m1 = new Member("jsh", "정성훈", 50);
        // Member m2 = new Member("jsh", "정성훈", 50);
        // System.out.println(m1);

        // if (m1.equals(m2))
        // {
        //     System.out.println("같다");
        // }
        // System.out.println(m1.id());

        Student st1 = new Student("홍길동", 1);
        Student st2 = new Student("홍길동", 1);

        // System.out.println(st1);     // Student@372f7a8e
        
        // Animal ani1 = new Animal();
        // if (st1.equals(ani1))
        // {
        //     System.out.println("같다.");
        // }
        // else
        // {
        //     System.out.println("다르다");
        // }

    }
}
