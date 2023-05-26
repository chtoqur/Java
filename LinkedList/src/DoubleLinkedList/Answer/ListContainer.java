package DoubleLinkedList.Answer;

public class ListContainer {

    private Node header;
    private int nodeCount;
    private Node[] nodeArr;

    // 생성자
    public ListContainer()
    {
        header = null;
        nodeCount = 0;
        nodeArr = null;
    }
    
    // 노드 추가 메서드
    // return : 추가한 위치 인덱스, 추가가 실패한 경우 -1
    public int insertNode(Node newNode, int pos)
    {
        return -1;
    }

    // 완료
    public int insertNode(int key, String value, int pos)
    {
        new Node(key, value);
        return insertNode(new Node(key, value), pos);
    }
    
    public int insertNodeAtFront(Node newNode)
    {
        // 노드 첫 생성 = header에 연결
        if(nodeCount == 0)
        {
            this.header = newNode;
            nodeArr[0] = newNode;
            nodeCount++;
            return -1;
        }
        
        // 하나씩 밀고
        for(int i = 0; i < nodeArr.length; i++)
        {
            nodeArr[nodeCount] = nodeArr[nodeCount - 1];
            nodeCount--;
        }
        // 만들어진 맨 앞 빈자리에 추가
        header = newNode;
        nodeArr[0] = newNode;
        newNode.setNext(nodeArr[1]);
        nodeArr[1].setPrev(newNode);
        nodeCount++;
        return 0;
    }

    public int insertNodeAtBack(Node node)
    {
        // 노드 첫 생성 = header에 연결
        if(nodeCount == 0)
        {
            this.header = node;
            nodeArr[0] = node;
            nodeCount++;
            return true;
        }
        nodeArr[nodeCount - 1].setNext(node);
        node.setPrev(nodeArr[nodeCount - 1]);
        nodeCount++;
        return true;
    }

    public int insertNodeAtMiddle(int index, Node node)
    {
        // nodeCount - 1 / nodeCount 둘 중 선택
        if ((index == 0) || (index == nodeCount - 1))
        {
            return false;
        }

        // 뒷 노드들 하나씩 밀기
        for(int i = 0; i < node; i++)
        {
            nodeArr[nodeCount] = nodeArr[nodeCount - 1];
            nodeCount--;
        }

        // 전 노드와 연결
        nodeArr[index - 1].setNext(node);
        node.setPrev(nodeArr[index - 1]);
        node.setNext(node);
        
        // 배열에 삽입

        // 추가 성공시 true
        // 추가 실패시 false
    }

    // 노드 삭제 메서드
    // 위치(pos)로 삭제
    public boolean deleteNode(int pos)
    {
        return false;
    }
    
    public boolean deleteNodeByKey(int key)
    {

    }

    // bLike : false -> 정확하게 같은것만 지운다.
    // bLike : true  -> value를 포함하고 있으면 모두 지운다.
    public boolean deleteNodeByValue(String value, boolean bLike)
    {
        // 문자열은 완벽하게 매핑되는 경우가 있고,
        // 하...유틸 기능 ㅡㅡ?
        // 문자열을 포함한 것들은 전부 지우기
        
    }

    // 노드 프린트 메서드
    // Getter / Setter

    public Node getHeader()
    {
        return this.header;
    }

    public void setHeader(Node header)
    {
        this.header = header;
    }

    public int getNodeCount()
    {
        return this.nodeCount;
    }

    public Node[] getNodeArr()
    {
        return this.nodeArr;
    }

}
