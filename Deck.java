package monopolysim;

import java.util.*;

public class Deck extends ArrayList<Card> {

    String type;

    public Deck(int type) { // Type 0 is Chance, Type 1 is Community Chest

        this.type = type == 0 ? "Chance" : "Community Chest";
        for (int i = 0; i < 16; i++) {
            add(new Card(type, i));
        }

    }

    public Deck() {

        type = "";

    }

    public void setType(String type) {

        this.type = type;

    }

}
