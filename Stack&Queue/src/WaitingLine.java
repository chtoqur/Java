import java.util.*;

public class WaitingLine {
    
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 30;     // 최대 30팀까지만 대기 가능
    public static final int WRITE_WAITINGLIST = 1;
    public static final int MANAGE_WAITINGLIST = 2;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userInput = null;
        int select = 0;
        String name = null;
        int deleteNum = 0;

        // 현재 웨이팅 가능?..

        while(true) {
            System.out.println();
            System.out.println("-----------------------------------------");
            System.out.println("1. 웨이팅등록 | 2. 대기열관리  | 3. 종료");
            System.out.println("-----------------------------------------");
            System.out.printf("선택> ");

            try{
                userInput = scan.nextLine();
                select = Integer.parseInt(userInput);
    
                switch (select) {

                    case WRITE_WAITINGLIST:

                        System.out.println("----------");
                        System.out.println("웨이팅등록");
                        System.out.println("----------");
                        
                        System.out.printf("이름: ");
                    
                        userInput = scan.nextLine();
                        name = userInput;

                        q.offer(name);
                        System.out.println("예약에 성공하였습니다.");
                        
                        break;
    
                    case MANAGE_WAITINGLIST:

                        System.out.println("----------");
                        System.out.println("대기열관리");
                        System.out.println("----------");
                        System.out.println("몇개의 대기열을 삭제하시겠습니까?");

                        userInput = scan.nextLine();
                        deleteNum = Integer.parseInt(userInput);

                        for (int i = 0; i < deleteNum; i++)
                        {
                            System.out.printf("삭제된 대기열: ");
                            System.out.println(q.poll());
                        }

                        System.out.printf("%d개의 대기열을 삭제하였습니다.", deleteNum);

                    break;
                
                    default:
                        break;
                }

            }
            catch (Exception e)
            {
                System.out.println("입력오류입니다.");
            }
            
        }
    }
}
