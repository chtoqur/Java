package Set.exam5_TreeSet;
import java.util.Arrays;

public class TreeSetApp {
    public static void main(String[] args) {

        Student[] ar = new Student[] {
            new Student(3, "왕돈", "서울", "staff"),
            new Student(1, "홍시"),
            new Student(8, "이오", "서울", "staff"),
            new Student(4, "새우", "서울", ""),
            new Student(5, "보노", "서울", ""),
            new Student(2, "춘식", "서울", "leader"),
            new Student(6, "이서", "서울", ""),
            new Student(7, "동기", "서울", "staff"),
        };

        Arrays.sort(ar);

        for (int i = 0; i < ar.length; i++)
        {
            System.out.printf("%d %s %s\n", ar[i].getNumber(), ar[i].getName(), ar[i].getStaff());
        }
        
        // TreeSet<Integer> tree = new TreeSet<>();

        // tree.add(10);
        // tree.add(20);
        // tree.add(30);
        // tree.add(40);

        // System.out.printf("tree size = %d\n", tree.size());
        
        // Iterator<Integer> iter = tree.iterator();
        
        // while(iter.hasNext())
        // {
        //     System.out.println(iter.next());
        // }

        // System.out.println("---------");

        // TreeSet<Student> tSet = new TreeSet<>();
        // tSet.add(new Student(1, "홍시"));
        // tSet.add(new Student(2, "지우", "서울", "leader"));
        // tSet.add(new Student(3, "왕돈", "서울", "staff"));
        // tSet.add(new Student(4, "새우", "서울", ""));
        // tSet.add(new Student(5, "참치", "서울", ""));

        // System.out.printf("tSet size = %d\n", tSet.size());

        // Iterator<Student> iter2 = tSet.iterator();

        // while(iter2.hasNext())
        // {
        //     System.out.println(iter2.next());
        // }
    }
}
