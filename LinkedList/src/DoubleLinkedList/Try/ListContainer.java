package DoubleLinkedList.Try;

import javax.lang.model.util.ElementScanner14;

public class ListContainer {

    private Node header;
    private Node tail;
    private int nodeCount;

    // 생성자
    public ListContainer()
    {
        header = null;
        tail = null;
        nodeCount = 0;
    }

    public Node getNode(int index)
    {
        Node target = header;
        
        if ((index < 0) || (index >= nodeCount))
            return null;

        // target을 찾는다.
        for (int i = 0; i < index; i++)
        {
            target = target.next;
        }

        return target;
    }
    
    // 노드 추가 메서드
    // return : 추가한 위치 인덱스, 추가가 실패한 경우 -1
    public int insertNode(Node newNode, int pos)
    {
        // 맨 앞 추가, 최초 노드 생성
        if (nodeCount == 0)
        {
            // 헤더와 노드 연결
            header = newNode;
            // 테일과 노드 연결
            tail = newNode;
            nodeCount++;

            return 0;
        }
        // 맨 앞 추가
        else if (pos == 0)
        {
            // 기존의 첫번째 노드를 newNode의 next로 설정
            newNode.next = header;
            // newNode로 헤드 변경
            header = newNode;
            // 두번째 노드의 prev를 newNode로 설정
            newNode.next.prev = newNode;

            nodeCount++;

            return 0;
        }
        // 맨 뒤
        else if (pos == nodeCount)
        {
            // 마지막 노드의 next
            // 삽입될 노드의 prev
            newNode.prev = tail;
            tail.next = newNode;
            
            tail = newNode;
            nodeCount++;

            return nodeCount - 1;
        }
        // 중간 삽입
        else
        {
            Node prevNode = getNode(pos - 1);
            Node nextNode = prevNode.next;

            prevNode.next = newNode;
            newNode.prev = prevNode;
            newNode.next = nextNode;
            nextNode.prev = newNode;

            nodeCount++;
            return pos;
        }
    }
    
    // 노드 삭제 메서드
    public boolean deleteNodeByIndex(int pos)
    {
        // 삭제 성공시 true
        // 삭제 실패시 false

        if (nodeCount == 0)
        {
            return false;
        }
        // 첫번째 노드 삭제
        else if (pos == 0)
        {
            // 헤더와의 연결 끊기
            header = header.next;
            nodeCount--;

            return true;
        }
        // 마지막 노드 삭제
        else if (pos == nodeCount - 1)
        {
            tail.prev.next = null;
            tail = tail.prev;
            nodeCount--;

            return true;
        }
        else
        {
            Node target = this.header;

            for (int i = 0; i < pos; i++)
            {
                target = target.next;
            }
            target.prev.next = target.next;
            target.next.prev = target.prev;
            nodeCount--;

            return true;
        }
    }
    
    public boolean deleteNodeByKey(int key)
    {
        Node target = this.header;
        int targetPos = 0;

        for (int i = 0; i < nodeCount; i++)
        {
            if (target.getKey() == key)
            {
                targetPos = i;
                break;
            }
            target = target.next;
        }

        return deleteNodeByIndex(targetPos);
    }

    // bLike : false -> 정확하게 같은것만 지운다.
    // bLike : true  -> value를 포함하고 있으면 모두 지운다.
    public boolean deleteNodeByValue(String value, boolean bLike)
    {
        Node target = this.header;
        int targetPos = 0;

        if (bLike == false)
        {
            for (int i = 0; i < nodeCount; i++)
            {
                if (target.getValue().equals(value))
                {
                    targetPos = i;
                    break;
                }
                target = target.next;
            }
            return deleteNodeByIndex(targetPos);
        }
        else if (bLike == true)
        {
            for (int i = 0; i < nodeCount; i++)
            {
                if (target.getValue().contains(value) == true)
                {
                    deleteNodeByIndex(i);
                    i--;
                }
                target = target.next;
            }
            return true;
        }
        return false;
    }

    // 노드 프린트 메서드
    public void printNodeList()
    {
        Node target = this.header;

        for (int i = 0; i < nodeCount; i++)
        {
            System.out.printf("position : %d, value : %s\n", i, target.getValue());
            target = target.next;
        }
    }

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

}
