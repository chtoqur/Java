import java.util.Scanner;

public class ArrayExam2_answer2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int userInput = 0;
        int menu = 0;
        int stuNum = 0;
        int[] scores = null;
        int highScore = 0;

        do {
            System.out.println("--------------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
            System.out.println("--------------------------------------------------------");
            System.out.printf("선택> ");

            // 1. 사용자에게 숫자를 하나 받는다. (메뉴)
            userInput = scan.nextInt();
            menu = userInput;

            switch(menu)
            {
                case 1: // 학생수
                    System.out.printf("학생수> ");
                    userInput = scan.nextInt();
                    stuNum = userInput;
                break;

                case 2: // 점수입력

                    // 1. 배열을 만든다.
                    if (stuNum != 0)
                    {
                        scores = new int[stuNum];
                    }

                    // 2. 점수를 입력받아 배열에 넣는다.
                    for (int i = 0; i < stuNum; i++)
                    {
                        System.out.printf("scores[%d]>", i);
                        userInput = scan.nextInt();
                        scores[i] = userInput;
                    }

                break;

                case 3: // 점수리스트
                    for (int i = 0; i < stuNum; i++)
                    {
                        System.out.printf("scores[%d]: %d\n", i, scores[i]);
                    }

                break;

                case 4: // 분석

                    // = if (scores.length != 0)
                    if (scores != null)
                    {
                        highScore = scores[0];

                        for (int i = 1; i < scores.length; i++)
                        {
                            if (scores[i] > highScore)
                            {
                                highScore = scores[i];
                            }
                        }
                        System.out.println("최고 점수: " + highScore);
                    }

                    int total = 0;

                    for (int i = 0; i < scores.length; i++)
                    {
                        total = total + scores[i];
                    }

                    System.out.println("평균 점수: " + ((double)total/stuNum));

                break;

            }
        }
        
        while (menu != 5);

        System.out.println("Bye!");

    }
}
