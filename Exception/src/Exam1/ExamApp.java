package Exam1;
import java.util.Scanner;

public class ExamApp {
    public static void main(String[] args) {

        String name;
        int age;
        int grade;
        int classNum;
        
        Scanner scan = new Scanner(System.in);
        System.out.printf("이름을 입력하세요. >");
        name = scan.nextLine();

        System.out.printf("나이를 입력하세요. >");
        try
        {
            age = Integer.parseInt(scan.nextLine());

            if ((age <= 0) || (age > 150))
            {
                throw new ReadAgeException();
            }

            System.out.printf("학년을 입력하세요. >");
            grade = Integer.parseInt(scan.nextLine());
    
            System.out.printf("반을 입력하세요. >");
            classNum = Integer.parseInt(scan.nextLine());

            Student student = new Student(name, age, grade, classNum);
            System.out.println("성공적으로 데이터를 전송하였습니다.");
        }
        catch (ReadAgeException excp)
        {
            System.out.println(excp.getMessage());
        }


    }
}
