import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String[] words = { "television", "computer", "mouse", "phone" };
        Scanner scanner = new Scanner(System.in);
        int randomNum;
        char tmp;

        // 단어 한개당 반복할 알고리즘
        for (int i = 0; i < words.length; i++)
        {
            char[] question = words[i].toCharArray(); // String을 char[]로 변환
            
            // char 배열 question에 담긴 문자의 위치를 임의로 바꾼다.
            // 변환된 문자배열의 길이만큼 셔플 반복
            for (int j = 0; j < question.length; j++)
            {
                // 랜덤숫자 출력 0~문자배열의 길이만큼
                randomNum = (int)(Math.random() * question.length);
                
                // 랜덤숫자가 0과 같지 않도록 하기
                if (randomNum == 0)
                {
                    j--;
                }

                tmp = question[0];
                question[0] = question[randomNum];
                question[randomNum] = tmp;

            }

            System.out.printf("Q%d. %s의 정답을 입력하세요>",
                                        i + 1, new String(question));

            String answer = scanner.nextLine();

            // trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
            if (words[i].equals(answer.trim()))
            System.out.printf("맞았습니다.\n\n");
            else
            System.out.printf("틀렸습니다.\n\n");
        }
    }
}
