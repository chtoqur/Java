package Set.exam4_quiz;

import java.util.HashSet;
import java.util.Iterator;

import Set.exam2_HashSet.Num;

public class NumApp {
    public static void main(String[] args) {
        
        // 1. Student 클래스를 완성
        // 2. 10명의 학생을 set에 입력
        // 3. iterator 이용해서 이쁘게 출력

        Student s1 = new Student(1, "연홍시", "11-11", "");
        Student s2 = new Student(2, "나왕돈", "22-22", "leader");
        Student s3 = new Student(3, "연홍시", "33-33", "");
        Student s4 = new Student(4, "홍길동", "44-44", "");
        Student s5 = new Student(5, "이지우", "55-55", "");
        Student s6 = new Student(6, "이쥰식", "66-66", "staff");
        Student s7 = new Student(7, "이오햄", "77-77", "staff");
        Student s8 = new Student(8, "보노보", "88-88", "staff");
        Student s9 = new Student(9, "돈까스", "99-99", "");
        Student s10 = new Student(10, "최이서", "10-10", "staff");

        Student s11 = new Student(2, "나왕돈", "22-22", "leader");
        Student s12 = new Student(7, "이오햄", "77-77", "staff");
        
        HashSet<Student> set = new HashSet<>();

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.add(s6);
        set.add(s7);
        set.add(s8);
        set.add(s9);
        set.add(s10);
        set.add(s11);
        set.add(s12);

        Iterator iter = set.iterator();

        for (Student s : set)
        {
            System.out.println(s);
        }

        System.out.printf("set size = %d\n", set.size());

    }
}
