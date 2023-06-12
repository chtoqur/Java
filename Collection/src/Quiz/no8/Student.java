package Quiz.no8;

import java.util.Objects;

public class Student {
    
    public int studentNum;
    public String name;

    public Student (int studentNum, String name)
    {
        this.studentNum = studentNum;
        this.name = name;
    }

    // 코드 작성
    @Override
    public int hashCode()
    {
        return Objects.hash(studentNum);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Student target)
        {
            if (target.getStudentNum() == this.studentNum)
            {
                return true;
            }
        }
        return false;
    }

    public int getStudentNum() {
        return this.studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
