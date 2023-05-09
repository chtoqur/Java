import java.util.Scanner;

public class ArrayExam2 {
    public static void main(String[] args) {
        
        // 9. 학생들 점수 분석 프로그램
        Scanner scan = new Scanner(System.in);
        int num = 0;

        System.out.println("--------------------------------------------------------");
        System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
        System.out.println("--------------------------------------------------------");
        System.out.println("선택> 1");
        System.out.print("학생수> ");
        num = scan.nextInt();
        int[] scores = new int[num];
        
        while(true)
        {
            System.out.println("--------------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
            System.out.println("--------------------------------------------------------");
            System.out.print("선택> ");
            
            int select = scan.nextInt();

            switch (select) {

                case 1:
                    System.out.println("학생수> " + num);
                    break;
                
                case 2:
                    for (int i = 0; i < num; i++)
                    {
                        System.out.printf("scores[%d]: ", i);
                        scores[i] = scan.nextInt();
                    }
                break;

                // 점수리스트
                case 3:
                    for (int i = 0; i < num; i++)
                    {
                        System.out.printf("scores[%d]: %d\n", i, scores[i]);
                    }
                break;
                    
                case 4:
                    int max = scores[0];

                    for (int i = 0; i < scores.length; i++)
                    {
                        if (scores[i] > max)
                        {
                            max = scores[i];
                        }
                    }

                    int total = 0;
                    double average = 0;

                    for (int j = 0; j < scores.length; j++)
                    {
                        total = total + scores[j];
                    }

                    average = (double)total / num;

                    System.out.println("최고 점수: " + max);
                    System.out.println("평균: " + average);

                break;

                case 5:
                System.out.println("프로그램 종료");
                break;
            
                default:
                    break;
            }
        }
    }
}
