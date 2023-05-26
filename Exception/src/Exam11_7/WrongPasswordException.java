package Exam11_7;

public class WrongPasswordException extends Exception {
    
    public WrongPasswordException()
    {
        super("패스워드가 틀립니다.");
    }

    public WrongPasswordException(String message)
    {
        // 작성란
        super(message);
    }
}
