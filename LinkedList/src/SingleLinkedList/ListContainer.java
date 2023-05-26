package SingleLinkedList;
public class ListContainer {
    // 문지기 역할, 데이터 제어

    public static final int ERROR_VALUE = Integer.MIN_VALUE;
    private Node head;       // 노드 시작점
    private int nodeCount;   // 노드의 개수

    public ListContainer()
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
    
    // index에 맞는 노드 불러오기

    // 1. getNode
    // node 전체정보 반환 (next 정보 포함)
    private Node getNode(int index)
    {
        Node target = head;

        // 첫번째 노드 삭제하는 경우
        if (index == -1)
        {
            return target;
        }

        // 노드가 생성되지 않은 경우
        if (nodeCount == 0)
        {
            return null;
        }

        // 그 외 정상적으로 작동할 때
        for (int i = 0; i < index; i++)
        {
            target = target.next;
        }

        return target;
    }



    // 2. getNode
    // 속성만 반환 (next 정보 미포함)
    private boolean getNodeAtt(int num) 
    {
        Node targetNode = head;
        int nodeContainer = 0;      // 노드 속성 넘겨줄 공간

        // 노드가 생성되지 않은 경우
        if (this.nodeCount == 0)
        {
            return false;
        }

        // 그 외 정상적으로 작동할 때
        for (int i = 0; i < num; i++)
        {
            // 제 3의 공간에 속성값 넘겨주기
            nodeContainer = targetNode.getValue();
            System.out.println(nodeContainer);      // 출력
            targetNode = targetNode.next;           // 타겟노드 바꿔주기
        }

        // way2
        // 배열에 넣어서 출력해주기
        // int[] nodeValue = new int[nodeCount];
        
        // for (int i = 0; i < num; i++)
        // {
        //     // 제 3의 공간에 속성값 넘겨주기
        //     nodeContainer = targetNode.getValue();
        //     nodeValue[i] = nodeContainer;
        //     targetNode = targetNode.next;           // 타겟노드 바꿔주기
        // }

        // for (int i = 0; i < num; i++)
        // {
        //     System.out.println(nodeValue[i]);      // 출력
        // }

        return true;
    }

    // 노드 삭제
    // 몇번째 노드를 지워라
    // 삭제 성공 = true

    // deleteNode by index
    public boolean deleteNode(int index)
    {
        Node previousNode = getNode(index - 1);     // 이전 노드
        Node deleteNode = getNode(index);           // 삭제 노드
        Node nextNode = deleteNode.next;            // 삭제 노드의 다음 노드

        // 노드가 생성되지 않은 경우 (getNode 리턴값 null)
        // 노드 삭제 실패
        if (previousNode == null)
            return false;

        if ((index < 0) || (index >= nodeCount))
            return false;

        // 첫번째 노드를 삭제하는 경우
        // 이 경우 previousNode = head = deleteNode 셋의 시작정보가 같음
        if (index == 0)
        {
            // head에 삭제노드의 next 속성 반환
            this.head = nextNode;

            nodeCount--;
            return true;
        }

        // 두번째 이후의 노드 삭제
        previousNode.next = nextNode;
        // 아래와 동일한 코드
        // previousNode.next = previousNode.next.next;

        nodeCount--;
        return true;
    }

    public int findNode(int value)
    {
        Node targetNode = head;

        // 값을 넣어서 이 값이 몇번째 노드에 들어있는지
        for (int i = 0; i < nodeCount; i++)
        {
            if (targetNode.getValue() == value)
            {
                return i;
            }
            targetNode = targetNode.next;
        }

        return ERROR_VALUE;
    }

    // 노드로 지우는 것
    public boolean deleteNode(Node node)
    {
        Node target = head;
        Node before = null;
        int nodeOrder = 0;

        // if ((index < 0) || (index >= nodeCount))
        // return false;

        if (nodeCount == 1)
        {
            this.head = target.next;
        }
        else
        {
            for (int i = 0; i < nodeCount; i++)
            {
                if (node == target)
                {
                    before.next = target.next;
                }

                before = target;
                target = target.next;
            }
        }

        nodeCount--;
        return true;

    }

    // 속성값만 출력
    public boolean printAll()
    {
        // 노드 없는 경우
        if (nodeCount == 0)
        {
            return false;
        }

        getNodeAtt(nodeCount);
        return true;

    }

}
