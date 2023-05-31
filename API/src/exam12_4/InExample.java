package exam12_4;

import java.io.IOException;

public class InExample {
    public static void main(String[] args) throws IOException {
        int speed = 0;
        int keyCode = 0;

        while(true)
        {
            // Enter 키를 읽지 않았을 경우에만 실행
            if (keyCode != 13 && keyCode != 10)
            {
                if (keyCode == 49)      // 숫자 1키
                {
                    speed++;
                }
                else if (keyCode == 50) // 숫자 2키
                {
                    speed--;
                }
                else if (keyCode == 51) // 숫자 3키
                {
                    break;
                }
                System.out.println("----------------------------");
                System.out.println("1. 증속 | 2. 감속 | 3. 중지");
                System.out.println("----------------------------");
                System.out.println("현재 속도=" + speed);
                System.out.printf("선택: ");

            }
            keyCode = System.in.read();
        }
        System.out.println("프로그램 종료");
    }
}
