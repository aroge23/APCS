package com.company;

public class Board {
    // Instance variables
    private Card[][] board;
    private boolean[][] isHidden;
    // Constructors
    public Board(){
        // Complete this code.
        board = new Card[0][0];
    }
    public Board(int rows, int columns){
        // Complete this code.
        board = new Card[rows][columns];

    }

    // Nonstatic methods
    public void printBoard(){
        System.out.println("  ");
        for (int c = 0; c < board[0].length; c++) {
            if (c < 10)
                System.out.print("  " + c);
            else
                System.out.print(" " + c);
        }
        System.out.println();
        for (int r = 0; r < board.length; r++) {
            System.out.print(r);
            if (r < 10)
                System.out.print(" ");
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] != null) {
                    if (isHidden[r][c])
                        System.out.print(" ??");
                    else
                        System.out.print("  " + board[r][c].toString());
                } else
                    System.out.println("  ");
            }
            System.out.println();
        }
    }

    // Place cards from argument Deck d onto the Board, left to right, top down.
    // If the Board is bigger than the deck, then you should have null in empty spots.
    // If the Board is smaller than the deck, then you should stop placing cards
    // after the last spot.

    public void fillBoard(Deck d){
        for (int i = 0; i < 52; i++) {
            if (i < 8)
                board[0][i] = d.next();
            else if (i < 16)
                board[1][i - 8] = d.next();
            else if (i < 24)
                board[2][i - 16] = d.next();
            else if (i < 32)
                board[3][i - 24] = d.next();
            else if (i < 40)
                board [4][i - 32] = d.next();
            else if (i < 48)
                board[5][i - 40] = d.next();
            else
                board[6][i - 48] = d.next();
        }
    }

    // Set all cards face up. This method does not print anything.
    public void unhide() {
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++)
                isHidden[i][j] = false;
        }
    }

    // Set one card face up.
    public void unhide(int row, int column){
        // Complete this code.
        isHidden[row][column] = false;

    }
    // Set all cards face down. This method does not print anything.
    public void hide(){
        // Complete this code.
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++)
                isHidden[i][j] = true;
        }
    }
    // Set one card face down.
    public void hide(int row, int column){
        // Complete this code.
        isHidden[row][column] = true;
    }
    // Place argument Card c onto the Board at spot row,column.
    public void place(Card c, int row, int column){
        // Complete this code.
        board[row][column] = c;
    }
    // Return a pointer to the card at spot row,column on the Board.
    // Do not remove the card from the Board.
    public Card get(int row, int column){
        // Complete this code.
        return board[row][column];
    }
    // Return a pointer to the card at spot row,column on the Board.
    // Remove the card from the Board.
    public Card remove(int row, int column){
        // Complete this code.
        Card c = board[row][column];
        board[row][column] = null;
        return c;
    }
    // Count the number of open spots on the Board.
    // Open = no card is placed at that spot.
    public int openSpots(){
        // Complete this code.
        int rv = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == null)
                    rv++;
            }
        }
        return rv;

    }

}
