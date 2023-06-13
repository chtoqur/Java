package Quiz.no10;

import java.util.Comparator;

public class CompareString implements Comparator<Student> {
    
    public int compare(Student s1, Student s2)
    {
        return s1.getId().compareTo(s2.getId());
    }
}
