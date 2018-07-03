package cards;

public class Runner {
    public static void main(String[] args) {
        Deck deck =  new Deck();
        Player dealer =  new Player();
        Player player = new Player();

        dealer.drawHand(deck);
        player.drawHand(deck);

        if(player.getHandValue() > dealer.getHandValue()){
            System.out.println("Player wins!");
        } else {
            System.out.println("Dealer wins!");
        }
        System.out.println("player: " + player.revealHand());
        System.out.println("dealer: " + dealer.revealHand());

    }
}
