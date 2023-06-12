package Set.exam7_Comparator;

import java.util.Comparator;

public class StringCompare implements Comparator<Person> {
    
    public int compare(Person p1, Person p2)
    {
        return p1.getName().compareTo(p2.getName());
    }
}
