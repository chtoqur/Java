package Set.exam4_quiz;

import java.util.Objects;

public class Student {
    
    private int    number;      // 번호
    private String name;        // 이름
    private String address;     // 주소
    private String staff;       // 반장("leader"), 스탭("staff")... 일반학생은 ""
    
    // 생성자
    public Student()
    {
        number = 0;
        name = "";
        address = "";
        staff = "";
    }

    // 오버로딩 생성자
    public Student(int number, String name, String address, String staff)
    {
        setNumber(number);
        this.name = name;
        this.address = address;
        this.staff = staff;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Student)
        {
            Student target = (Student)obj;

            if ((this.getName().equals(target.getName())) &&
                (this.getNumber() == target.getNumber()) &&
                (this.getAddress().equals(target.getAddress())))
            {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        return ((name.hashCode() + address.hashCode()) + number) % 3;
    }

    @Override
    public String toString()
    {
        return "{" +
            " name='" + getName() + "'" +
            ", address='" + getAddress() + "'" +
            ", number='" + getNumber() + "'" +
            ", staff='" + getStaff() + "'" +
            "}";
    }

    // Getter / Setter

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return this.address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getNumber()
    {
        return this.number;
    }

    public void setNumber(int number)
    {
        if ((number <= 0))
            return;
        
        else
        {
            this.number = number;
        }
    }

    public String getStaff()
    {
        return this.staff;
    }

    public void setStaff(String staff)
    {
        this.staff = staff;
    }
}
