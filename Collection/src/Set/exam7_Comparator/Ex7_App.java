package Set.exam7_Comparator;

import java.util.TreeSet;

public class Ex7_App {
    public static void main(String[] args) throws Exception {
        
        // TreeSet
        // 정렬, 검색, 유니크 등을 실현하기위한 자료구조
        TreeSet<Person> tSet = new TreeSet<>(new StringCompare());
        
        tSet.add(new Person(1, "박혁거세"));
        tSet.add(new Person(20, "홍길동"));
        tSet.add(new Person(40, "이순신"));
        tSet.add(new Person(60, "최영"));

        for (Person p : tSet)
        {
            System.out.println(p);
        }
    }
}
