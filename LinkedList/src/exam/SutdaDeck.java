package exam;

public class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCart[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck()
    {
        // 초기화
        for (int i = 0; i < CARD_NUM; i++)
        {
            cards[i] = new SutdaCard(i, false);

            for (int j = 0; j < 1; j++)
            {
                if (i == 3 || i == 1 || i == 8)
                {
                    
                }
            }
        }
    }
}
