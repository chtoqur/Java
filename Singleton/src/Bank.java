import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
// BankApplication의 역할은 Account, 즉 계좌 관리를 하는 것
public class Bank {
    
    public static final int CREATE_ACCOUNT = 1;
    public static final int DELETE_ACCOUNT = 2;
    public static final int INQUIRY_ACCOUNT = 3;
    public static final int DEPOSIT_ACCOUNT = 4;
    public static final int WITHDRAW_ACCOUNT = 5;

    public static boolean createAccount(BankApplication bank, String number, String name, int balance)
    {
        Account acc = new Account(number, name, balance);
        return bank.createAccount(acc);
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String userInput = null;

        // 기본 생성자로 만들면 0개의 account
        // BankApplication bankApp2 = new BankApplication();

        // 오버로딩 생성자로 만들면 매개값의 account
        BankApplication bankApp = new BankApplication(100);

        String number = "";
        String name = "";
        int balance = 0;
        int select = 0;

        do
        {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("1.계좌생성 | 2. 계좌삭제 | 3.계좌목록 | 4.예금 | 5.출금 | 6. 종료");
            System.out.println("-----------------------------------------------------------------");
            System.out.printf("선택> ");
            userInput = scan.nextLine();
            select = Integer.parseInt(userInput);

            switch (select) {

                case CREATE_ACCOUNT:

                    number = "";
                    name = "";
                    balance = 0;

                    System.out.println("---------");
                    System.out.println("계좌생성");
                    System.out.println("---------");
                    
                    System.out.printf("계좌번호: ");
                    userInput = scan.nextLine();
                    number = userInput;

                    System.out.printf("계좌주: ");
                    userInput = scan.nextLine();
                    name = userInput;

                    System.out.printf("초기입금액: ");
                    userInput = scan.nextLine();
                    balance = Integer.parseInt(userInput);

                    if (true == createAccount(bankApp, number, name, balance))
                    {
                        System.out.println("결과 : 계좌가 생성되었습니다.");
                    }
                    else
                    {
                        System.out.println("결과 : 계좌생성에 실패하였습니다.");
                    }

                    break;

                case DELETE_ACCOUNT:

                    System.out.println("---------");
                    System.out.println("계좌삭제");
                    System.out.println("---------");
                    
                    System.out.printf("계좌번호: ");
                    userInput = scan.nextLine();
                    number = userInput;

                    if (true == bankApp.delete(number))
                    {
                        System.out.println("결과 : 계좌삭제에 성공하였습니다");
                    }
                    else
                    {
                        System.out.println("결과 : 계좌삭제에 실패하였습니다");
                    }
                    
                    break;

                case INQUIRY_ACCOUNT:

                    System.out.println("--------------------------");
                    System.out.println("계좌목록");
                    System.out.println("--------------------------");

                    int count = bankApp.getCount();
                    Account ac;

                    int maxCount = bankApp.maxAccountNum();

                    for (int i = 0; i < maxCount + 1; i++)
                    {
                        ac = bankApp.getAccount(i);
                        
                        if (ac != null)
                        {
                            System.out.printf("%s\t %s\t %d\n", ac.getAccountNum(), ac.getName(), ac.getBalance());
                        }
                    }
                    
                    break;
                
                case DEPOSIT_ACCOUNT:

                    System.out.println("---------");
                    System.out.println("예금");
                    System.out.println("---------");

                    number = "";
                    balance = 0;

                    System.out.printf("계좌번호: ");
                    userInput = scan.nextLine();
                    number = userInput;

                    System.out.printf("입금액: ");
                    userInput = scan.nextLine();
                    balance = Integer.parseInt(userInput);

                    if (true == bankApp.deposit(number, balance))
                    {
                        System.out.println("결과 : 예금에 성공하였습니다");
                    }
                    else
                    {
                        System.out.println("결과 : 예금에 실패하였습니다");
                    }

                    break;
                
                case WITHDRAW_ACCOUNT:

                System.out.println("---------");
                System.out.println("출금");
                System.out.println("---------");

                number = "";
                balance = 0;

                System.out.printf("계좌번호: ");
                userInput = scan.nextLine();
                number = userInput;

                System.out.printf("출금액: ");
                userInput = scan.nextLine();
                balance = Integer.parseInt(userInput);

                if (true == bankApp.withdraw(number, balance))
                {
                    System.out.println("결과 : 출금에 성공하였습니다");
                }
                else
                {
                    System.out.println("결과 : 출금에 실패하였습니다");
                }

                    break;

                default:
                    break;
            }
        }
        while(select != 5);
        {
            System.out.println("Bye!");
        }
    }

}
