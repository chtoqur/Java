package Exam06;

public class Child extends Parent {

    public int studntNo;

    public Child()
    {
        
    }

    public Child(String name, int studntNo)
    {
        super(name);
        this.studntNo = studntNo;
    }
}