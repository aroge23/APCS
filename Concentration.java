package com.company;
import java.util.Scanner;

public class Concentration {
    // newBoard() should return a new Board that is already set up to play concentration.
    // IE, make, shuffle, deal a deck. Etc.
    public static Board newBoard(){
        Board b = new Board(8, 8);
        Deck d = new Deck();
        d.shuffle();

        b.fillBoard(d);
        b.printBoard();
        return b;

    }
    // Things to consider:
    // Keep track of whose turn it is, playerA or B.
    // Keep track of score = number of matches.
    // Play as long as there are cards on the board.
    // If player matches, they get to go again.
    public static void play() {
        // Complete this code.

    } // end play()
    public static void pressEnterToContinue(){
        // Complete this code.
        Scanner s = new Scanner(System.in);
        System.out.println("Press enter to continue");
        String comp = s.next();
    }

    public static void main(String[] args) {
        Concentration a = new Concentration();

        a.newBoard();
    }
    //new edit\
    //new comment
    //nfoinsdfo

}
