public class ArrayExam {
    public static void main(String[] args) {
        
        // 7. 주어진 배열 항목에서 최대값을 출력하는 코드를 작성해보세요.

        int[] array = {1, 5, 3, 8, 2};
        int max = array[0];

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }

        System.out.println("최대값 = " + max);

        System.out.println("-----------------------------");

        // 8. 주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성
        
        int[][] array2 = {
            {95, 86},
            {83, 92, 96},
            {78, 83, 93, 87, 88}
        };

        int total = 0;
        double average = 0.0;

        for (int i = 0; i < array2.length; i++)
        {
            for (int j = 0; j < array2[i].length; j++)
            {
                total = total + array2[i][j];
            }
        }

        int length = 0;

        for (int i = 0; i < array2.length; i++)
        {
            length = length +  array2[i].length;
        }
        
        average = (double)total / length;

        System.out.println("전체 합 = " + total);
        System.out.println("평균 = " + average);
        
        System.out.println("-----------------------------");



    }
}
