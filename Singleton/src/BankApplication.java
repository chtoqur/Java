import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
    
        Account[] account = new Account[100];

        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String userInput = null;
        String userInput2 = null;
        int userInput2num = 0;

        int select = 0;
        int deposit = 0;
        int endNum = -1;
        int totalAccountNum = 0;

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

                    account[totalAccountNum] = new Account();

                    System.out.printf("계좌번호: ");
                    userInput = scan.nextLine();
                    account[totalAccountNum].setAccountNum(userInput);

                    System.out.printf("계좌주: ");
                    userInput = scan.nextLine();
                    account[totalAccountNum].setName(userInput);

                    System.out.printf("초기입금액: ");
                    userInput = scan.nextLine();
                    deposit = Integer.parseInt(userInput);

                    if (deposit >= 0 && deposit <= 1000000)
                    {
                        account[totalAccountNum].setBalance(deposit);
                        totalAccountNum++;
                        System.out.println("결과: 계좌가 생성되었습니다.");
                    }
                    else
                    {
                        System.out.println("결과: 잘못된 정보입니다. 계좌 생성에 실패하였습니다.");
                    }                 

                    break;

                case 2:

                    System.out.println("---------");
                    System.out.println("계좌목록");
                    System.out.println("---------");
                    
                    for(int i = 0; i < totalAccountNum; i++)
                    {
                        System.out.printf("%s\t%s\t%d\n",
                        account[i].getAccountNum(), account[i].getName(), account[i].getBalance());
                    }
                    
                    break;
                
                case 3:

                    System.out.println("---------");
                    System.out.println("예금");
                    System.out.println("---------");

                    System.out.printf("계좌번호: ");
                    userInput = scan.nextLine();

                    System.out.printf("입금액: ");
                    userInput2 = scan2.nextLine();
                    userInput2num = Integer.parseInt(userInput2);

                    for(int i = 0; i < totalAccountNum; i++)
                    {
                        if (userInput.equals(account[i].getAccountNum()))
                        {
                            account[i].deposit(userInput2num);
                        }
                    }

                    break;
                
                case 4:

                    System.out.println("---------");
                    System.out.println("출금");
                    System.out.println("---------");

                    System.out.printf("계좌번호: ");
                    userInput = scan.nextLine();

                    System.out.printf("출금액: ");
                    userInput2 = scan2.nextLine();
                    userInput2num = Integer.parseInt(userInput2);

                    for(int i = 0; i < totalAccountNum; i++)
                    {
                        if (userInput.equals(account[i].getAccountNum()))
                        {
                            account[i].withdraw(userInput2num);
                        }
                    }

                    System.out.println("출금이 성공되었습니다.");

                    break;

                case 5:
                    System.out.println("프로그램 종료");
                    endNum = 0;
                    break;
                
            
                default:
                    break;
            }
        }
        while(endNum == -1);
    }

}
