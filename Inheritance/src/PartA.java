public class PartA extends Patient {
    // 안과

    double eyeSight;

    public PartA()
    {
        eyeSight = 0;
        System.out.println("PartA() - constructor");
    }

    public PartA(String name,
                 String gender,
                 double weight,
                 String bloodType,
                 double eyeSight)
    {
        super(name, gender, weight, bloodType);
        this.eyeSight = eyeSight;
    }

    public double getEyeSight() {
        return this.eyeSight;
    }

    public void setEyeSight(double eyeSight) {
        this.eyeSight = eyeSight;
    }

    // 오버라이딩 (Method Overriding)
    // @+지시자 ==> 컴파일러에게 상위 클래스에 동일한 이름의
    //              메소드가 있다는 것을 알려줌
    @Override
    public void checkMedical()
    {
        System.out.println("안구검사를 실시합니다.");
        System.out.println("시력검사를 실시합니다.");
    }

    public void checkMedicalforSurgery()
    {
        super.checkMedical();
        checkMedical();
    }


}


