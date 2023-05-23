package Exam8_6;

public class Dog implements Soundable {
    
    private String bark;

    public String sound()
    {
        bark = "멍멍";
        // bark = new String("멍멍")의 슈가코드

        return bark;
    }
}
