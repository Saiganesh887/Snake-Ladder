package com.bridgelabs;

public class SnakeAndLadder {
    static final int START_POSITION = 0;
    static final int IS_SNAKES = 1;
    static final int IS_LADDERS = 2;
    static final int WINNING_POSITION = 100;
    static int diceCount = 0;
    static int diceRoll() {
        int dice = ((int) (Math.random() * 10) % 6) + 1;
        System.out.println(dice);
        return dice;
    }
    static int getOption() {
        int options = (int) (Math.random() * 10) % 3;
        return options;
    }
    static int getToss() {
        int tos = (int) (Math.random() * 2);
        return tos;
    }
    static int playGame(int player_Position) {
            int diceRoll = diceRoll();
            System.out.println("Dice gives:"+diceRoll);
            int option = getOption();
            switch (option) {
                case IS_SNAKES:
                    System.out.println("Player moves behind");
                    player_Position -= diceRoll;
                    if (player_Position < START_POSITION)
                        player_Position = START_POSITION;
                    break;
                case IS_LADDERS:
                    System.out.println("Player moves ahead");
                    player_Position += diceRoll;
                    if(player_Position > WINNING_POSITION)
                        player_Position -= diceRoll;
                    break;
                case default:
                    System.out.println("Player stays in same position");
            }
            diceCount++;
            System.out.println("Player position : "+player_Position);
        System.out.println("Number of times players rolls the dice:"+diceCount);
        if(option == IS_LADDERS && player_Position != WINNING_POSITION) {
            playGame(player_Position);
        }
        return player_Position;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Computation");
        int player1_Position = START_POSITION;
        int player2_Position = START_POSITION;
        int toss = getToss();
        int diceCount1 = 0;
        while(player1_Position < WINNING_POSITION && player2_Position < WINNING_POSITION) {
            if (toss == 0) {
                System.out.println("Player1 is rolling ");
                player1_Position = playGame(player1_Position);
                    if (player1_Position == WINNING_POSITION) {
                    System.out.println("Player1 is Winner");
                    break;
                }
                toss = 1;
            }
            if (toss == 1) {
                System.out.println("Player2 is rolling");
                player2_Position = playGame(player2_Position);
                    if (player2_Position == WINNING_POSITION) {
                    System.out.println("Player2 is Winner");
                    break;
                }
                toss = 0;
            }
        }
    }
}


