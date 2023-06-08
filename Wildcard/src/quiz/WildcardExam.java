package quiz;

public class WildcardExam {
    
    public static void addBox(Box<? extends Integer> b1, Box<? extends Integer> b2, Box<? super Integer> b3)
    {
        b3.set(b1.get() + b2.get());

        // 이 메서드의 문제점
        // 결과를 b3가 아닌 b1에다 넣는 것도 가능하다는 것
        // 아래의 코드가 에러가 발생하도록 와일드카드를 이용해서 만들어보기
        // b1.set(b2.get());
        // b2.set(b3.get());
    }
}
