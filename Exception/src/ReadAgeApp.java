import java.util.Scanner;

public class ReadAgeApp {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        System.out.printf("나이를 입력하세요. >");
        int age = -1;

        try
        {
            age = scan.nextInt();

            if ((age < 0) || (age >= 150))
            {
                // throw = 예외를 던져라
                throw new ReadAgeException();

                // 위의 코드는 원래 JVM의 역할임
                // 그 역할을 프로그래머가 강제로 수행하는 것
                // 강제로 던진 후 catch문에서 이걸 받는 형식
            }
        }
        catch (ReadAgeException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.printf("나이는 %d살 입니다.\n", age);

        // 나이를 잘못입력했을 때 if-else문을 이용할수도 있지만,
        // if ((age < 0) || (age >= 150))
        // 예외처리를 통해 예외를 발생시키는 식으로 처리할 수 있음
    }
}
