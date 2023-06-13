package Quiz.no7;

import java.util.LinkedList;
import java.util.List;

public class BoardDao {

    public List<Board> list;

    public BoardDao()
    {
        list = new LinkedList<>();
    }

    public List<Board> getBoardList()
    {
        if (list.isEmpty())
        {
            list.add(new Board("제목1", "내용1"));
            list.add(new Board("제목2", "내용2"));
            list.add(new Board("제목3", "내용3"));
        }
        
        return list;
    }
}
