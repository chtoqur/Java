package clone;

public class WrongPointException extends Exception {
    
    public WrongPointException()
    {
        super("Wrong Point Value");
    }

    public WrongPointException(String message)
    {
        super(message);
    }
}
