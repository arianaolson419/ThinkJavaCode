import java.util.Arrays;
import java.util.Random;
import java.lang.StringBuilder;

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
        StringBuilder deckStringBuilder = new StringBuilder();
        for (Card card : this.cards) {
            deckStringBuilder.append(card);
            deckStringBuilder.append('\n');
        }

        deckStringBuilder.deleteCharAt(deckStringBuilder.lastIndexOf("\n"));
        return deckStringBuilder.toString();
    }

    /**
     * Chooses a random number between low and high, including both.
     */
    public int randomInt(int low, int high) {
        return low + r.nextInt(high);
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
        for (int i = 0; i < deckSize * 7; i++) {
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
        Deck result = new Deck(d1.cards.length + d2.cards.length);
        int i = 0; // index of d1
        int j = 0; // index of d2
        int maxIndex1 = d1.cards.length;
        int maxIndex2 = d2.cards.length;
        for (int k = 0; k < result.cards.length; k++) {
            if (i >= maxIndex1) {
                result.cards[k] = d2.cards[j];
                j++;
            }

            else if (j >= maxIndex2) {
                result.cards[k] = d1.cards[i];
                i++;
            }

            else {
                if (d1.cards[i].compareTo(d2.cards[j]) <= 0) {
                    result.cards[k] = d1.cards[i];
                    i++;
                }

                else if (d1.cards[i].compareTo(d2.cards[j]) > 0) {
                    result.cards[k] = d2.cards[j];
                    j++;
                }
            }
        }

        return result;
    }

    /**
     * Returns a sorted copy of the deck using merge sort.
     */
    public Deck mergeSort() {
        int middle;
        Deck d1;
        Deck d2;
        Deck result;

        if (this.cards.length <= 1) {
            return this;
        }
        else {
            middle = this.cards.length/2;
            d1 = this.subdeck(0, middle-1);
            d1 = d1.mergeSort();
            d2 = this.subdeck(middle, this.cards.length - 1);
            d2 = d2.mergeSort();
            result = merge(d1, d2);
            return result;
        }
    }

    /**
     * Reorders the cards (in place) using insertion sort.
     */
    public void insertionSort() {
        if (this.cards.length > 1) {
            for (int i = 1; i < this.cards.length; i++) {
                for (int k = i; k > 0; k--) {
                    if (this.cards[k].compareTo(this.cards[k-1]) < 0) {
                        swapCards(k-1, k);
                    }
                }
            } 
        }
    }

}
