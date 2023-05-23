package Quiz;

public class Colleage implements Friend {
    
    // 필드
    public String name;
    private String major;
    public String phone;
    private String[][] peopleArr;

    // 기본 생성자
    public Colleage()
    {
        name = "";
        major = "";
        phone = "";
    }

    // 오버로딩 생성자
    public Colleage(String name, String major, String phone)
    {
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    public void show()
    {

    }

    // 인맥 추가
    @Override
    public void addFrined(String name, String number)
    {

    }

    // @Override
    // public Boolean addPeople(String people, String major, String phoneNum)
    // {
    //     if (this.peopleArr.length < 5)
    //     {
    //         for (int i = 0; i < this.peopleArr.length; i++)
    //         {
    //             if (this.peopleArr[i] == null)
    //             {
    //                 this.peopleArr[i][0] = people;
    //                 this.peopleArr[i][1] = major;
    //                 this.peopleArr[i][2] = phoneNum;
    //             }
    //         }
    //         return true;
    //     }
    //     return false;
    // }

    // @Override
    // public void show()
    // {
    //     super.show();
    //     System.out.println("major : " + this.major);
    // }

}
