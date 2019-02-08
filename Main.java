package com.company;
import java.util.Scanner;
import com.company.UserInput;
import java.lang.Math;

public class Main {
    public static void main(String args[]) {
        Printable[] interfaces = {new Card(10, 4), new Board(8, 7), new Rectangle(10, 5),
        new BankAccount("Anay", "Roge", new Money(1500, 59), "BofA")};

        for(int i = 0; i < interfaces.length; i++) {
            interfaces[i].print();
        }

        GamePiece[][] g = new GamePiece[5][];
        for(int i = 0; i < g.length; i++) {
            int length = 4 - Math.abs(i - 2);
            g[i] = new GamePiece[length];
        }

        for(int i = 0; i < g.length; i++) {
            for(int j = 0; j < g[i].length; j++) {
                if(i == 2 && j == 1) {
                    g[i][j] = new GamePiece("Hi");
                }
                else {
                    g[i][j] = new GamePiece("" + i+j);
                }
            }
        }

        for(int i = 0; i < g.length; i++) {
            for(int j = 0; j < g[i].length; j++) {
                System.out.print(g[i][j].toString2() + " ");
            }
            System.out.println();
        }
    }
}
