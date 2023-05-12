public class Member {
    
    private String name;
    private String id;
    private String password;
    private int age;

    // 기본생성자는 반드시 있어야 한다
    // 생성자
    public Member()
    {
        // 자바에서 초기화 해주는 것과 동일하더라도
        // 명시적으로 코딩을 해주는 것을 강력히 권장
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

        // 안해도되지만 명시적으로 해줌
        password = "";
        age = 0;
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
