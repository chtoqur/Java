package exam12_7;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.Flow.Subscription;

public class RandomExample {
    public static void main(String[] args) {
        
        int[] selectNumber = new int[6];
        Random random = new Random(3);
        System.out.printf("선택번호: ");
        for (int i = 0; i < 6; i++)
        {
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.printf(selectNumber[i] + " ");
        }
        System.out.println();

        // 당첨번호
        int[] winningNumber = new int[6];
        random = new Random(3);
        for(int i = 0; i < 6; i ++)
        {
            winningNumber[i] = random.nextInt(45) + 1;
            System.out.println(winningNumber[i] + " ");
        }
        System.out.println();

        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);
        boolean result = Arrays.equals(selectNumber, winningNumber);
        System.out.printf("당첨여부: ");
        if(result)
        {
            System.out.println("1등에 당첨되셨습니다.");
        }
    }
}
