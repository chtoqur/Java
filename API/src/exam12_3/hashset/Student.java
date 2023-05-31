package exam12_3.hashset;

public class Student implements Cloneable {
    private String name;
    private int no;
    private int[] score;

    public Student(String name, int no)
    {
        this.no = no;
        this.name = name;
    }

    public int getNo()
    {
        return no;
    }
    public String getName()
    {
        return name;
    }

    @Override
    public int hashCode()
    {
        int hashCode = no +  name.hashCode();
        return hashCode;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Student target)
        {
            if(no == target.getNo() && name.equals(target.getName()))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        Student newObject = (Student)super.clone();
        newObject.score = new int[3];
        newObject.score[0] = this.score[0];
        newObject.score[1] = this.score[1];
        newObject.score[2] = this.score[2];

        return newObject;
    }

    public void setScore(int[] score)
    {
        this.score = score;
    }

    public void setScore(int s0, int s1, int s2)
    {
        this.score[0] = s0;
        this.score[1] = s1;
        this.score[2] = s2;
    }

    public int[] getScore()
    {
        return this.score;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", no='" + getNo() + "'" +
            ", score='" +
            this.score[0] + " " + this.score[1] + " " + this.score[2] + 
            "}";
    }

}
