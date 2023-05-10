// src > academy > 아래에 있는 파일
package academy;

public class Student {
    
    public String name;    // 이름
    public String school;  // 학교
    public int grade;      // 학년
    
    // 생성자
    //      1. 기본생성자는 반드시 무조건 만들어줄 것
    //      why?    1-1) 배열 때문 
    //      2. 활용도에 따라 오버로딩된 생성자를 만들어준다
    //      3. 아무런 생성자가 없는 경우
    //         > 자바는 기본생성자를 자동으로 만들어 넣어줍니다.
    //      4. 기본생성자 없는 상태에서 오버로딩된 생성자만 있는 경우
    //         > 자바는 생성자에 대해 관여하지 않고,
    //           기본생성자가 없는 상태이기 때문에 ERROR

    // 기본생성자
    public Student()
    {
        System.out.println("DEFAULT CONSTRUCTOR");

        name = "";
        school = "";
        grade = 0;
    }

    // 오버로딩(Overloading)된 생성자
    // Overloading : 함수를 호출 시 함수의 이름과 파라메터 정보를
    //               복합적으로 해석해서 호출하는 기법
    public Student(String name, String school, int grade)
    {
        this.name = name;
        this.school = school;
        this.grade = grade;
    }

    // grade 값을 받아서 객체의 grade에 넣어주기만 하면 되므로 리턴값은 없음
    public void setGrade(int grade)
    {
        this.grade = grade;
    }

    public int getGrade()
    {
        return grade;
    }

}
