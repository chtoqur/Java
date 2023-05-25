import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionApp {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int value1 = 0;
        int value2 = 0;
        try
        {
            value1 = scan.nextInt();
            // 첫줄에서 문제가 생길경우 아래의 코드는 실행되지 않음
            // 이것 때문에 두번째 트라이문에서 에러가 생기는 것
            // 따라서 try문 밖에 변수 선언과 초기화 해두기
            value2 = scan.nextInt();

            // 예외가 발생될 가능성이 있는 코드
            System.out.println("result = " + (value1 / value2));
        }
        catch(InputMismatchException excp)
        {
            System.out.println("정수가 아닌 잘못된 값입니다. 프로그램을 종료합니다. : " +  excp.getMessage());
            scan.close();
            return;
        }
        catch(java.lang.ArithmeticException excp)
        {
            // java.lang.ArithmeticException의 참조값이 excp으로 넘어옴
            // ArithmeticException 예외가 발생했으니 처리해라.

            // 예외처리
            System.err.println("잘못된 값을 입력했습니다. : " + excp.getMessage());
            // 프로세스가 kill 당하지 않음
        }

        scan.close();
        System.out.println("Bye!");
    }
}
