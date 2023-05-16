public class Stack {
    
    public static final int ERROR_STACK = Integer.MIN_VALUE;
    // 스택포인터 - push & pop 위치정보
    private int sp;
    private int[] ar;
    private int size;

    public Stack()
    {
        sp = 0;
        ar = null;
        size = 0;
    }

    public Stack(int size)
    {
        sp = 0;
        this.size = size;
        // 크기만큼 데이터 잡아줌
        ar = new int[size];
    }

    // 초기화 함수
    public boolean init(int size)
    {
        sp = 0;
        this.size = size;
        // 크기만큼 데이터 잡아줌
        ar = new int[size];
        return true;
    }

    public boolean isOverFlow()
    {
        if(sp == size)
        {
            return true;
        }
        return false;
    }

    // 데이터 집어넣을 정수
    // return
    //      true > push 성공
    //      false > push 실패
    public boolean push(int data)
    {
        if(isOverFlow())
        {
            return false;
        }

        ar[sp] = data;
        sp++;
        
        return true;
    }

    public boolean isUnderFlow()
    {
        if(sp == 0)
        {
            return true;
        }
        return false;
    }

    // return
    //      정상인 경우 data를 리턴
    //      비정상인 경우 Integer의 최소값을 리턴한다.
    public int pop()
    {
        if (isUnderFlow())
        {
            // 리턴값 정할 때 조심해야함
            // 진짜 사용자가 넣은 값을 리턴값이라고 착각할수도 있음

            // Integer가 가질 수 있는 최소값
            return ERROR_STACK;
        }

        sp--;
        return ar[sp];

    }


}
