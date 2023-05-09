public class Lotto {
    public static void main(String[] args) {
        
        // 1. 로또 번호를 저장해야합니다.
        // 랜덤번호 6개 필요함 > math.random
        // int[] lotto = new int[6];

        // 2. 중학교 국어, 영어, 수학 성적을 저장해야한다.
        // [학년][학기][과목]
        int[][][] score = new int[3][2][3];

        // 1학년 국영수 성적입력

        // 1-1학기
        score[0][0][0] = 80;
        score[0][0][1] = 81;
        score[0][0][2] = 82;

        // 1-2학기
        score[0][1][0] = 90;
        score[0][1][1] = 91;
        score[0][1][2] = 92;

        // 2학년 국영수

        // 2-1학기
        score[1][0][0] = 30;
        score[1][0][1] = 31;
        score[1][0][2] = 32;

        // 2-2학기
        score[1][1][0] = 40;
        score[1][1][1] = 41;
        score[1][1][2] = 42;

        // 3학년 국영수

        // 3-1학기
        score[2][0][0] = 50;
        score[2][0][1] = 51;
        score[2][0][2] = 52;

        // 3-2학기
        score[2][1][0] = 60;
        score[2][1][1] = 61;
        score[2][1][2] = 62;

        // 출력
        // int[][][] score = new int[3][2][3];

        // for (int y = 0; y < score.length; y++)
        // {
        //     for (int k = 0; k < score[y].length; k++)
        //     {
        //         for (int m = 0; m < score[y][k].length; m++)
        //         {
        //             System.out.printf("%d학년 %d학기 성적 = %d%n", y+1, k+1, score[y][k][m]);
        //         }
        //     }
        // };

        System.out.println(score.length); // 3
        System.out.println(score[0].length); // 2
        System.out.println(score[0][0].length); // 3

        // 출력

        for (int y = 0; y < score.length; y++)
        {
            for (int k = 0; k < score[y].length; k++)
            {
                System.out.printf("%d학년 %d학기 성적%n", y+1, k+1);
                System.out.printf("국어 : %d, 영어 : %d, 수학 : %d%n",
                                    score[y][k][0],
                                    score[y][k][1],
                                    score[y][k][2]);
            }
        };

        // // 3. 날씨 (맑음, 흐림, 비, 눈) 1년 날씨를 저장해야한다.
        // String[] weather = new String[365];
    }
}
