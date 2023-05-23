package MultiInterface;

public class HPPrinter2 implements ColorPrintable {
    
    @Override
    public void print(String doc)
    {
        System.out.println("print : " + doc);
    }

    @Override
    public void colorPrint(String doc)
    {
        System.out.println("color print : " + doc);
    }
}
