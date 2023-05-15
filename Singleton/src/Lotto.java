public class Lotto {
    
    int[][] lotto;
    int lottoNum;

    public Lotto()
    {
        int[][] lotto = null;
        int lottoNum = 0;
    }

    public void setLotto(int[][] lotto) {
        this.lotto = lotto;
    }

    public int[][] getLotto() {
        return this.lotto;
    }

    public void randomLotto(int[][] lotto)
    {
        for (int i = 0; i < lotto.length; i++)
        {
        for (int j = 0; j < 6; j++)
        {
            // 랜덤 숫자 추출
            lottoNum = ((int)(Math.random() * 45)) + 1;
            // 배열에 삽입
            lotto[i][j] = lottoNum;

            // 중복 숫자 제거 로직
            // k < j : 현재 j에 들어가있는 숫자의 갯수만큼 순회하며 검사
            for (int k = 0; k < j; k++)
            {
                // 만약 추출한 숫자가 현재 배열에 존재하는 수와 중복되는 것이라면
                if (lottoNum == lotto[i][k])
                {
                    // j의 수를 하나 줄임으로서 숫자 추출 로직을 한 번 더 반복한다.
                    j--;
                }
            }
        }
        }
    }
}
