import java.util.Arrays;

public class Lotto2 {

    private static final int MAX = 6;
    private static Lotto2 lotto = null;

    private Lotto2()
    {}

    // 외부 접근을 위한 정적 메소드 선언
    public static Lotto2 getInstance()
    {
        if (lotto == null)
        {
            lotto = new Lotto2();
        }
        return lotto;
    }

    private int getRandomNumber()
    {
        double rn = Math.random();
        return ((int)(rn * 45)) + 1;
    }

    private boolean isExistNumber(int[] ar, int num)
    {
        for (int i = 0; i < ar.length; i++)
        {
            if (ar[i] == num)
            {
                return true;
            }
        }

        return false;
    }

    public int[] getLottoNum()
    {
        int[] numbers = new int[MAX];
        int pos = 0;
        int randomNumber;

        while(pos < MAX)
        {
            // 1. 랜덤값을 가지고 온다. (1~45)
            randomNumber = getRandomNumber();

            // 2. 랜덤값이 배열에 존재 하는지?
            if (false == isExistNumber(numbers, randomNumber))
            {
                // 3. 존재하지 않는다면 추가하고 pos 증가
                numbers[pos] = randomNumber;
                pos++;
            };

        }

        Arrays.sort(numbers);

        return numbers;
    }

}
