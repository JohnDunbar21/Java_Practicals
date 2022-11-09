/*
Taken from Dietel & Dietel textbook "Java: How to Program Early Objects".

Figure 16.10

Card shuffling and dealing with Collections shuffle method.
*/
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

class Card {
    public enum Face {ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}
    public enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES}

    private final Face face;
    private final Suit suit;

    public Card(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    public Face getFace() {
        return face;
    }

    public Suit getSuit() {
        return suit;
    }

    public String toString() {
        return String.format("%s of %s", face, suit);
    }
}

public class DeckofCards {
    private List<Card> list;

    public DeckofCards() {
        Card[] deck = new Card[52];
        int count = 0; // number of cards
    

        for(Card.Suit suit: Card.Suit.values()) {
            for(Card.Face face: Card.Face.values()) {
                deck[count] = new Card(face, suit);
                ++count;
            }
        }

        list = Arrays.asList(deck);
        Collections.shuffle(list);
    }

    public void printCards() {
        for(int i = 0; i < list.size(); i++) {
            System.out.printf("%-19s%s", list.get(i), ((i+1)%4 == 0) ? System.lineSeparator() : "");
        }
    }

    public static void main(String[] args) {
        DeckofCards cards = new DeckofCards();
        cards.printCards();
    }
}