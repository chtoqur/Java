public class Member {
    
    private String name;
    private String id;
    private String password;
    private int age;

    // 생성자
    public Member()
    {
        name = "";
        id = "";
        password = "";
        age = 0;
    }
    
    // 오버로드 생성자
    public Member(String name, String id)
    {
        this.name = name;
        this.id = id;
    }

    public Member(String name, String id, String password, int age)
    {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
    }

    // 게터, 세터
    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getId()
    {
        return this.id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getPassword()
    {
        return this.password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    
}
