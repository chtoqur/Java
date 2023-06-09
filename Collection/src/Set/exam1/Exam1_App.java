package Set.exam1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam1_App {
    public static void main(String[] args) {
        
        Set<String> set = new HashSet<>();

        set.add("abc");
        set.add("def");
        set.add("opq");

        System.out.println(set.size());

        set.add("abc");
        System.out.println(set.size());

        Iterator<String> iter = set.iterator();

        System.out.println("-------------------");
        
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}
