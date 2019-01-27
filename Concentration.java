package com.company;
import java.util.Scanner;

//implement player function
public class Concentration {
    // newBoard() should return a new Board that is already set up to play concentration.
    // IE, make, shuffle, deal a deck. Etc.
    static boolean isPlaying = true;
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
        boolean playerA, playerB, firstRound = true;
        int player = 0;
        int scoreA = 0, scoreB = 0;

        while(isPlaying) {
            while (board.openSpots() <= (userRow * userCol)) {
                if (player == 0) {
                    //player 1
                    if(firstRound == false)
                        board.printBoard();
                    System.out.println("What row would Player 1 like to pick first");
                    int row = s.nextInt();
                    System.out.println("What column would Player 1 like to pick first");
                    int column = s.nextInt();

                    board.unhide(row, column);
                    board.printBoard();

                    System.out.println("What row would Player 1 like to pick second");
                    int row2 = s.nextInt();
                    System.out.println("What column would Player 1 like to pick second");
                    int column2 = s.nextInt();

                    board.unhide(row2, column2);
                    board.printBoard();
                    pressEnterToContinue();

                    if (board.get(row, column).getFace() == board.get(row2, column2).getFace()) {
                        scoreA++;
                        board.remove(row, column);
                        board.remove(row2, column2);
                    } else {
                        board.hide(row, column);
                        board.hide(row2, column2);
                    }

                    System.out.println(board.printScore(scoreA, scoreB));
                    System.out.println();

                    //end player 1
                    firstRound = false;
                    player++;
                } else {
                    //player 2
                    board.printBoard();
                    System.out.println("What row would Player 2 like to pick first");
                    int row = s.nextInt();
                    System.out.println("What column would Player 2 like to pick first");
                    int column = s.nextInt();

                    board.unhide(row, column);
                    board.printBoard();

                    System.out.println("What row would Player 2 like to pick second");
                    int row2 = s.nextInt();
                    System.out.println("What column would Player 2 like to pick second");
                    int column2 = s.nextInt();

                    board.unhide(row2, column2);
                    board.printBoard();
                    pressEnterToContinue();

                    if (board.get(row, column).getFace() == board.get(row2, column2).getFace()) {
                        scoreB++;
                        board.remove(row, column);
                        board.remove(row2, column2);
                    } else {
                        board.hide(row, column);
                        board.hide(row2, column2);
                    }

                    System.out.println(board.printScore(scoreA, scoreB));
                    System.out.println();

                    //end player 2
                    player--;
                }
            }
        }


    } // end play()
    public static void pressEnterToContinue(){
        // Complete this code.
        Scanner s = new Scanner(System.in);
        System.out.println("Press enter to continue");
        String comp = s.nextLine();
    }

    public static void main(String[] args) {
        Concentration a = new Concentration();
        a.play();
    }


}
