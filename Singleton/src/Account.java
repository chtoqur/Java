public class Account {
    
    // 잔고 필드
    private int balance;

    private String accountNum;
    private String name;
    private int initialDeposit;

    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;

    // 생성자
    public Account()
    {
        balance = 0;
        accountNum = null;
        name = null;
        initialDeposit = 0;
    }

    // 음수값이 될 수 없도록 세터
    public boolean setBalance(int balance)
    {
        if ((balance < Account.MIN_BALANCE) || (balance > Account.MAX_BALANCE))
        {
            return false;
        }

        this.balance = balance;
        return true;
    }
    
    public int getBalance()
    {
        return this.balance;
    }

    // Getter/Setter 생성
    public void setAccountNum(String accountNum)
    {
        this.accountNum = accountNum;
    }
    
    public String getAccountNum()
    {
        return accountNum;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }

    public void setInitialDeposit(int initialDeposit)
    {
        this.initialDeposit = initialDeposit;
    }
    
    public int getInitialDeposit()
    {
        return initialDeposit;
    }

    // 입금
    public boolean deposit(int money)
    {
        int total = balance + money;

        if ((total < MIN_BALANCE) || (total > MAX_BALANCE))
        {
            return false;
        }
        else
        {
            this.balance = total;
            return true;
        }
    }

    // 출금
    public boolean withdraw(int money)
    {
        int total = this.balance - money;

        if ((total < MIN_BALANCE) || (total > MAX_BALANCE))
        {
            return false;
        }
        else
        {
            this.balance = total;
            return true;
        }
    }

}
