import java.util.Scanner;

public class EzenCafe {
    public static void main(String[] args) throws Exception {

        // 1. 주문을 받기 위한 스캐너
        Scanner scan = new Scanner(System.in);
        
        // 2. 메인 메뉴 한개 인스턴스화, 객체화
        Menu mainMenu = new Menu();
        String orderedMenu;

        // 3. 서빙 객체 생성
        Server JWLee = new Server();
        JWLee.setMenu(mainMenu);
        boolean res = false;
        Barister barister = new Barister();

        do {
            // 메뉴 전체 보여줌
            JWLee.showMenuAll();

            // 손님에게 오더 받고 삽입
            orderedMenu = scan.nextLine();
            res = JWLee.order(orderedMenu);
    
            // 정상적인 주문인지 확인
            if (true == res)
            {
                System.out.println("주문이 완료되었습니다.");
            }
    
            else
            {
                System.out.println("비정상적인 주문입니다.");
            }

        } while(res == false);

        /////////////////////////
        // 바리스타에게 커피 주문
        Coffee orderedCoffee = barister.makeCoffee(JWLee.getMenuNumber());
        JWLee.Serving(orderedCoffee);

        scan.close();

    }
}
