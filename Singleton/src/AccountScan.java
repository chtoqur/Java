import java.util.Scanner;

public class AccountScan {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String userInput = null;
        int select = 0;
        Account[] accounts = 

        do
        {
            System.out.println("----------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5. 종료");
            System.out.println("----------------------------------------------------");
            System.out.printf("선택> ");
            userInput = scan.nextLine();
            select = Integer.parseInt(userInput);

            switch (select) {
                case 1:
                    System.out.println("---------");
                    System.out.println("계좌생성");
                    System.out.println("---------");

                    Account account = new Account();

                    System.out.printf("계좌번호: ");
                    userInput = scan.nextLine();
                    

                    break;
            
                default:
                    break;
            }
        }
        while(false);
        

    }
}
