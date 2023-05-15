public class BankApplication {
    // BankApplication의 역할은 Account, 즉 계좌 관리를 하는 것
    
    private int count;         // Account 객체개수
    private int Max;           // Account의 최대치
    private Account[] account;  // Account 배열 account

    // 생성자
    public BankApplication()
    {
        count = 0;
        Max = 0;
        // 0개로 생성
        account = null;
    }

    // 오버로딩 생성자
    // 매개값에 최대 account 갯수
    public BankApplication(int num)
    {
        // num 개수 만큼의 배열 = acount
        account = new Account[num];
        count = 0;
        Max = num;

        ////////////////////////////////////////////////////
        //test-code
        account[0] = new Account("111-111", "abc", 10000);
        account[1] = new Account("222-222", "def", 20000);
        account[2] = new Account("333-333", "efg", 30000);
        account[3] = new Account("444-444", "oqp", 40000);
        count = 4;
        ///////////////////////////////////////////////////
    }

    // 계좌생성
    public boolean createAccount(Account account)
    {
        // 빈 위치
        int pos = this.getEmptySlot();

        // account가 없거나 pos가 증가하다가 최대치에 도달하면 false
        // pos는 0부터 시작이므로 Max - 1로 비교
        if ((account == null) || (pos == -1))
        {
            return false;
        }

        this.account[pos] = account;
        count++;
        return true;

    }

    // accouont 배열에서 처음으로 만나는 null 위치를 리턴
    public int getEmptySlot()
    {
        for (int i = 0; i < Max; i++)
        {
            if (account[i] == null)
            {
                return i;
            }
        }
        return -1;
    }

    public static boolean createAccount(BankApplication bank, String number, String name, int balance)
    {
        Account acc = new Account(number, name, balance);
        
        return bank.createAccount(acc);
    }

    public int getCount()
    {
        return count;
    }

    public Account getAccount(int index)
    {
        // 현재 
        // 왜 -1 ??
        if (index > count)
            return null;

        if (account[index] != null)
        {
            return new Account(account[index].getAccountNum(),
                                account[index].getName(),
                                account[index].getBalance());
        }
        
        else
        {
            return null;
        }
    }

    // 예금처리
    public boolean deposit(String number, int balance)
    {
        int index;
        // 현재잔액
        int curBalance;
        
        index = findAccountIndex (number);

        if (index == -1)
            return false;

        curBalance = account[index].getBalance();
        account[index].setBalance(curBalance + balance);
        return true;
    }

    private int findAccountIndex (String number)
    {
        for (int i = 0; i < Max; i++)
        {
            if (account[i] != null)
            {
                if (true == (account[i].getAccountNum().equals(number)))
                {
                    return i;
                }
            }
        }
        return -1;
    }

    // 출금처리
    public boolean withdraw (String number, int balance)
    {
        int index;
        // 현재잔액
        int curBalance;
        
        index = findAccountIndex(number);

        if (index == -1)
            return false;

        curBalance = account[index].getBalance();

        if(curBalance < balance)
        {
            return false;
        }

        account[index].setBalance(curBalance - balance);
        return true;
    }

    public boolean delete (String number)
    {

        int targetIndex = -1;
        targetIndex = findAccountIndex(number);

        if (targetIndex == -1)
        {
            return false;
        }

        account[targetIndex] = null;
        count--;
        
        return true;
    }

    public int maxAccountNum()
    {
        int max = 0;

        for (int i = 0; i < account.length; i++)
        {
            if(account[i] != null)
            {
                if(i > max)
                {
                    max = i;
                }
            }
        }

        return max;

    }

    public int getMax()
    {
        return this.Max;
    }
}
