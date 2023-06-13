package Quiz.no10;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(new Student("blue", 96));
        treeSet.add(new Student("hong", 86));
        treeSet.add(new Student("white", 92));

        System.out.println("----- 점수 기준 정렬 -----");
        for (Student s : treeSet)
        {
            System.out.println(s);
        }

        Student student = treeSet.last();
        System.out.println("최고 점수: " + student.getScore());
        System.out.println("최고 점수를 받은 아이디: " + student.getId());
        
        System.out.println();
        System.out.println("----- 이름 기준 정렬 -----");
        
        TreeSet<Student> treeSet2 = new TreeSet<>(new CompareString());
        treeSet2.add(new Student("blue", 96));
        treeSet2.add(new Student("hong", 86));
        treeSet2.add(new Student("white", 92));

        for (Student s : treeSet2)
        {
            System.out.println(s);
        }
    }
}
