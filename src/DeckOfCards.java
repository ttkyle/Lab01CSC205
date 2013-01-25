import java.util.Random;

/**
 * Programmer: kyle
 * Date: 1/24/13
 * Time: 8:14 AM
 * Exercise: 2.30
 */
public class DeckOfCards implements  DeckOfCardsInterface {

    private Card[] cardArray;
    private int count;

    public DeckOfCards() {

        //set the attributes of the class
        cardArray = new Card[numberOfCards];
        count = 0;

        for(int n = 1; n < 5; n++) {
            for(int i = 1;  i < 14; i++) {
                cardArray[count] = new Card(i,n);
                count++;
            }
        }
    }

    public void shuffle() {

        Random r = new Random();
        //set the card count to 0 before shuffling
        count = 0;

        //randomize the card
        for(int i = 0; i < cardArray.length; i++) {
            int randomNumber = r.nextInt(numberOfCards);

            Card tempCard = cardArray[i];
            cardArray[i] = cardArray[randomNumber];
            cardArray[randomNumber] = tempCard;
        }

    }

    //deal a card
    public Card dealCard() {
        if (count < cardArray.length) {
            return cardArray[count++];
        }
        else {
            return null;
        }
    }

    //get the current card count
    public int cardsLeft() {
        return 52 - count;
    }
}
