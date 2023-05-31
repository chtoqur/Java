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
    }

    public Rectangle(Point leftTop, Point rightBottom)
    {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }

    public Rectangle(int a, int b, int c, int d)
    {
        leftTop = new Point(a, b);
        rightBottom = new Point(c, d);
    }

    // 2. Getter / Setter
    public int getWidth() {
        return this.width;
    }

    public void setWidth(int left, int right) {

        if (left > right)
        {
            this.width = left - right;
        }
        else if (right > left)
        {
            this.width = right - left;
        }
        else if (left == right)
        {
            this.width = -1;
        }

    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int top, int bottom) {

        if (top > bottom)
        {
            this.height = top - bottom;
        }
        else if (bottom > top)
        {
            this.height = bottom - top;
        }
        else if (top == bottom)
        {
            this.height = -1;
        }
    }

    public String getLeftTop() {
        return "(" + leftTop.getXPos() + "," + leftTop.getYPos() + ")";
    }

    public void setLeftTop(Point leftTop) {
        this.leftTop = leftTop;
    }

    public String getRightBottom() {
        return "(" + rightBottom.getXPos() + "," + rightBottom.getYPos() + ")";
    }

    public void setRightBottom(Point rightBottom) {
        this.rightBottom = rightBottom;
    }

    // 3. @Override equals()
    @Override
    public boolean equals(Object obj)
    {
        Rectangle target = (Rectangle)obj;

        if ((target.leftTop.getXPos() != this.leftTop.getXPos()))
            return false;

        if ((target.leftTop.getYPos() != this.leftTop.getYPos()))
            return false;

        if ((target.rightBottom.getXPos() != this.rightBottom.getXPos()))
            return false;
        
        if ((target.rightBottom.getYPos() != this.rightBottom.getYPos()))
            return false;
        
        return true;
    }

    // 6. (옵션) Clone()
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        Rectangle newObject = (Rectangle)super.clone();

        newObject.leftTop = this.leftTop;
        newObject.rightBottom = this.rightBottom;
        newObject.width = this.width;
        newObject.height = this.height;

        return newObject;
    }

    public double getSize()
    {
        return getHeight() * getWidth();
    }

    public int getCircum()
    {
        return 2 * (getHeight() + getWidth());
    }

}
