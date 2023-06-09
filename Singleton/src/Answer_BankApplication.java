// BackApplication의 역할은 Account, 즉 계좌 관리를 하는것이다.
public class Answer_BankApplication {
    
    private int count;          // Account Object의 개수
    private int Max;            // Account의 최대치
    private Answer_Account[] account;

    // 싱글톤
    // 위부에서 getInstance를 여러번 실행해도 단 하나의 객체만을 가리키게 된다
    private static Answer_BankApplication bankApp = null;
    
    public static Answer_BankApplication getInstance(int max)
    {
        if (bankApp == null)
        {
            bankApp = new Answer_BankApplication(max);
        }
        return bankApp;
    }

    // 갯수 설정없이 생성하는 경우를 위해 정의
    public static Answer_BankApplication getInstance()
    {
        return bankApp;
    }

    public Answer_BankApplication()
    {    
        count = 0;
        Max = 0;
        account = null;
    }

    public Answer_BankApplication(int max)
    {
        count = 0;
        Max = max;
        account = new Answer_Account[max];

        ////////////////////////////////////////////////////
        //test-code
        account[0] = new Answer_Account("111-111", "abc", 10000);
        account[1] = new Answer_Account("222-222", "def", 20000);
        account[2] = new Answer_Account("333-333", "efg", 30000);
        account[3] = new Answer_Account("444-444", "oqp", 40000);
        count = 4;
        ///////////////////////////////////////////////////
    }
    public int getMax()
    {
        return this.Max;
    }

    // account 배열에서 처음으로 만나는 null 위치를 리턴
    private int getEmptySlot()
    {
        for (int i = 0; i < Max; i++)
        {           
            if (account[i] == null)
                return i;
        }

        return -1;
    }

    public boolean createAccount(Answer_Account acc)
    {
        int pos = this.getEmptySlot();

        // account가 없거나 최대치이면 false를 리턴
        if ((acc == null) || (pos == -1))
            return false;
        
        this.account[pos] = acc;
        count++;
        return true;

    }
    
    public boolean deleteAccount(String number)
    {
        int targetIndex = -1;
        targetIndex = findAccountIndex(number);

        if (targetIndex == -1)
        {
            return false;
        }

        // 위치에 null을 넣어준다.
        account[targetIndex] = null;
        count--;
        return true;
    }

    //출금
    public boolean withdraw(String number, int balance)
    {
        int index;
        int curBalance;
        
        index = findAccountIndex(number);

        if (index == -1)
            return false;

        // 현재 잔액을 가지고 온다.
        curBalance = account[index].getBalance();

        if (curBalance < balance)
        {
            return false;
        }

        account[index].setBalance(curBalance - balance);
        return true;

    }

    // 예금처리
    public boolean deposit(String number, int balance)
    {
        int index;
        int curBalance;
        
        index = findAccountIndex(number);

        if (index == -1)
            return false;

        curBalance = account[index].getBalance();
        account[index].setBalance(curBalance + balance);
        return true;       

    }

    private int findAccountIndex(String number)
    {
        
        for (int i = 0; i < Max; i++)
        {
            if (account[i] != null)
            {
                if (account[i].getNumber().equals(number))
                {
                    return i;
                }

            }
            
        }

        return -1;
    }

    public int getCount()
    { 
        return count;
    }
    
    public Answer_Account getAccount(int index)
    {
        if (account[index] == null)
            return null;

        return new Answer_Account(account[index].getNumber(),
                            account[index].getName(),
                            account[index].getBalance());
        
    }

}
