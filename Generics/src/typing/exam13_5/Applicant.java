package typing.exam13_5;

public class Applicant<T> {
    
    public T kind;

    public Applicant(T kind)
    {
        this.kind = kind;
    }
}
