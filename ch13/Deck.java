import java.util.Arrays;
import java.util.Random;

/**
 * A deck of playing cards (of fixed size).
 */
public class Deck {

    private Card[] cards;
    private Random r = new Random();

    /**
     * Constructs a standard deck of 52 cards.
     */
    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    /**
     * Constructs a deck of n cards (null).
     */
    public Deck(int n) {
        this.cards = new Card[n];
    }

    /**
     * Gets the internal cards array.
     */
    public Card[] getCards() {
        return this.cards;
    }

    /**
     * Displays each of the cards in the deck.
     */
    public void print() {
        for (int i = 0; i < this.cards.length; i++) {
            System.out.println(this.cards[i]);
        }
    }

    /**
     * Returns a string representation of the deck.
     */
    public String toString() {
        return Arrays.toString(this.cards);
    }

    /**
     * Chooses a random number between low and high, including both.
     */
    public int randomInt(int low, int high) {
        return r.nextInt(low) + (high - low);
    }

    /**
     * Swaps the cards at indexes i and j.
     */
    public void swapCards(int i, int j) {
        Card c1 = this.cards[i];
        Card c2 = this.cards[j];
        this.cards[i] = c2;
        this.cards[j] = c1;
    }

    /**
     * Randomly permutes the array of cards.
     */
    public void shuffle() {
        int deckSize = this.cards.length;
        for (int i = 0; i < deckSize; i++) {
            swapCards(randomInt(0, deckSize - 1),
                randomInt(0, deckSize - 1));
        }
    }

    /**
     * Finds the index of the lowest card
     * between low and high inclusive.
     */
    public int indexLowest(int low, int high) {
        int index = low;
        for (int i = low + 1; i <= high; i++) {
            if (this.cards[i].compareTo(this.cards[index]) == -1) {
                index = i;
            }
        }

        return index;
    }

    /**
     * Sorts the cards (in place) using selection sort.
     */
    public void selectionSort() {
        int index;
        int deckSize = this.cards.length;

        for (int i = 0; i < deckSize; i++) {
            index = indexLowest(i, deckSize - 1);
            if (index != i) {
                swapCards(i, index);
            }
        }
    }

    /**
     * Returns a subset of the cards in the deck.
     */
    public Deck subdeck(int low, int high) {
        Deck sub = new Deck(high - low + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }

    /**
     * Combines two previously sorted subdecks.
     */
    public static Deck merge(Deck d1, Deck d2) {
        return null;
    }

    /**
     * Returns a sorted copy of the deck using merge sort.
     */
    public Deck mergeSort() {
        return this;
    }

    /**
     * Reorders the cards (in place) using insertion sort.
     */
    public void insertionSort() {
    }

}
