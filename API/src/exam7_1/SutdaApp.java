package exam7_1;

public class SutdaApp {
    public static void main(String[] args) {
        
        SutdaDeck deck = new SutdaDeck();
        
        for(int i=0; i < deck.cards.length;i++)
        System.out.print(deck.cards[i]+",");
    }
}
