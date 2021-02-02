package monopolysim;

public class Player {

    private int spaceNumber; // Number 0 - 39

    public Player() {

        spaceNumber = 0;

    }

    public void move() {

        int rollCount = 0;
        int dieOne = 0, dieTwo = 0;
        do {
            rollCount++;
            if (rollCount == 3) {
                spaceNumber = 10;
                MonopolySim.board.space[spaceNumber].land(dieOne + dieTwo);
                break;
            }
            dieOne = (int) (Math.random() * 6 + 1);
            dieTwo = (int) (Math.random() * 6 + 1);
            spaceNumber += dieOne + dieTwo;
            if (spaceNumber >= 40) {
                spaceNumber -= 40;
            }
            MonopolySim.board.space[spaceNumber].land(dieOne + dieTwo);
            if (spaceNumber == 30) {
                spaceNumber = 10;
                MonopolySim.board.space[spaceNumber].land(dieOne + dieTwo);
                break;
            }
            //If the player lands on Chance, must come before community chest because of the "Go Back 3 Spaces" card.
            //This is to prevent a bug in case the third chance space is landed on, and that card is drawn.
            if (spaceNumber == 7 || spaceNumber == 22 || spaceNumber == 36) {
                if (MonopolySim.board.deck[0].get(0).effect != -1) {
                    if (MonopolySim.board.deck[0].get(0).effect < 40) {
                        spaceNumber = MonopolySim.board.deck[0].get(0).effect;
                    } else {
                        switch (MonopolySim.board.deck[0].get(0).effect) {
                            case 123:
                                spaceNumber = spaceNumber == 7 || spaceNumber == 36 ? 12 : 28;
                                break;
                            case 456:
                                spaceNumber = spaceNumber == 7 ? 15 : (spaceNumber == 22 ? 25 : 5);
                                break;
                            default:
                                spaceNumber -= 3;
                                break;
                        }
                    }
                    MonopolySim.board.space[spaceNumber].landFromChance(dieOne + dieTwo);
                }
                MonopolySim.board.deck[0].add(MonopolySim.board.deck[0].remove(0));
                if (MonopolySim.board.deck[0].get(15).effect == 10) {
                    break;
                }
            }
            //If the player lands on Community Chest
            if (spaceNumber == 2 || spaceNumber == 17 || spaceNumber == 33) {
                if (MonopolySim.board.deck[1].get(0).effect != -1) {
                    spaceNumber = MonopolySim.board.deck[1].get(0).effect;
                    MonopolySim.board.space[spaceNumber].land(dieOne + dieTwo);
                }
                MonopolySim.board.deck[1].add(MonopolySim.board.deck[1].remove(0));
                if (MonopolySim.board.deck[1].get(15).effect == 10) {
                    break;
                }
            }
        } while (dieOne == dieTwo);

    }

}
