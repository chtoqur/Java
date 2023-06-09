package Set.exam4_TreeSet;

import java.util.Objects;

import javax.lang.model.util.ElementScanner14;

public class Student implements Comparable <Student> {
    
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
    public Student(int number, String name)
    {
        this.number = number;
        this.name = name;
        this.address = "";
        this.staff = "";
    }
    
    public Student(int number, String name, String address, String staff)
    {
        setNumber(number);
        this.name = name;
        this.address = address;
        this.staff = staff;
    }

    @Override
    public int compareTo(Student stu)
    {

        return this.number - stu.number;
        
        // 1. 파라메터값이 앞으로 가는 경우
        // => 양수를 리턴
        // 2. this가 앞으로 가는 경우
        // => 음수를 리턴
        // 3. 두 값이 같아서 swap이 불필요한 경우
        // => 0을 리턴

        // 큰 수와 작은 수 둘 중 어떤 수가 앞쪽에 위치할 것인지
        // 프로그래머가 기준을 정해줘야 swap이 가능함
        
        // 오름차순 정렬

        // stu의 넘버가 더 작은 경우
        // if (this.number > stu.number)
        // {
        //     return 1;
        // }
        // // this의 넘버가 더 작은 경우
        // else if (this.number < stu.number)
        // {
        //     return -1;
        // }
        // else // if (this.number == stu.number)
        // {
        //     // 변경하지 않는 다는 뜻
        //     return 0;
        // }
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Student)
        {
            Student target = (Student)obj;

            if ((this.getName().equals(target.getName())) &&
                (this.getNumber() == target.getNumber()))
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
        return (name.hashCode() + number) % 3;
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
