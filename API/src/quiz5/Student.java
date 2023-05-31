package quiz5;

public class Student {
    
    private String studentNum;

    public Student(String studentNum)
    {
        this.studentNum = studentNum;
    }

    public String getStudentNum()
    {
        return studentNum;
    }

    // 코드 작성
    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Student stu)
        {
            if(this.studentNum.equals(stu.getStudentNum()))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        int hashCode = super.hashCode() + Integer.parseInt(studentNum);
        return hashCode;
    }
}
