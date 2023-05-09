import java.util.Scanner;

public class OperatorExam {
    public static void main(String[] args) {
        
        // 사용자에게 숫자를 하나 입력받아서
        // 그 입력받은 숫자의 구구단을 출력하는 프로그램을 만들어보세요.

        Scanner scan = new Scanner(System.in);
        int dan = scan.nextInt();

        for(int i = 1; i < 10; i++)
        {
            // System.out.println(dan + " * " + i + " = " + dan * i);
            System.out.printf("%d x %d = %d%n", dan, i, dan * i);
        }

    }
}