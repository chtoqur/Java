public class Account {
    
    private boolean active; // 활성화된 계정이면 true
    private int balance;
    private String accountNum;
    private String name;
    
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;

    // 생성자
    public Account()
    {
        accountNum = "";
        name = "";
        balance = 0;
        active = false;
    }

    public Account (String accountNum, String name, int balance)
    {
        this.accountNum = accountNum;
        this.name = name;
        this.balance = balance;
        active = true;
    }

    public boolean isActive()
    {
        return this.active;
    }

    public boolean getIsActive() {
        return this.active;
    }

    // public void setIsActive(boolean isActive)
    // {
    //     this.active = active;
    // }

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

    // 계좌는 바뀔일 없으므로 setter 비활성
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

}
