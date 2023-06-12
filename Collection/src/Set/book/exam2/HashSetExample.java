package Set.book.exam2;

import java.util.Set;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        
        // HashSet 컬렉션 생성
        Set<Member> set = new HashSet<>();

        // Member 객체 저장
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));  // 동등 객체 미저장

        // 저장된 객체 수 출력
        System.out.println("저장된 객체 수 : " + set.size());
    }
}
