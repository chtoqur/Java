package exam12_3.hashset;
import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        Student s1 = new Student(1, "홍길동");
        hashSet.add(s1);
        System.out.println("저장된 객체 수: " + hashSet.size());

        Student s2 = new Student(1, "홍길동");
        hashSet.add(s2);
        // HashSet은 동등객체는 중복 저장하지 않음
        System.out.println("저장된 객체 수: " + hashSet.size());    // 1

        Student s3 = new Student(2, "홍길동");
        hashSet.add(s3);
        System.out.println("저장된 객체 수: " + hashSet.size());    // 1

    }
}
