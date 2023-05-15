import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Answer_App {
    public static final int CREATE_ACCOUNT  = 1;
    public static final int DELETE_ACCOUNT  = 2;
    public static final int INQUIRY_ACCOUNT = 3;
    public static final int DEPOSIT_ACCOUNT = 4;
    public static final int WITHDRAW_ACCOUNT= 5;

    public static boolean createAccount(Answer_BankApplication bankApp, String number, String name, int balance)
    {
        // 파라메터로 받은 매개값으로 객체를 찍어내고
        Answer_Account acc = new Answer_Account(number, name, balance);
        // createAccount를 이용, 객체 배열의 가장 가까운 null 속에
        // 해당 객체의 참조값을 집어넣는다
        return bankApp.createAccount(acc);
    }







    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String temp;
        int userInput;
        
        Answer_BankApplication bankApp = new Answer_BankApplication(100);
        String number = "";
        String name = "";
        int balance = 0;

        do {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌삭제 | 3.계좌목록 | 4. 예금 | 5. 출금 | 6. 종료");
            System.out.println("-------------------------------------------------------------------");

            System.out.printf("선택>");
            temp = scan.nextLine();
            userInput = Integer.parseInt(temp);

            switch(userInput)
            {
                case CREATE_ACCOUNT :
                
                System.out.printf("계좌번호 : ");
                temp = scan.nextLine();
                number = temp;

                System.out.printf("계좌주 : ");
                temp = scan.nextLine();
                name = temp;

                System.out.printf("초기입금액: ");
                temp = scan.nextLine();
                balance = Integer.parseInt(temp);

                if (true == createAccount(bankApp, number, name, balance))
                {
                    System.out.println("결과 : 계좌가 생성되었습니다.");
                }
                else 
                {
                    System.out.println("결과 : 계좌생성에 실패하였습니다.");
                }
                
                break;

                case DELETE_ACCOUNT : 
                System.out.printf("계좌번호 : ");
                temp = scan.nextLine();
                number = temp;

                if (true == bankApp.deleteAccount(number))
                {
                    System.out.println("결과 : 계좌가 삭제되었습니다.");
                }
                else
                {
                    System.out.println("결과 : 삭제가 실패하였습니다.");
                }

                break;

                case INQUIRY_ACCOUNT :

                System.out.println("---------------------------");
                System.out.println("계좌목록");
                System.out.println("---------------------------");
                int maxCount = bankApp.getMax();
                Answer_Account ac = null;

                for (int i = 0; i < maxCount; i++)
                {
                    // bankApp = 사용자 입력값(100개)의 참조변수가 들어갈 수 있는
                    // Account 객체 배열 포함한 클래스 

                    // 원래는
                    // Answer_Account acc = new Answer_Account(number, name, balance);
                    // bankApp.createAccount(acc);
                    // this.account[pos] = acc;
                    ac = bankApp.getAccount(i);
                    
                    if (ac != null)
                    {
                        System.out.printf("%s\t %s\t %d\n", ac.getNumber(), ac.getName(), ac.getBalance());
                    }
                }
                
                break;

                case DEPOSIT_ACCOUNT :
                number = "";                
                balance = 0;
                
                System.out.println("---------------------------");
                System.out.println("예금");
                System.out.println("---------------------------");
                
                System.out.printf("계좌번호 : ");
                temp = scan.nextLine();
                number = temp;
                
                System.out.printf("예금액: ");
                temp = scan.nextLine();
                balance = Integer.parseInt(temp);

                if (true == bankApp.deposit(number, balance))
                {
                    System.out.println("결과 : 예금이 성공하였습니다.");

                }
                else
                {
                    System.out.println("결과 : 예금이 실패하였습니다.");
                }
                break;

                case WITHDRAW_ACCOUNT :
                number = "";                
                balance = 0;
                
                System.out.println("---------------------------");
                System.out.println("출금");
                System.out.println("---------------------------");
                
                System.out.printf("계좌번호 : ");
                temp = scan.nextLine();
                number = temp;
                
                System.out.printf("출금액: ");
                temp = scan.nextLine();
                balance = Integer.parseInt(temp);
                
                if (true == bankApp.withdraw(number, balance)) {
                    System.out.println("결과 : 출금이 성공하였습니다.");
                }
                else {
                    System.out.println("결과 : 출금이 실패하였습니다.");
                }

                break;

                default:
                break;

            }
        
        }while(userInput != 6);

        System.out.println("Bye");
        
    }
}
