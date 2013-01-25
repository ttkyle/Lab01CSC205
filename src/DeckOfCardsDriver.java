/**
 * Programmer: kyle
 * Date: 1/24/13
 * Time: 8:40 AM
 * Exercise:
 */
public class DeckOfCardsDriver {

    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        for(int i = 0; i < 52; i++) {
            System.out.println(deck.dealCard());
            System.out.println(deck.cardsLeft()+ " cards left.");
        }
    }
}
