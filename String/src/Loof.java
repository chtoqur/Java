public class Loof {
    public static void main(String[] args) {

        // 연습문제 교재 p.162
        
        // 3. for문을 이용해서 1부터 100까지의 정수 중에서
        // 3의 배수의 총합을 출력하는 코드를 작성해보세요.

        int num = 1;
        int total = 0;

        for (int i = 0; i < 99; i++)
        {
            if (num % 3 == 0)
            {
                total = total + num;

                // 제대로 실행되고 있는지 확인하고 싶을 때 아래의 코드 활용
                // System.out.println(num);
            }
            num++;
        }
        
        System.out.println("total = " + total);

        System.out.println("---------------------------------");
        
        // 4. while문과 Math.random() 메소드를 이용

        // 아래와 같은 코드처럼 작성할 수도 있음
        // while (totalDice != 5)
        // {
        //     break;
        // }

        int dice1 = 0;
        int dice2 = 0;
        
        while (true)
        {
            
            int totalDice = dice1 + dice2;

            // if (5 == (dice1 + dice2)) > 라고 표현하는 것이 좋음. 습관들이기
            if (totalDice == 5)
            {
                break;
            }
            
            dice1 = (int)((Math.random()*6) + 1);
            dice2 = (int)((Math.random()*6) + 1);
            System.out.printf("(%d, %d)\n", dice1, dice2);
        }

        System.out.println("---------------------------------");

        // 5. 중첩 for문을 이용하여 방정식의 해
        
        int x = 1;

        for (int i = 0; i < 10; i++)
        {
            int y = 1;

            for (int j = 0; j < 10; j++)
            {
                if (60 == (4 * x) + (5 * y))
                {
                    System.out.printf("(%d, %d)\n", x, y);
                }
                y++;
            }
            x++;
        }

    }
}


