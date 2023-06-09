package Set.exam2_HashSet;

public class Num {
    
    private int num;
    
    public Num(int n)
    {
        num = n;
    }

    @Override
    public String toString()
    {
        return String.valueOf(num);
    }

    @Override
    public boolean equals(Object obj)
    {
        Num o = (Num)obj;
        if (this.num == o.num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public int hashCode()
    {
        return num % 5;
    }

}
