package exam4;

public class DBox <L, R> {

    private L left;
    private R right;

    public void set(L left, R right)
    {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString()
    {
        return "left : " + getLeft().toString() + ", right : " + getRight().toString();
    }


    public L getLeft() {
        return this.left;
    }

    public void setLeft(L left) {
        this.left = left;
    }

    public R getRight() {
        return this.right;
    }

    public void setRight(R right) {
        this.right = right;
    }
    
}