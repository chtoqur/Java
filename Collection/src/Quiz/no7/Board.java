package Quiz.no7;

public class Board {
    private String title;
    private String content;

    public Board(String title, String content)
    {
        this.title = title;
        this.content = content;
    }


    public String getTitle()
    {
        return this.title;
    }

    public String getContent()
    {
        return this.content;
    }
}
