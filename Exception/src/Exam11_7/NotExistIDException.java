package Exam11_7;

public class NotExistIDException extends Exception {
    
    public NotExistIDException()
    {
        super("아이디가 존재하지 않습니다.");
    }

    public NotExistIDException(String message)
    {
        // 작성란
        super(message);
    }

    
}
