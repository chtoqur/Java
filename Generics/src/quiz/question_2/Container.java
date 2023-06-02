package quiz.question_2;

public class Container<T> {

    private T content;

    public Container()
    {

    }

    public Container(T content)
    {
        this.content = content;
    }
    
    public void set(T content)
    {
        this.content = content;
    }

    public T get()
    {
        return content;
    }
}
