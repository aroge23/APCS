package com.company;
import java.util.Random;

public class Deck {
    // Instance variables
    private Card[] cards = new Card[52];
    // This is your deck position telling you which cards have been dealt.
    private int nextCard=0;
    // Constructors. Create the actual 52 cards, AS-KD

    public Deck(){
        this.cards = new Card[52];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                this.cards[j + (i * 13)] = new Card(j + 1, i+1);
            }
        }
    }

    // Nonstatic methods
    public void shuffle(){
        Random rand = new Random();
        // This is how you get a random int 0-9.
        // Shuffle Algorithm: Go through each card in the deck
        // and swap it with a card in a random spot.
        for(int i = 0; i < 52; i++) {
            int randomIndex= rand.nextInt(52);
            Card temp = cards[i];
            cards[i] = cards[randomIndex];
            cards[randomIndex] = temp;
        }
    }
    // Print out each 2 character card on the same line separated by a single space.
    public void print(){
        for (int i = 0; i < 52; i++) {
            System.out.print(cards[i].toString() + " ");
        }

    }
    // Return a pointer to the next card, and move to the next.
    public Card next(){
        // Complete this code
        Card rv = null;
        if (nextCard < 52 && nextCard >= 0)
            rv = cards[nextCard];
        nextCard++;
        return rv;
    }

    public static void main(String args[]) {
        Card[] cards = new Card[52];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cards[j + (i * 13)] = new Card(j + 1, i+1);
            }
        }

        Deck a = new Deck();
        Deck b = new Deck();
        a.shuffle();
        b.print();
    }
}

