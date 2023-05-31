package clone;
import java.util.Objects;

public class Point implements Cloneable {
    // x, y 좌표를 저장하기 위한 클래스
    private int xPos;
    private int yPos;

    // 1. 생성자(기본, 오버로딩)
    // 2. Getter / Setter
    // 3. @Override equals()
    // 4. hashcode()
    // 5. @Override toString()
    // 6. (옵션) Clone()

    // 1. 생성자(기본, 오버로딩)
    public Point()
    {
        xPos = 0;
        yPos = 0;
    }

    public Point(int xPos, int yPos)
    {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    // 2. Getter / Setter
    public int getXPos() {
        return this.xPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public int getYPos() {
        return this.yPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    // 3. @Override equals()
    @Override
    public boolean equals(Object obj)
    {
        Point target = (Point)obj;

        if ((target.getXPos() != this.getXPos()))
            return false;

        if ((target.getYPos() != this.getYPos()))
            return false;
        
        return true;
    }

    // 4. hashcode()
    @Override
    public int hashCode()
    {
        int hashCode = super.hashCode();
        return hashCode;
    }

    // 5. @Override toString()
    @Override
    public String toString() {
        return "{" +
            " xPos='" + getXPos() + "'" +
            ", yPos='" + getYPos() + "'" +
            "}";
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        // 모두 primitive type 필드이기 때문에
        // 기본 호출만해도 문제가 되지 않음
        // 만약 필드가 논프리미티브 타입의 필드이고 다른 배열 등을 가르키고 있다면 수정이 필요함
        return super.clone();
    }

    


}
