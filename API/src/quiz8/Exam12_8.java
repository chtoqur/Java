package quiz8;

public class Exam12_8 {
    public static void main(String[] args) {
        
        long start = System.nanoTime();

        int[] scores = new int[1000];
        for (int i = 0; i < scores.length; i++)
        {
            scores[i] = i;
        }

        int sum = 0;
        for(int score : scores)
        {
            sum = sum + score;
        }

        double avg = sum / scores.length;
        System.out.println(avg);

        long end = System.nanoTime();

        System.out.println((end-start) + "나노초가 소요되었습니다.");
    }
}
