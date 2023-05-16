import java.util.Arrays;
import java.util.Scanner;

public class LottoPrinter2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String temp = "";
        int inputCount = 0;
        int[] lottoNumber;

        // 싱글톤
        Lotto2 lotto = Lotto2.getInstance();
        
        System.out.println("-----------------------------------");
        System.out.printf("로또를 몇 개 구매하시겠습니까? >");
        temp = scan.nextLine();
        inputCount = Integer.parseInt(temp);

        
        for (int i = 0; i < inputCount; i++)
        {
            // 번호뽑기
            lottoNumber = lotto.getLottoNum();
            // 번호출력
            System.out.printf("%d, %d, %d, %d, %d, %d\n",
            lottoNumber[0], lottoNumber[1], lottoNumber[2],lottoNumber[3],lottoNumber[4], lottoNumber[5]);
        }

        System.out.println("-----------------------------------");
        
    }
}
