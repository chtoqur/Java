package note;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        final int[] sum = {0};

        numbers.forEach(number -> {
            if (number % 2 != 0) { // 홀수인 경우에만 더함
                sum[0] += number;
            }
        });

        System.out.println("홀수의 합: " + sum[0]);
    }
}
