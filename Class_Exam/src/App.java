import academy.Student;
// import academy.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Student 객체를 생성
        Student stu1 = new Student();
        Student stu2 = new Student("abc", "high", 3);

        int gr = stu2.getGrade();
        System.out.println(gr);

        // Student 객체에 값을 대입
        // stu1.name = "jsh";
        // stu1.school = "Hschool";
        // stu1.grade = 2;

        // Student 객체를 "초기화" 할수는 없을까? ==> 생성자를 통해 가능

    }
}
