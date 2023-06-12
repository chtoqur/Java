package Set.book.exam1;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        
        // HashSet 컬렉션 생성
        Set<String> set = new HashSet<>();
        
        // 객체 저장
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java");    // 중복 불가능
        set.add("Spring");

        // 저장된 객체 수 출력
        System.out.println("총 객체수 : " + set.size());
    }
}
