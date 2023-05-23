package MultiInterface;

public class PrintApp {
    public static void main(String[] args) {
        
        Printerable prn = new HPPrinter();
        prn.print("abc");
    }
}
