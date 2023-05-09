public class App {
    public static void main(String[] args) throws Exception {

        // 구구단을 출력하는 프로그램
        // 클래스를 이용해서 구현.

        // 1. 사용자에게 dan을 입력받는다.
        // > dan을 변수로 만들기 = int dan
        // 2. dan을 이용해서 dan x 1, ... dan x 9 까지 출력한다.
        // > 출력함수를 만들기 = printDan()

        // new Gugudan = Gugudan을 heap에다 얹는 것
        // 참조값을 gu에다 넣는 것
        // 데이터타입 = Gugudan.. class가 아님?

        // 참조값 = primitive type = stack 영역

        // 클래스는 한개지만 이 클래스를 통해 여러개의 객체(instance)를 찍어낼 수 있음

        // // 아래 코드의 의미
        // // 1. Gugudan 객체를 heap에 생성해라.
        // // 2. Gugudan() 생성자를 호출해라.
        // // 3. Gugudan 객체의 참조값을 gu에 저장해라.
        // Gugudan gu = new Gugudan();
        // // class는 대문자, 참조변수(gu)자리에 오는 것들은 카멜스타일(ex.inputResult)
        // gu.printDan();

        // // 아래 코드도 돌아가는 이유
        // // 1.2는 돌고 3은 자바가 임시참조변수를 생성해서 돌려버리기 때문
        // // 단 변수명이 없으니까 접근은 못함
        // new Gugudan();


        Gugudan gu = new Gugudan(3);
        gu.printDan();
    }
}
