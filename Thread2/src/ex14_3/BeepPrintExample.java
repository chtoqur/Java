package ex14_3;

import java.awt.Toolkit;

public class BeepPrintExample {
    public static void main(String[] args) {
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i < 5; i++)
        {
            toolkit.beep();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

}