/**
 * Programmer: kyle
 * Date: 1/23/13
 * Time: 5:06 PM
 * Exercise: Lab01-2.30
 */
public class Card {

    private int rank;
    private int suit;
    private String[] ranks = {"", "Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4","3", "2"};
    private String[] suits =  {"", "clubs", "diamonds", "hearts", "spades"};

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    public String getRanks() {
        return ranks[rank];
    }

    public String getSuits() {
        return suits[suit];
    }

    public String toString() {
        return String.format("%s of %s", getRanks(), getSuits()) ;
    }
}
