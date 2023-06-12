package Set.exam6_TreeSet;

public class Person implements Comparable<Person> {
    private int age;
    private String name;

    public Person()
    {
        age = 0;
        name = "";
    }

    public Person(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Person p)
    {
        return this.age - p.age;
    }

    @Override
    public String toString() {
        return "{" +
            " age='" + age + "'" +
            ", name='" + name + "'" +
            "}";
    }

}
