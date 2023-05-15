
public class Answer_Account {  
    
    private String number;      // 계좌번호
    private String name;        // 계좌주
    private int balance;        // 잔액  
    
    public Answer_Account()
    {
        number = "";
        name = "";
        balance = 0;
    }

    public Answer_Account(String number, String name, int balance)
    {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    
    public String getNumber() 
    {
        return this.number;
    }   

    public String getName() 
    {
        return this.name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getBalance() 
    {
        return this.balance;
    }

    public void setBalance(int balance) 
    {
        this.balance = balance;
    }

}

