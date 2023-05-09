public class Exam {
    public static void main(String[] args) {
        
        // 3. for문을 이용해서 1부터 100까지의 정수 중에서
        // 3의 배수의 총합을 출력하는 코드를 작성해보세요.

        int num = 1;
        int total = 0;

        for (int i = 0; i < 99; i++)
        {
            if (num % 3 == 0)
            {
                total = total + num;
            }
            num++;
        }
        
        System.out.println("total = " + total);

        System.out.println("---------------------------------");
        
        // 4. while문과 Math.random() 메소드를 이용

        int dice1 = (int)((Math.random()*5) + 1);
        int dice2 = (int)((Math.random()*5) + 1);
        System.out.printf("(%d, %d)\n", dice1, dice2);
        
        int totalDice = dice1 + dice2;

        while (true)
        {
            if (totalDice != 5)
            {
                dice1 = (int)((Math.random()*5) + 1);
                dice2 = (int)((Math.random()*5) + 1);
                continue;
            }

            else if (totalDice == 5)
            {
                break;
            }
        }

        System.out.println("---------------------------------");

        // 5. 중첩 for문을 이용하여 방정식의 해
        
        int x = 1;

        for (int i = 0; i < 10; i++)
        {
            int y = 1;

            for (int j = 0; j < 10; j++)
            {
                if ((4 * x) + (5 * y) == 60)
                {
                    System.out.printf("(%d, %d)\n", x, y);
                }
                y++;
            }
            x++;
        }

    }
}
