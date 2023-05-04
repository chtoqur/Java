public class Memo {
    public static void main(String[] args) {

        // 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다
        // 알맞은 코드를 넣어서 프로그램을 완성하시오. (1)~(2).
        
        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];

        // 배열ballArr의 임의의 요소를 골라서 위치를 바꾼다
        
        for(int i = 0; i < ballArr.length;i++)
        {
            int j = (int)(Math.random() * ballArr.length);
            int tmp = 0;

            // 코드 작성
            tmp = j;
            j = ballArr[0];
            ballArr[0] = tmp;
        }

        // 배열 ballArr의 앞에서 3개의 수를 배열 ball3으로 복사한다
        

        // 코드 작성

        for(int i = 0; i < ball3.length; i++)
        {
            System.out.print(ball3[i]);
        }
        
        System.out.println();
            

    }
}
