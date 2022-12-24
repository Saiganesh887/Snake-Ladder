package com.bridgelabs;

public class SnakeAndLadder {
    static final int START_POSITION = 0;
    static int diceRoll() {
        int dice = ((int) (Math.random() * 10) % 6) + 1;
        System.out.println("Dice gives: " + dice);
        return dice;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Computation");
        int diceRoll = diceRoll();
        System.out.println(diceRoll);
    }
}


