package com.company;

public class trial {
    public static void main(String args[]) {
        Deck d = new Deck();
        Board b = new Board(7, 8);

        for(int i = 0; i < 6; i++) {
            for(int j = (0 + i); j < 6; j++) {
                b.place(d.next(), i, j);

                if(j != 0 + i){
                    b.hide(i, j);
                }
            }
        }

        b.printBoard();
    }
}
