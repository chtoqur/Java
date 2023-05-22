public class Percent {
    public static void main(String[] args) throws Exception {

        int sum = 0;
        int totalSum = 0;
        int num = 1;

        while(true)
        {
            // 짝수
            if (num % 2 == 0)
            {
                num = -(num);
            }

            sum = sum + num;

            if (-(num) % 2 == 0)
            {
                num = -(num);
            }

            if(sum > 100)
            break;
            
            num++;

            
        }

        System.out.println(sum);


    }
}
