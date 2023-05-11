public class SingletonExample {
    public static void main(String[] args) {
        
        // ERROR
        // Singleton obj1 = new Singleton();

        // 정적 메소드 호출을 통한 싱글톤 객체 얻기
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // 이 때 obj1과 obj2는 같은 객체를 참조함
        if(obj1 == obj2)
        {
            System.out.println("같은 Singleton 객체입니다.");
        }
        else
        {
            System.out.println("상이한 Singleton 객체입니다.");
        }
    }
}
