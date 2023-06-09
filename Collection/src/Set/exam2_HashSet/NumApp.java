package Set.exam2_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class NumApp {
    public static void main(String[] args) {
        
        HashSet<Num> set = new HashSet<>();

        set.add(new Num(45));
        set.add(new Num(23));
        set.add(new Num(634));
        set.add(new Num(3));
        set.add(new Num(45));   // set 불가능

        System.out.println(set.size()); // 5
        
        // set.size() = 5
        // 왜 이런 결과가 출력될까?

        System.out.println("--------------");

        Iterator iter = set.iterator();
        
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }

        System.out.println("--------------");
        
        for (Num n : set)
        {
            System.out.println(n);
        }

    }
}
