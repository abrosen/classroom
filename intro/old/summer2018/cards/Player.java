package cards;

import java.util.ArrayList;

public class Player {
    private int score;
    private ArrayList<Card> hand;

    public Player() {
        this.score = 0;
        this.hand = new ArrayList();
    }


    public void drawHand(Deck d){
        this.hand.add(d.draw());
        this.hand.add(d.draw());
    }

    public void dealerPlay(Deck d){
        //  Draws until it hits 17
        while(this.getHandValue() < 17  && this.getHandValue() != 0){
            this.hand.add(d.draw());
        }
    }

    public void humanPlay(Deck d){
        while(this.getHandValue() < 15  && this.getHandValue() != 0){
            this.hand.add(d.draw());
        }
    }




    public int getHandValue(){
        int value = 0;
        int numAces = 0;
        for(int i = 0; i< hand.size(); i++) {
            Card  c = hand.get(i);
            if(c.getValue() == Card.ACE) {
                value += 11;
                numAces += 1;
            } else if(c.getValue()  == Card.KING || c.getValue() == Card.QUEEN
                    || c.getValue() == Card.JACK) {
                value += 10;
            } else {
                value += c.getValue();
            }
        }

        while(value > 21 &&  numAces > 0) {
            numAces--;
            value -= 10;
        }

        if(value >21){
            return 0;
        }

        return value;
    }

    public String revealHand(){
        return hand.toString();
    }


}
