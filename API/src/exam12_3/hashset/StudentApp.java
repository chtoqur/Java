package exam12_3.hashset;

import javax.swing.event.SwingPropertyChangeSupport;

public class StudentApp {

    public static void main(String[] args) {
        CloneTest();
    }
    
    public static void CloneTest()
    {
        Student st1 = new Student("jsh", 1);
        st1.setScore(new int[]{80, 90, 100});

        Student st2 = null;
        try
        {
            st2 = (Student)st1.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        } 

        System.out.println(st1);    // 80 90 100
        st1.setScore(20, 20, 20);
        System.out.println(st2);    // 20 20 20
        System.out.println(st1);
    }


}
