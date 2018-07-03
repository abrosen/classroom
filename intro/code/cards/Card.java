package cards;

public class Card {
    public final static int HEARTS   = 1;
    public final static int CLUBS    = 2;
    public final static int DIAMONDS = 3;
    public final static int SPADES   = 4;

    public final static int ACE   = 1;
    public final static int JACK  = 11;
    public final static int QUEEN = 12;
    public final static int KING  = 13;

    private int value;
    private int suit;

    public Card(int value, int suit) {
        this.value = value;
        this.suit  = suit;
    }

    public int getValue(){
        return this.value;
    }

    public int getSuit() {
        return this.suit;
    }

    public String toString() {
        String value = "";
        if(this.value == Card.ACE) {
            value = "A";
        } else if(this.value  == Card.JACK) {
            value = "J";
        } else if(this.value  == Card.QUEEN) {
            value = "Q";
        } else if(this.value  == Card.KING) {
            value = "K";
        } else {
            value = "" + this.value;
        }
        String suit;
        if (this.suit == Card.HEARTS) {
            suit = "\u2665";
        } else if(this.suit == Card.CLUBS) {
            suit = "\u2663";
        } else if(this.suit == Card.DIAMONDS) {
            suit = "\u2666";
        } else {
            suit = "\u2660";
        }
        return value + suit;
    }
}
