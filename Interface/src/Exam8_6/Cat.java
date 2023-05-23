package Exam8_6;

public class Cat implements Soundable {

    private String meow;
    
    public String sound()
    {
        meow = "야옹";
        // meow = new String("야옹")의 슈가코드

        return meow;
    }
}
