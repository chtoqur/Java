import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 주문을 받기 위한 스캐너
        Scanner scan = new Scanner(System.in);

        // 메인메뉴 객체
        Menu mainMenu = new Menu();
        String orderedMenu;

        // 서빙객체
        Server JWLee = new Server();
        JWLee.setMenu(mainMenu);
        boolean res = false;

        do{
            JWLee.showMenuAll();
            
            orderedMenu = scan.nextLine();

            res = JWLee.order(orderedMenu);
            if (true == res)
            {
                System.out.println("주문이 완료되었습니다.");
            }
            else
            {
                System.out.println("그런메뉴는 없습니다.");
                
                
            }

        }while(res == false);
        
        ////////////////


        scan.close();
    }
}
