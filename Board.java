package com.company;

public class Board {
    // Instance variables
    private Card[][] board;
    private boolean[][] isHidden;
    // Constructors
    public Board(){
        board = null;
        isHidden = null;
    }
    public Board(int rows, int columns){
        board = new Card[rows][columns];
        isHidden = new boolean[rows][columns];
        unhide();
    }
    // Nonstatic methods
    public void printBoard(){
        // Print board with row col headers
        // You may assume board is set up.
        System.out.print("  ");
        for(int c=0; c<board[0].length; c++) {
            if(c<10)
                System.out.print("  " + c);
            else
                System.out.print(" " + c);
        }
        System.out.println();
        for(int r=0; r<board.length; r++){
            System.out.print(r);
            if(r<10)
                System.out.print(" ");
            for(int c=0; c<board[r].length; c++){
                if(board[r][c] != null) {
                    if(isHidden[r][c])
                        System.out.print(" ??");
                    else
                        System.out.print(" " + board[r][c].toString());
                }else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
    public void fillBoard(Deck d){
        for(int r=0; r<board.length; r++){
            for(int c=0; c<board[r].length; c++){
                board[r][c] = d.next();
            }
        }
    }
    public void unhide(){
        for(int r=0; r<board.length; r++){
            for(int c=0; c<board[r].length; c++){
                isHidden[r][c] = false;
            }
        }
    }
    public void unhide(int row, int column){
        isHidden[row][column] = false;
    }
    public void hide(){
        for(int r=0; r<board.length; r++){
            for(int c=0; c<board[r].length; c++){
                isHidden[r][c] = true;
            }
        }
    }
    public void hide(int row, int column){
        isHidden[row][column] = true;
    }

    public void place(Card c, int row, int column){
        board[row][column] = c;
    }
    public Card get(int row, int column){
        return board[row][column];
    }
    public Card remove(int row, int column){
        Card rv = board[row][column];
        board[row][column] = null;
        return rv;
    }
    public int openSpots(){
        int rv=0;
        for(int r=0; r<board.length; r++){
            for(int c=0; c<board[r].length; c++){
                if(board[r][c]==null)
                    rv++;
            }
        }
        return rv;
    }
    public String printScore(int a, int b) {
        return "Player 1 score: " + a + "\nPlayer 2 score: " + b;
    }

}

