package monopolysim;

public class Board {

    public Space[] space = new Space[40];
    public Deck[] deck;

    public Board() {

        for (int i = 0; i < space.length; i++) {
            space[i] = new Space(i);
        }
        deck = new Deck[2];
        deck[0] = new Deck(0);
        deck[1] = new Deck(1);
        Deck newChance = new Deck();
        Deck newCommChest = new Deck();
        for (int i = 16; i >= 1; i--) {
            newChance.add(deck[0].remove((int) (Math.random() * i)));
            newCommChest.add(deck[1].remove((int) (Math.random() * i)));
        }
        deck[0] = newChance;
        deck[1] = newCommChest;
        deck[0].setType("Chance");
        deck[1].setType("Community Chest");

    }

    @Override
    public String toString() {

        String output = "";
        for (Space element : space) {
            output += element;
            output += "\n";
        }
        return output;

    }

}
