package monopolysim;

public class Card {

    int effect; // The space number that the card will send you to, is -1 in the case of no movement.

    public Card(int type, int number) { //Numbers are 0 - 15, inclusive.

        if (type == 0) {
            switch (number) {
                case 0:
                    effect = 0;
                    break;
                case 1:
                    effect = 24;
                    break;
                case 2:
                    effect = 11;
                    break;
                case 3:
                    effect = 123; // Code for nearest utility
                    break;
                case 4:
                    effect = 456; // Code for nearest railroad
                    break;
                case 7:
                    effect = 789; // Code for go back 3 spaces.
                    break;
                case 8:
                    effect = 10;
                    break;
                case 11:
                    effect = 5;
                    break;
                case 12:
                    effect = 39;
                    break;
                default:
                    effect = -1;
                    break;
            }
        } else {
            switch (number) {
                case 0:
                    effect = 0;
                    break;
                case 1:
                    effect = 10;
                    break;
                default:
                    effect = -1;
                    break;
            }
        }

    }

    @Override
    public String toString() {

        return "" + effect;

    }

}
