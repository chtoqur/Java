package List.exam15_2;

public class Board {
    
    private String subject;
    private String content;
    private String writer;

    public Board(String subject, String content, String writer)
    {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return this.writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
    
}
