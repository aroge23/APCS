package com.company;

public class GamePiece implements Printable, ToString2 {
    private final String value;
    public GamePiece() {
        this.value = "";
    }
    public GamePiece(String value) {
        if(value.length() > 2)
            this.value = value.substring(0, 2);
        else
            this.value = (value + "  ").substring(0,2);

    }
    public void print() {
        System.out.println(toString2());
    }

    public String toString2() {
        return value;
    }
}
