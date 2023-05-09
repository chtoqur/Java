public class Gugudan {

    // private = JS의 #과 비슷한 개념
    // 외부에서 접근하지 못하도록 함
    private int dan;

    // 컨스트럭터
    // 디폴트 생성자
    // 리턴값은 쓰지 않음
    // 그 객체의 참조값을 리턴하도록 이미 지정되어 있기 때문에
    // 리턴값을 지정하면 안됨

    // 파라미터 없을 때 호출자
    public Gugudan()
    {
        System.out.println("Constructor 호출");
        dan = 1;
    }

    // 오버로디드 컨스트럭터
    // 파라미터 지정했을 때 호출자
    public Gugudan(int dan)
    {
        System.out.println("Overloaded Constructor 호출");
        this.dan = dan;
    }

    // getter, setter
    // 정상적인 경로의 접근경로 생성

    // public = 공개적인 루트로 만들 것이기 때문
    // void = return 되는 타입이 없음을 의미. 아무것도 리턴하지 않음을 선언해주는 것
    // 리턴형이 있을 때는 int, double 등 작성해줘야함
    public void setDan(int dan)
    {
        // 하지만 파라메터 값이랑 이름이 동일한 경우는 구별을 위해 this를 사용함
        this.dan = dan;
    }

    // public = 공개적인 루트로 만들 것이기 때문
    // dan이 int기 때문에 해당 타입을 리턴형으로 함수 이름 앞에 작성
    public int getDan()
    {
        return dan;
    }

    public void printDan()
    {
        int m = 1;
        for (int i = 0; i < 9; i++)
        {
            System.out.printf("%d X %d = %d\n", dan, m, dan * m);
            m++;
        }
    }

}
