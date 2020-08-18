package summer0816;

public class deckTest {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = d.pick(0);
        System.out.println(c);

        d.shuffle();
        c = d.pick(0);
        System.out.println(c);
    }
}
class Deck {
    final int cardNum = 52;
    Card cardArr[] = new Card[cardNum];

    Deck() {
        int i = 0;

        for(int k = Card.kindMax; k > 0; k--) {
            for(int n = 0; n < Card.numMax; n++) {
                cardArr[i++] = new Card(k, n+1);
            }
        }
    }
    Card pick(int index) {
        return cardArr[index];
    }
    Card pick() {
        int index = (int)(Math.random() * cardNum);
        return pick(index);
    }
    void shuffle() {
        for(int i = 0; i < cardArr.length; i++) {
            int r = (int)(Math.random() * cardNum);

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}
class Card {
    static final int kindMax = 4;
    static final int numMax = 13;

    static final int spade = 4;
    static final int diamond = 3;
    static final int heart = 2;
    static final int clover = 1;
    int kind;
    int number;

    Card() {
        this(spade, 1);
    }
    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }
    public String toString() {
        String kinds [] = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK";

        return "Kind: " + kinds[this.kind] + ", Number: " + numbers.charAt(this.number);
    }
}
