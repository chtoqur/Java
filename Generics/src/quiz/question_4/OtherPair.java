package quiz.question_4;

public class OtherPair<K, V> {
    
    private K key;
    private V value;

    public OtherPair()
    {
        key = null;
        value = null;
    }

    public OtherPair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    public K getKey()
    {
        return key;
    }

    public V getValue()
    {
        return value;
    }
}
