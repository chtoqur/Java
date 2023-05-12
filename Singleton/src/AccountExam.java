public class AccountExam {
    public static void main(String[] args) {
        
        Account account = new Account();

        account.setBalance(-5);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(10000001);
        System.out.println("현재 잔고: " +  account.getBalance());

        account.setBalance(20900);
        System.out.println("현재 잔고: " +  account.getBalance());



    }
}
