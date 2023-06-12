package Set.exam6_TreeSet;

import java.util.TreeSet;

public class Ex6_App {
    public static void main(String[] args) throws Exception {
        
        // TreeSet
        // 정렬, 검색, 유니크 등을 실현하기위한 자료구조
        TreeSet<Person> tSet = new TreeSet<>();
        
        tSet.add(new Person(20, "홍길동"));
        tSet.add(new Person(40, "이순신"));
        tSet.add(new Person(60, "최영"));

        for (Person p : tSet)
        {
            System.out.println(p);
        }
    }
}
