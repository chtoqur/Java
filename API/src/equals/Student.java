package equals;
public class Student {

    private String name;    // 이름
    private int num;        // 번호



    // 1. 기본생성자, 오버로딩된 생성자
    // 2. Getter, Setter
    // 3. @Override equals

    public Student()
    {

    }

    public Student(String name, int num)
    {
        this.name = name;
        this.num = num;
    }

    @Override
    public boolean equals(Object obj)
    {
        Student target = null;
        if (obj instanceof Student)
        {
            target = (Student)obj;
        }
        else
        {
            return false;
        }

        if (false == this.name.equals(target.name))
        {
            return false;
        }

        if (this.num != target.num)
        {
            return false;
        }
        
        return true;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public int hashCode()
    {
        return (super.hashCode() + num);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", num='" + getNum() + "'" +
            "}";
    }

}