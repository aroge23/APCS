package com.company;

import java.util.Scanner;

public class War {

    public static void play() {
        //make deck, shuffle
        Deck d = new Deck();
        d.shuffle();

        //Split deck into 2, 26 cards / player
        Card[] p1 = new Card[26];
        Card[] p2 = new Card[26];
        for(int i = 0; i < 26; i++)
            p1[i] = d.next();
        for(int i = 0; i < 26; i++)
            p2[i] = d.next();

        //deal face down
        Board b = new Board(10, 26);
        for(int i = 0; i < 26; i++) {
            b.place(p1[i], 1, i);
            b.place(p2[i], 8, i);
        }
        b.hide();
        b.printBoard();

        //while (aCount > 0 && bCount > 0)
        while(countA(b) > 0 && countB(b) > 0) {
            int count = 0;
            pressEnterToContinue();

            // each player flips over 1 card to the leftmost spot
            b.place(b.get(1, 0), 4, 0);
            b.place(b.get(8, 0), 5, 0);
            b.unhide(4, 0);
            b.unhide(5, 0);
            b.remove(1, 0);
            b.remove(8, 0);
            for(int i = 1; i < 26; i++) {
                b.place(b.get(1, i), 1, i - 1);
                b.place(b.get(8, i), 8, i - 1);
            }
            System.out.println();
            b.printBoard();


            //if player a wins
            if(b.get(4, 0).getFace() > b.get(5, 0).getFace()) {
                System.out.println("Player A wins!");
                pressEnterToContinue();
                for(int i = 0; i < 26; i++) {
                    if(b.get(0, i) == null) {
                        b.place(b.get(4, 0), 0, i);
                        b.place(b.get(5, 0), 0, i + 1);
                        b.remove(4, 0);
                        b.remove(5, 0);
                        break;
                    }
                }
            }
            //if its a tie
            else if (b.get(4, 0).getFace() == b.get(5, 0).getFace()) {
                pressEnterToContinue();
                b.place(b.get(1, 0), 4, 1);
                b.place(b.get(8, 0), 5, 1);
                for(int i = 1; i < 26; i++) {
                    b.place(b.get(1, i), 1, i - 1);
                    b.place(b.get(8, i), 8, i - 1);
                }
                System.out.println();
                b.printBoard();

                pressEnterToContinue();
                b.place(b.get(1, 0), 4, 2);
                b.place(b.get(8, 0), 5, 2);
                b.unhide(4, 2);
                b.unhide(5, 2);
                for(int i = 1; i < 26; i++) {
                    b.place(b.get(1, i), 1, i - 1);
                    b.place(b.get(8, i), 8, i - 1);
                }
                count += 2;

                //now check which is the greatest card
                if(b.get(4, 2).getFace() > b.get(5, 2).getFace()) {
                    System.out.println("Player A wins!");
                    pressEnterToContinue();
                    for(int i = 0; i < 26; i++) {
                        if(b.get(0, i) == null) {
                            b.place(b.get(4, 0), 0, i);
                            b.place(b.get(5, 0), 0, i + 1);
                            b.place(b.get(4, 1), 0, i + 2);
                            b.place(b.get(5, 1), 0, i + 3);
                            b.place(b.get(4, 2), 0, i + 4);
                            b.place(b.get(5, 2), 0, i + 5);
                            break;
                        }
                    }
                    b.remove(4, 0);
                    b.remove(4, 1);
                    b.remove(4, 2);
                    b.remove(5, 0);
                    b.remove(5, 1);
                    b.remove(5, 2);
                    b.hide();

                } else {
                    b.printBoard();
                    System.out.println("Player B wins!");
                    pressEnterToContinue();
                    for(int i = 0; i < 26; i++) {
                        if(b.get(9, i) == null) {
                            b.place(b.get(4, 0), 9, i);
                            b.place(b.get(5, 0), 9, i + 1);
                            b.place(b.get(4, 1), 9, i + 2);
                            b.place(b.get(5, 1), 9, i + 3);
                            b.place(b.get(4, 2), 9, i + 4);
                            b.place(b.get(5, 2), 9, i + 5);
                            break;
                        }
                    }
                    b.remove(4, 0);
                    b.remove(4, 1);
                    b.remove(4, 2);
                    b.remove(5, 0);
                    b.remove(5, 1);
                    b.remove(5, 2);
                    b.hide();
                }
            }
            //player b wins then
            else {
                b.printBoard();
                System.out.println("Player B wins!");
                pressEnterToContinue();
                for(int i = 0; i < 26; i++) {
                    if(b.get(9, i) == null) {
                        b.place(b.get(4, 0), 9, i);
                        b.place(b.get(5, 0), 9, i + 1);
                        b.remove(4, 0);
                        b.remove(5, 0);
                        break;
                    }
                }
            }

            b.remove(1, 25 - count);
            b.remove(8, 25 - count);

            //This keeps the game going by resetting the player's cards once they run out
            //Commented out because the game goes on forever

            /*
            if(b.get(1, 0) == null && b.get(0,0) != null) {
                System.out.println("test");
                for (int i = 0; i < 26; i++) {
                    b.place(b.get(0, i), 1, i);
                    b.remove(0, i);
                }
            }

            if(b.get(8, 0) == null && b.get(9,0) != null) {
                System.out.println("test2");
                for (int i = 0; i < 26; i++) {
                    b.place(b.get(9, i), 8, i);
                    b.remove(9, i);
                }
            }
            */

            b.printBoard();


            count++;
        }


    }

    public static void pressEnterToContinue(){
        // Complete this code.
        Scanner s = new Scanner(System.in);
        System.out.println("Press enter to continue");
        String comp = s.nextLine();
    }

    public static int countA(Board b) {
        int rv = 0;
        for(int i = 0; i < 26; i++) {
            if(b.get(1, i) != null)
                rv += 1;
        }
        return rv;
    }

    public static int countB(Board b) {
        int rv = 0;
        for(int i = 0; i < 26; i++) {
            if(b.get(8, i) != null)
                rv += 1;
        }
        return rv;
    }





    public static void main(String[] args) {
        play();
    }
}
