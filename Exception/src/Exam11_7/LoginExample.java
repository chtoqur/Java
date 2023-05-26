package Exam11_7;

public class LoginExample {
    public static void main(String[] args) {

        try
        {
            login("white", "12345");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            login("blue", "54321");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

                                                        // 작성란
    public static void login(String id, String password) throws NotExistIDException, WrongPasswordException 
    {
        // id가 blue가 아니라면 NotExistIDException을 발생시킴
        if(!id.equals("blue"))
        {
            // 작성란
            throw new NotExistIDException();
        }
        // password가 12345가 아니라면 WrongPasswordException을 발생시킴
        if(!password.equals("12345"))
        {
            // 작성란
            throw new WrongPasswordException();
        }
    }
}
