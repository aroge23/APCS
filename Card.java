package com.company;

public class Card {
    // Instance Variables
    // 1=A, 2-9, 10=X, 11=J, 12=Q, 13=K
    // Error value = 0 and " " (space, not empty String!)
    private int face;
    // 1=S, 2=H, 3=C, 4=D
    // Error value = 0 and " " (space, not empty String!)
    private int suit;
    // Constructors
    public Card(){
    }

    public Card(int nFace, int nSuit){
        face = nFace;
        suit = nSuit;
    }

    // Getters/Setters
    public int getFace() {
        return face;
    }
    public void setFace(int newFace) {
        face = newFace;
    }
    public int getSuit() {
        return suit;
    }
    public void setSuit(int newSuit) {
        suit = newSuit;
    }

    // Static methods
    // Given 1-13, return A-K
    public static String convertFace(int face){
        String rv = "";
        String[] letters = {"", "A", "2", "3", "4", "5", "6", "7", "8", "9", "X", "J", "Q", "K"};

        for (int i = 1; i < 15; i++) {
            if (face == i) {
                rv = letters[i];
            }
        }
        return rv;
    }

    // Given A-K, return 1-13
    public static int convertFace(String face){
        int rv = 1;
        String[] letters = {"", "A", "2", "3", "4", "5", "6", "7", "8", "9", "X", "J", "Q", "K"};
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        for (int i = 1; i < 15; i++) {
            if (face.compareTo(letters[i]) == 0) {
                rv = nums[i];
            }
        }
        return rv;
    }

    // Given 1-4, return SHCD
    public static String convertSuit(int suit){
        String rv = "";
        String[] letters = {"", "S", "H", "C", "D"};
        for (int i = 1; i < 5; i++) {
            if (suit == i) {
                rv = letters[i];
            }
        }

        return rv;
    }

    // Given SHCD, return 1-4
    public static int convertSuit(String suit){
        int rv = 1;
        String[] letters = {"", "S", "H", "C", "D"};
        int[] nums = {0, 1, 2, 3, 4};
        for (int i = 1; i < 5; i++) {
            if(suit.compareTo(letters[i]) == 0) {
                rv = nums[i];
            }
        }
        return rv;
    }

    // Nonstatic methods
    // toString() should return a 2 character card.
    public String toString(){
        String rv = "";
        rv = convertFace(face);
        rv += convertSuit(suit);
        return rv;
    }

    // True if face values are equal.
    public boolean equals(Card c){
        Boolean rv = false;
        if (face == c.getFace() && suit == c.getSuit()) {
            rv = true;
        }
        return rv;
    }
}

