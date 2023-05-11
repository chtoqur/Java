public class Singleton {
    
    // private 접근 권한을 갖는 정적 필드 선언과 초기화
    private static Singleton singleton = new Singleton();

    private int xSize; // 초기값 1920
    private int ySize; // 초기값 1080

    // private 생성자
    private Singleton()
    {
        xSize = 1920;
        ySize = 1080;
    }

    // 외부 접근을 위한 정적 메소드 선언
    public static Singleton getInstance()
    {
        return singleton;
    }


}
