import java.util.Scanner;

public class ExceptionApp4 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        try
        {
            int val = scan.nextInt();
        }
        catch (Throwable e)
        {
            System.out.println("숫자를 입력하세요.");
            return;
        }
        catch (ArithmeticException e)
        {

        }
        
        // 예외가 발생하지 않더라도, 예외가 발생하더라도
        // 무조건 수행되어야 하는 코드 = finally
        finally
        {
            System.out.println("Close");
            scan.close();
        }
    }
}
