public class ListContainer {
    // 문지기 역할, 데이터 제어

    public Node head;       // 노드 시작점
    public int nodeCount;   // 노드의 개수

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
    
    // index에 맞는 노드 가지고 오기
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

    // 노드 삭제
    // 몇번째 노드를 지워라
    // 삭제 성공 = true
    public boolean deleteNode(int index)
    {
        // targetNode = 삭제 바로 전 노드
        Node targetNode = getNode(index - 1);
        // deleteNode = 삭제 노드
        Node deleteNode = getNode(index);

        if (targetNode == null)
        {
            return false;
        }

        // 첫번째 노드 삭제
        // 이 경우 targetNode = head
        if (index == 0)
        {
            // head를 삭제될 노드의 next값으로 
            this.head = deleteNode.next;

            deleteNode = null;
            nodeCount--;
            return true;
        }

        // 두번째 이후의 노드 삭제
        targetNode.next = targetNode.next.next;
        deleteNode = null;
        nodeCount--;

        return true;
    }

    // 
    public void printAll()
    {
        for (int i = 0; i < nodeCount; i++)
        {
            Node printNode = getNode(i);
            System.out.println(printNode.value);
        }
    }

}
