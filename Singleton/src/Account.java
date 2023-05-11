public class Account {
    
    // 잔고 필드
    private int balance;

    // 생성자
    public Account()
    {
        balance = 0;
    }

    // 음수값이 될 수 없도록 세터
    public void setBalance(int balance)
    {
        int MIN_BALANCE = 0;
        int MAX_BALANCE = 1000000;

        if ((balance >= MIN_BALANCE) && (balance <= MAX_BALANCE))
        {
            this.balance = balance;
        }
    }
    
    public int getBalance()
    {
        return this.balance;
    }

}
