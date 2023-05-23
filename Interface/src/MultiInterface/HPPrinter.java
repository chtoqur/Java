package MultiInterface;

public class HPPrinter implements Printerable, Scanable {
    
    @Override
    public void print(String doc)
    {
        System.out.println("print : " + doc);
    }

    @Override
    public void scan(String doc)
    {
        System.out.println("scan : " + doc);
    }

}
