package quiz.question_3;

public class Container<K, V> {

    private K key;
    private V value;

    public Container()
    {
        key = null;
        value = null;
    }

    public Container(K key, V value)
    {
        this.key = key;
        this.value = value;
    }
    
    public void set(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    public K getKey()
    {
        return this.key;
    }

    public V getValue()
    {
        return this.value;
    }
}
