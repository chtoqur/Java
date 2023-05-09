public class Floating {
    public static void main(String[] args) {
        // ■ 실수형은 float과 double 두 종류가 있습니다.
        // float : 4byte
        // double : 8byte

        // float형은 postfix 'f'를 붙여준다.
        float pi = 3.14f;
        System.out.println(pi);
        
        // double형은 postfix를 생략한다.
        double pi2 = 3.14;
        System.out.println(pi2);
        
        // 소숫점 계산할 때는 float보다 double을 사용한다.
        // float은 소수점 자릿수가 4개 정도까지밖에 표현되지 않아서
        // 자칫 잘못하면 데이터가 유실될 수 있음. 이 때문에 postfix로 표현해주는 것
        // 안정성이 우선시되기 때문에 float이 아닌 double을 주로 사용함
        float res = pi * 0.31f;
        System.out.println(res);
    }
}
