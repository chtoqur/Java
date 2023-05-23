import java.util.Arrays;

public class Shuffle {
    
    // Method
    public static int[] shuffle (int[] arr)
    {
        int box;
        int shuffleNum = 1;

        // 배열에 담긴 값의 위치 바꾸기
        for (int i = 0; i < arr.length - 1; i++)
        {
            box = arr[0];
            arr[0] = arr[shuffleNum];
            arr[i] = box;
            shuffleNum++;
        }

        return arr;
    }


    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
