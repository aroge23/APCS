package com.company;
import java.util.Scanner;

public class Concentration {
    // newBoard() should return a new Board that is already set up to play concentration.
    // IE, make, shuffle, deal a deck. Etc.
    public static Board newBoard(int rows, int columns){
        Board b = new Board(rows, columns);
        Deck d = new Deck();
        d.shuffle();

        b.fillBoard(d);
        b.hide();
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
        Scanner s = new Scanner(System.in);
        System.out.println("How many rows would you like?");
        int userRow = s.nextInt();
        System.out.println("How many columns would you like?");
        int userCol = s.nextInt();
        Board board = newBoard(userRow, userCol);
        boolean playerA, playerB;
        int player = 0;
        int scoreA = 0, scoreB = 0;

        while (board.openSpots() <= 56) {
            if (player == 0) {
                //player 1
                System.out.println("What row would Player 1 like to pick");
                int row = s.nextInt();
                System.out.println("What column would Player 1 like to pick");
                int column = s.nextInt();

                board.unhide(row, column);
                board.printBoard();
                System.out.println(board.printScore(scoreA, scoreB));

                //end player 1
                player++;
            }
            else {
                //player 2
                System.out.println("What row would Player 2 like to pick");
                int row = s.nextInt();
                System.out.println("What column would Player 2 like to pick");
                int column = s.nextInt();

                board.unhide(row, column);
                board.printBoard();
                System.out.println(board.printScore(scoreA, scoreB));

                //end player 2
                player--;
            }
        }


    } // end play()
    public static void pressEnterToContinue(){
        // Complete this code.
        Scanner s = new Scanner(System.in);
        System.out.println("Press enter to continue");
        String comp = s.next();
    }

    public static void main(String[] args) {
        Concentration a = new Concentration();
        a.play();
    }


}
