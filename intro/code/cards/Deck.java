package cards;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
        cards =  new ArrayList();
        for(int suit = 1; suit <= 4; suit++) {
            for(int face = 1; face <= Card.KING; face++) {
                Card c = new Card(face,suit);
                cards.add(c);
            }
        }
        Collections.shuffle(cards);
        //System.out.println(cards);

    }

    public int size() {
        return cards.size();
    }

    public Card draw(){
        Card drawn =  cards.remove(cards.size() -1 );
        return drawn;
    }



}
