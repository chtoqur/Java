package exam12_4;

public class ExitExample {
    public static void main(String[] args) {
        
        for(int i = 0; i < 10; i++)
        {
            System.out.println(i);
            if (i == 5)
            {
                System.out.println("프로세스 강제 종료");
                // 정상종료 : 0, 비정상 종료 : 1 or -1
                System.exit(0);
            }
        }
    }
}
