package Quiz;

public class Work implements Friend {
    
    // 필드
    // 직장동료 : 이름, 부서, 전화번호
    public String name;
    private String dept;
    public String phone;

    // 기본 생성자
    public Work()
    {
        name = "";
        dept = "";
        phone = "";
    }

    // 오버로딩 생성자
    public Work(String name, String dept, String phone)
    {
        this.name = name;
        this.dept = dept;
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


    // public Boolean addPeople(String people, String major, String phoneNum)
    // {
    //     if (this.num == 5)
    //         return false;

    //     if (this.num == 0)
    //     {
    //         this.peopleArr[0][0] = people;
    //         this.peopleArr[0][1] = major;
    //         this.peopleArr[0][2] = phoneNum;

    //         num++;
    //         return true;
    //     }

    //     else
    //     {
    //         for (int i = 0; i < this.num; i++)
    //         {
    //             if (this.peopleArr[i + 1][0] == null)
    //             {
    //                 this.peopleArr[i + 1][0] = people;
    //                 this.peopleArr[i + 1][1] = major;
    //                 this.peopleArr[i + 1][2] = phoneNum;
    //             }
    //         }
    //         num++;
    //         return true;
    //     }
    // }

    // @Override
    // public Boolean print()
    // {
    //     if (num < 1)
    //     return false;

    //     for (int i = 0; i < num; i++)
    //     {
    //         System.out.printf("%s, %s, %s\n", this.peopleArr[i][0], this.peopleArr[i][1], this.peopleArr[i][2]);
    //     }
    //     return true;
    // }



    
}
