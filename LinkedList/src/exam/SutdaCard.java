package exam;

public class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard(int num, boolean isKwang)
    {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString()
    {
        return num + (isKwang ? "K" : "");
    }

}
