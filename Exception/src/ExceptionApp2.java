import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionApp2 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int value1 = 0;
        int value2 = 0;
        boolean bSuccess = false;
        double res;

        // 정상적인 숫자가 받아질 때까지 루프를 돌게하기
        do
        {
            System.out.println("value1 / value2 연산 : value1과 value2의 값을 입력하세요\n");
            System.out.printf("value1 > ");

            try
            {
                value1 = scan.nextInt();
                // 첫줄에서 문제가 생길경우 아래의 코드는 실행되지 않음
                // 이것 때문에 두번째 트라이문에서 에러가 생기는 것
                // 따라서 try문 밖에 변수 선언과 초기화 해두기
                System.out.printf("value2 > ");
                value2 = scan.nextInt();
    
                // 예외가 발생될 가능성이 있는 코드
                System.out.printf("result : %d\n", (value1 / value2));
                bSuccess = true;
            }
            catch(InputMismatchException excp)
            {
                scan.nextLine();
                System.out.printf("숫자를 입력하세요. : %s\n\n", excp.getMessage());
            }
            catch(java.lang.ArithmeticException excp)
            {
                scan.nextLine();

                // java.lang.ArithmeticException의 참조값이 excp으로 넘어옴
                // ArithmeticException 예외가 발생했으니 처리해라.
    
                // 예외처리
                System.err.printf("잘못된 값을 입력했습니다. 다시 입력하세요. : %s\n\n", excp.getMessage());
                // 프로세스가 kill 당하지 않음
            }
        } while(bSuccess == false);

        scan.close();
        System.out.printf("value1 = %d, value2 = %d\n", value1, value2);

        try
        {
            System.out.println("res = " + value1 / value2);
        }
        catch(ArithmeticException excp)
        {
            System.out.println("0으로 나올 수 없습니다.");
            return;
        }
        
        System.out.println("Bye!");
    }
}
