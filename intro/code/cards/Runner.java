package cards;

public class Runner {
    int budget;
    public static void main(String[] args) {
        


        final int NUM_GAMES=100000;
        int numberWins = 0;

        for(int i = 0; i  < NUM_GAMES; i++) {
            Deck deck = new Deck();
            Player dealer = new Player();
            Player player = new Player();

            dealer.drawHand(deck);
            player.drawHand(deck);
            dealer.dealerPlay(deck);
            player.humanPlay(deck);


            if (player.getHandValue() > dealer.getHandValue()) {
                // System.out.println("Player wins!");
                numberWins++;
            } else {
                // System.out.println("Dealer wins!");
            }
            //System.out.println("player: " + player.revealHand());
            //System.out.println("dealer: " + dealer.revealHand());
        }
        System.out.println("The player won "+ 100.0*numberWins/NUM_GAMES +"% of the games");

    }
}
