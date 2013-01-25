/**
 * Programmer: kyle
 * Date: 1/24/13
 * Time: 8:17 AM
 * Exercise: 2.30
 */
public interface DeckOfCardsInterface {

    int numberOfCards = 52;

    public void shuffle();

    public int cardsLeft();

    public Card dealCard();

    public String toString();
}
