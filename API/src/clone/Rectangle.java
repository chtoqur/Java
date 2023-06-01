package clone;

import javax.lang.model.util.ElementScanner14;

// 사각형 클래스
public class Rectangle implements Cloneable {

    public static final int ERROR_NUM = Integer.MIN_VALUE;

    private Point leftTop;
    private Point rightBottom;
    private int width;
    private int height;

    // 1. 생성자(기본, 오버로딩)
    // 2. Getter / Setter
    // 3. @Override equals()
    // 4. hashcode()
    // 5. @Override toString()
    // 6. (옵션) Clone()

    // 1. 생성자(기본, 오버로딩)
    public Rectangle()
    {
        leftTop = new Point();
        rightBottom = new Point();
        width = 0;
        height = 0;
    }

    public Rectangle(Point leftTop, Point rightBottom) throws WrongPointException
    {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
        setWidth(leftTop.getXPos(), rightBottom.getXPos());
        setHeight(leftTop.getYPos(), rightBottom.getYPos());
        
        if ((this.getWidth() <= 0) || (this.getHeight() <= 0))
        {
            throw new WrongPointException();
        }
    }

    public Rectangle(int left, int top, int right, int bottom) throws WrongPointException
    {
        this.leftTop = new Point(left, top);
        this.rightBottom = new Point(right, bottom);
        setWidth(leftTop.getXPos(), rightBottom.getXPos());
        setHeight(leftTop.getYPos(), rightBottom.getYPos());
            
        if ((this.getWidth() <= 0) || (this.getHeight() <= 0))
        {
            throw new WrongPointException();
        }
    }

    // 2. Getter / Setter
    public int getWidth() {
        return this.width;
    }

    // 가로
    public void setWidth(int width) {
        this.width = width;
    }

    // 오버로딩
    public void setWidth(int left, int right) {

        // 1. left&right 음수
        if ((left < 0) && (right <= 0))
        {
            this.width = -(left-right);
        }
        // 2. left&right 양수
        else if ((left >= 0) && (right > 0))
        {
            this.width = right - left;
        }
        // 3. left-음수 right-양수
        else if ((left < 0) && (right > 0))
        {
            this.width = -(left) + right;
        }
        else
        {
            this.width = ERROR_NUM;
        }

        if (this.width < 0)
        {
            this.width = ERROR_NUM;
        }
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // 오버로딩
    public void setHeight(int top, int bottom) {

        // 1. top&bottom 음수
        if ((top <= 0) && (bottom < 0))
        {
            this.height = -(bottom-top);
        }
        // 2. top&bottom 양수
        else if ((top > 0) && (bottom >= 0))
        {
            this.height = top - bottom;
        }
        // 3. top-양수 bottom-음수
        else if ((top > 0) && (bottom < 0))
        {
            this.height = -(bottom) + top;
        }
        else
        {
            this.height = ERROR_NUM;
        }
    }

    public String getLeftTop() {
        return "(" + leftTop.getXPos() + "," + leftTop.getYPos() + ")";
    }

    public void setLeftTop(Point leftTop) {
        this.leftTop = leftTop;
    }

    public void setLeftTop(int left, int top) {
        this.leftTop.setXPos(left);
        this.leftTop.setYPos(top);
    }

    public String getRightBottom() {
        return "(" + rightBottom.getXPos() + "," + rightBottom.getYPos() + ")";
    }

    public void setRightBottom(Point rightBottom) {
        this.rightBottom = rightBottom;
    }
    
    public void setRightBottom(int right, int bottom) {
        this.rightBottom.setXPos(right);
        this.rightBottom.setYPos(right);
    }

    // 3. @Override equals()
    @Override
    public boolean equals(Object obj)
    {
        Rectangle target = null;
        if (obj instanceof Rectangle)
        {
            target = (Rectangle)obj;

            if (false == this.leftTop.equals(target.leftTop))
                return false;
    
            if (false == this.rightBottom.equals(target.rightBottom))
                return false;
    
            return true;
        }
        return false;
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
            " leftTop='" + getLeftTop() + "'" +
            ", rightBottom='" + getRightBottom() + "'" +
            ", width='" + getWidth() + "'" +
            ", height='" + getHeight() + "'" +
            "}";

            // return "{" +
            // " leftTop='" + getLeftTop().toString() + "'" +
            // ", rightBottom='" + getRightBottom().toString() + "'" +
            // ", width='" + getWidth() + "'" +
            // ", height='" + getHeight() + "'" +
            // "}";
    }

    // 6. (옵션) Clone()
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        Rectangle cloneObject = (Rectangle)super.clone();

        cloneObject.setLeftTop(new Point(leftTop.getXPos(), leftTop.getYPos()));
        cloneObject.setRightBottom(new Point(rightBottom.getXPos(), rightBottom.getYPos()));

        // way2
        // cloneObject.leftTop = (Point)this.leftTop.clone();
        // cloneObject.rightBottom = (Point)this.rightBottom.clone();

        return cloneObject;
    }

    // 7. 추가 메소드
    public double getSize()
    {
        return getHeight() * getWidth();
    }

    public int getCircum()
    {
        return 2 * (getHeight() + getWidth());
    }

}
