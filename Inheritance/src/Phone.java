public class Phone {
    
    public String model;
    public String color;

    public Phone()
    {
        System.out.println("Phone() 생성자 실행");
    }

    public Phone(String model, String color)
    {
        this.model = model;
        this.color = color;
        System.out.println("Phone(model, color) 오버로딩 생성자 실행");
    }

    public void bell()
    {
        System.out.println("ring ring~~~");
    }

    public void sendVoice(String message)
    {
        System.out.println("me : " + message);
    }

    public void receiveVoice(String message)
    {
        System.out.println("you : " + message);
    }

    public void hangUp()
    {
        System.out.println("hangup the phone");
    }

}
