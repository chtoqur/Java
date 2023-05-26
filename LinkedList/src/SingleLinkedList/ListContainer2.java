package SingleLinkedList;
public class ListContainer2 {
    // 문지기 역할, 데이터 제어

    public static final int ERROR_VALUE = Integer.MIN_VALUE;
    public Node head;       // 노드 시작점
    public int nodeCount;   // 노드의 개수

    public ListContainer2()
    {
        this.head = null;
        this.nodeCount = 0;
    }

    // 노드 추가
    public boolean insertNode(Node node)
    {
        Node lastNode = null;

        // 노드의 개수가 0인 경우에는 head에 연결
        if (nodeCount == 0)
        {
            // head에 노드의 참조값 집어넣기
            head = node;
        }
        // 그렇지 않은 경우는 가장 마지막 노드에 연결
        else
        {
            lastNode = getLastNode();
            lastNode.next = node;
        }

        nodeCount++;
        return true;
    }

    // 마지막 노드 찾는 함수
    private Node getLastNode()
    {
        // 맨 처음 헤드부터 시작
        Node target = head;

        if (nodeCount == 0)
            return null;
        
            // head를 제외하고 순회하므로 -1
        for (int i = 0; i < nodeCount - 1; i++)
        {
            target = target.next;
        }
            
        return target;
    }
    

    public Node getNode(int index)
    {
        Node target = head;
        
        if ((index < 0) || (index >= nodeCount))
            return null;

        // target을 찾는다.
        for (int i = 0; i < index; i++)
        {
            target = target.next;
        }

        // 노드를 만들고 target의 내용을 복사한다
        Node returnNode = new Node(target.value);
            
        return returnNode;
    }

    // 노드 삭제
    // 삭제 성공시 = true
    public boolean deleteNode(int index)
    {
        Node target = head;
        Node before = null;

        if ((index < 0) || (index >= nodeCount))
            return false;

        // 첫번째 노드를 삭제하는 경우
        if (index == 0)
        {
            this.head = target.next;
        }
        // 두번째 이후의 노드 삭제
        else
        {
            for (int i = 0; i < index; i++)
            {
                before = target;
                target = target.next;
            }
            before.next = target.next;
            // 아래와 동일한 코드
            // before.next = before.next.next;
        }

        nodeCount--;
        return true;
    }

    // 속성값만 출력
    public void printAll()
    {
        Node target = head;

        for (int i = 0; i < nodeCount; i++)
        {
            System.out.printf("%dth %d, %s\n", i, target.value, target.next);
            target = target.next;
        }

    }

    

}
