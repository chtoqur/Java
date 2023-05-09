public class AdvancedForExample {
    public static void main(String[] args) {
        
        int[] scores = {80, 90, 70, 70, 80};
        int total = 0;
        int total2 = 0;

        // sc에 scores의 값을 하나씩 집어넣으면서 반복
        for (int sc : scores)
        {
            total = total + sc;
        }
        System.out.println(total);

        // 위와 아래의 코드는 같은 코드임

        for (int i = 0; i < scores.length; i++)
        {
            total2 = total2 + scores[i];
        }
        System.out.println(total2);
    }
}
