package Exam1;

public class Student {
    
    private String name;
    private int age;
    private int grade;
    private int classNum;

    public Student()
    {
        name = "";
        age = 0;
        grade = 0;
        classNum = 0;
    }

    public Student(String name, int age)
    {
        this.name = name;
        try
        {
            this.age = age;
            if ((age <= 0) || (age > 150))
            {
                throw new ReadAgeException();
            }
        }
        catch(ReadAgeException e)
        {
            e.printStackTrace();
        }
    }

    public Student(String name, int age, int grade, int classNum)
    {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.classNum = classNum;
    }

    public String toString()
    {
        return "{name : " + this.name + 
                "age : " + this.age + "}";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClassNum() {
        return this.classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }
}
