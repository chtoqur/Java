package quiz.question_4;

public class Util {

    public Util() {}
    
    // 리턴값은 Pair에 저장된 값
    public static <K, V> V getValue(Pair<K, V> p, K key)
    {
        if(p.getKey().equals(key))
        {
            return p.getValue();
        }
        else
        {
            return null;
        }
    }
}
