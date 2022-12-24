package com.bridgelabs;

public class SnakeAndLadder {
    static final int START_POSITION = 0;
    static final int IS_SNAKES = 1;
    static final int IS_LADDERS = 2;
    static int diceRoll() {
        int dice = ((int) (Math.random() * 10) % 6) + 1;
        System.out.println(dice);
        return dice;
    }
    static int getOption() {
        int options = (int) (Math.random() * 10) % 3;
        return options;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Computation");
        int player_Position = START_POSITION;
        int diceRoll = diceRoll();
        int option = getOption();
        switch (option) {
            case IS_SNAKES:
                System.out.println("Player moves behind");
                player_Position -= diceRoll;
                break;
            case IS_LADDERS:
                System.out.println("Player moves ahead");
                player_Position += diceRoll;
                break;
            case default:
                System.out.println("Player stays in same position");
        }
    }
}


