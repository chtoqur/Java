import java.util.Arrays;
import java.util.Scanner;

public class Lotto3 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userInput = null;
        int userInputNum = 0;
        int lottoNum = 0;
        
        System.out.println("-----------------------------------");
        System.out.printf("로또를 몇 개 구매하시겠습니까? >");
        userInput = scan.nextLine();
        userInputNum = Integer.parseInt(userInput);
        
        Lotto lotto = new Lotto();
        int[][] myLotto = new int[userInputNum][6];
        lotto.setLotto(myLotto);
        lotto.randomLotto(myLotto);

        for (int i = 0; i < myLotto.length; i++)
        {
            // 오름차순 정렬
            Arrays.sort(myLotto[i]);
            // 출력
            System.out.println(Arrays.toString(myLotto[i]));
        }

        System.out.printf("%d개 구매 완료. 프로그램을 종료합니다.\n", userInputNum);
        System.out.println("-----------------------------------");
        
    }
}
