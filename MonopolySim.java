package monopolysim;

import java.util.*;

public class MonopolySim {

    public static Board board;
    public static int turns;
    public static int players;

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.print("How many turns?: ");
        turns = kb.nextInt();
        System.out.print("How many opponents?: ");
        players = kb.nextInt();
        System.out.print("Which return type?: "); // 1, 2, or 3
        int returnType = kb.nextInt();
        Player[] player = new Player[players];
            board = new Board();
            for (int i = 0; i < players; i++) {
                player[i] = new Player();
            }
            for (int i = 0; i < turns; i++) {
                for (int j = 0; j < players; j++) {
                    player[j].move();
                }
            }
            System.out.println("");
        for (Space space : board.space) {
            System.out.println(space.getStats(returnType - 1));
            System.out.println("");
        }

    }

}
