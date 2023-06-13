package Quiz.no10;

import java.util.Objects;

public class Student implements Comparable<Student> {
    
    public String id;
    public int score;

    public Student()
    {
        id = "";
        score = 0;
    }

    public Student (String id, int score)
    {
        this.id = id;
        this.score = score;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Student target)
        {
            if (target.id.equals(this.id))
                return true;
        }
        return false;
    }

    @Override
    public int compareTo(Student s)
    {
        return this.score - s.getScore();
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", score='" + getScore() + "'" +
            "}";
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
