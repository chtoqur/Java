// BackApplication의 역할은 Account, 즉 계좌 관리를 하는것이다.
public class Answer_BankApplication {
    
    private int count;          // Account Object의 개수
    private int Max;            // Account의 최대치
    private Answer_Account[] account;

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
        
        // 정상적인 객체가 들어왔다면 가장 가까운 null의 index인
        // pos번째 자리에 생성한 객체를 집어넣는다.
        this.account[pos] = acc;

        count++;
        return true;

    }
    
    public boolean deleteAccount(String number)
    {
        int targetIndex = -1;
        // 매개값으로 받은 계좌번호와 일치하는 index = targetIndex
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

    // 예금
    public boolean deposit(String number, int balance)
    {
        int index;
        int curBalance;     // 현재 잔액
        
        // 사용자 입력 계좌값과 일치하는 index 검색
        index = findAccountIndex(number);

        if (index == -1)
            return false;

        curBalance = account[index].getBalance();
        account[index].setBalance(curBalance + balance);
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

        // 현재 잔액보다 출금하려는 금액이 많을 경우 false
        if (curBalance < balance)
        {
            return false;
        }

        account[index].setBalance(curBalance - balance);
        return true;

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
