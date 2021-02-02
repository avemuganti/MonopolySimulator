package monopolysim;

public class Space {

    private boolean utility;
    private boolean railroad;
    private boolean chance;
    private boolean commChest;
    private boolean other;
    // Following six are used to describe rent
    private int baseRent;
    private double oneHouse; // One RR, Util (Multiplier)
    private double twoHouses; // Two RR, Util (Multiplier)
    private double threeHouses; // Three RR
    private double fourHouses; // Four RR
    private double hotel;
    private String name; // Uses Caps
    private String color; // All Lowercase
    private double timesLandedOn;
    private double totalRent;
    private int cost;
    private int currHouses;
    private static int brownCost = 120;
    private static int lightBlueCost = 320;
    private static int pinkCost = 440;
    private static int orangeCost = 560;
    private static int redCost = 680;
    private static int yellowCost = 800;
    private static int greenCost = 920;
    private static int darkBlueCost = 750;
    private double chanceLandsUtil;

    public Space(int number) {

        chanceLandsUtil = 0;
        currHouses = 0;
        timesLandedOn = 0;
        totalRent = 0;
        railroad = number % 10 == 5;
        utility = number == 12 || number == 28;
        chance = number == 7 || number == 22 || number == 36;
        commChest = number == 2 || number == 17 || number == 33;
        other = number % 10 == 0 || number == 4 || number == 38;
        if (!(railroad || utility || chance || commChest || other)) {
            switch (number) {
                case 1:
                    name = "Meditterranean Avenue";
                    color = "brown";
                    baseRent = 2;
                    cost = 60;
                    oneHouse = 10;
                    twoHouses = 30;
                    threeHouses = 90;
                    fourHouses = 160;
                    hotel = 250;
                    break;
                case 3:
                    name = "Baltic Avenue";
                    color = "brown";
                    baseRent = 4;
                    cost = 60;
                    oneHouse = 20;
                    twoHouses = 60;
                    threeHouses = 180;
                    fourHouses = 320;
                    hotel = 450;
                    break;
                case 6:
                    name = "Oriental Avenue";
                    color = "light blue";
                    baseRent = 6;
                    cost = 100;
                    oneHouse = 30;
                    twoHouses = 90;
                    threeHouses = 270;
                    fourHouses = 400;
                    hotel = 550;
                    break;
                case 8:
                    name = "Vermont Avenue";
                    color = "light blue";
                    baseRent = 6;
                    cost = 100;
                    oneHouse = 30;
                    twoHouses = 90;
                    threeHouses = 270;
                    fourHouses = 400;
                    hotel = 550;
                    break;
                case 9:
                    name = "Connecticut Avenue";
                    color = "light blue";
                    baseRent = 8;
                    cost = 120;
                    oneHouse = 40;
                    twoHouses = 100;
                    threeHouses = 300;
                    fourHouses = 450;
                    hotel = 600;
                    break;
                case 11:
                    name = "St. Charles Place";
                    color = "pink";
                    baseRent = 10;
                    cost = 140;
                    oneHouse = 50;
                    twoHouses = 150;
                    threeHouses = 450;
                    fourHouses = 625;
                    hotel = 750;
                    break;
                case 13:
                    name = "States Avenue";
                    color = "pink";
                    baseRent = 10;
                    cost = 140;
                    oneHouse = 50;
                    twoHouses = 150;
                    threeHouses = 450;
                    fourHouses = 625;
                    hotel = 750;
                    break;
                case 14:
                    name = "Virginia Avenue";
                    color = "pink";
                    baseRent = 12;
                    cost = 160;
                    oneHouse = 60;
                    twoHouses = 180;
                    threeHouses = 500;
                    fourHouses = 700;
                    hotel = 900;
                    break;
                case 16:
                    name = "St. James Place";
                    color = "orange";
                    baseRent = 14;
                    cost = 180;
                    oneHouse = 70;
                    twoHouses = 200;
                    threeHouses = 550;
                    fourHouses = 750;
                    hotel = 950;
                    break;
                case 18:
                    name = "Tennessee Avenue";
                    color = "orange";
                    baseRent = 14;
                    cost = 180;
                    oneHouse = 70;
                    twoHouses = 200;
                    threeHouses = 550;
                    fourHouses = 750;
                    hotel = 950;
                    break;
                case 19:
                    name = "New York Avenue";
                    color = "orange";
                    baseRent = 16;
                    cost = 200;
                    oneHouse = 80;
                    twoHouses = 220;
                    threeHouses = 600;
                    fourHouses = 800;
                    hotel = 1000;
                    break;
                case 21:
                    name = "Kentucky Avenue";
                    color = "red";
                    baseRent = 18;
                    cost = 220;
                    oneHouse = 90;
                    twoHouses = 250;
                    threeHouses = 700;
                    fourHouses = 875;
                    hotel = 1050;
                    break;
                case 23:
                    name = "Indiana Avenue";
                    color = "red";
                    baseRent = 18;
                    cost = 220;
                    oneHouse = 90;
                    twoHouses = 250;
                    threeHouses = 700;
                    fourHouses = 875;
                    hotel = 1050;
                    break;
                case 24:
                    name = "Illinois Avenue";
                    color = "red";
                    baseRent = 20;
                    cost = 240;
                    oneHouse = 100;
                    twoHouses = 300;
                    threeHouses = 750;
                    fourHouses = 925;
                    hotel = 1100;
                    break;
                case 26:
                    name = "Atlantic Avenue";
                    color = "yellow";
                    baseRent = 22;
                    cost = 260;
                    oneHouse = 110;
                    twoHouses = 330;
                    threeHouses = 800;
                    fourHouses = 975;
                    hotel = 1150;
                    break;
                case 27:
                    name = "Ventnor Avenue";
                    color = "yellow";
                    baseRent = 22;
                    cost = 260;
                    oneHouse = 110;
                    twoHouses = 330;
                    threeHouses = 800;
                    fourHouses = 975;
                    hotel = 1150;
                    break;
                case 29:
                    name = "Marvin Gardens";
                    color = "yellow";
                    baseRent = 24;
                    cost = 280;
                    oneHouse = 120;
                    twoHouses = 360;
                    threeHouses = 850;
                    fourHouses = 1025;
                    hotel = 1200;
                    break;
                case 31:
                    name = "Pacific Avenue";
                    color = "green";
                    baseRent = 26;
                    cost = 300;
                    oneHouse = 130;
                    twoHouses = 390;
                    threeHouses = 900;
                    fourHouses = 1100;
                    hotel = 1275;
                    break;
                case 32:
                    name = "North Carolina Avenue";
                    color = "green";
                    baseRent = 26;
                    cost = 300;
                    oneHouse = 130;
                    twoHouses = 390;
                    threeHouses = 900;
                    fourHouses = 1100;
                    hotel = 1275;
                    break;
                case 34:
                    name = "Pennsylvania Avenue";
                    color = "green";
                    baseRent = 28;
                    cost = 320;
                    oneHouse = 150;
                    twoHouses = 450;
                    threeHouses = 1000;
                    fourHouses = 1200;
                    hotel = 1400;
                    break;
                case 37:
                    name = "Park Place";
                    color = "dark blue";
                    baseRent = 35;
                    cost = 350;
                    oneHouse = 175;
                    twoHouses = 500;
                    threeHouses = 1100;
                    fourHouses = 1300;
                    hotel = 1500;
                    break;
                default:
                    name = "Boardwalk";
                    color = "dark blue";
                    baseRent = 50;
                    cost = 400;
                    oneHouse = 200;
                    twoHouses = 600;
                    threeHouses = 1400;
                    fourHouses = 1700;
                    hotel = 2000;
                    break;
            }
        } else {
            if (railroad) {
                oneHouse = 25;
                twoHouses = 50;
                threeHouses = 100;
                fourHouses = 200;
                switch (number) {
                    case 5:
                        name = "Reading Railroad";
                        color = "railroad";
                        break;
                    case 15:
                        name = "Pennsylvania Railroad";
                        color = "railroad";
                        break;
                    case 25:
                        name = "B&O Railroad";
                        color = "railroad";
                        break;
                    default:
                        name = "Short Line";
                        color = "railroad";
                }
                baseRent = 25;
                cost = 200;
            } else if (utility) {
                oneHouse = 4;
                twoHouses = 10;
                switch (number) {
                    case 12:
                        name = "Electric Company";
                        color = "utility";
                        break;
                    default:
                        name = "Water Works";
                        color = "utility";
                        break;
                }
                baseRent = 4;
                cost = 150;
            } else if (chance) {
                name = "Chance";
                color = "chance";
            } else if (commChest) {
                name = "Community Chest";
                color = "commChest";
            } else {
                color = "other";
                switch (number) {
                    case 0:
                        name = "Go";
                        break;
                    case 4:
                        name = "Income Tax";
                        break;
                    case 10:
                        name = "Jail";
                        break;
                    case 20:
                        name = "Free Parking";
                        break;
                    case 30:
                        name = "Go to Jail";
                        break;
                    default:
                        name = "Luxury Tax";
                        break;
                }
            }
        }
        if (railroad || utility) {
            currHouses = 1;
        }
    }

    @Override
    public String toString() {

        return name + ": $" + baseRent;

    }

    public boolean isRailroad() {

        return railroad;

    }

    public int getCurrHouses() {

        return currHouses;

    }

    public void setCurrHouses(int houses) {

        currHouses = houses >= 0 && houses <= 5 ? houses : currHouses;

    }

    public boolean isUtility() {

        return utility;

    }

    public String getColor() {

        return color;

    }

    public double getRent(int houses) { // Hotel is five houses

        switch (houses) {
            case 0:
                return baseRent;
            case 1:
                return oneHouse;
            case 2:
                return twoHouses;
            case 3:
                return threeHouses;
            case 4:
                return fourHouses;
            default:
                return hotel;
        }

    }

    public void buildHouseOne() {

        setCurrHouses(currHouses + 1);
        switch (color) {
            case "brown":
                cost += 50;
                break;
            case "light blue":
                cost += 50;
                break;
            case "pink":
                cost += 100;
                break;
            case "orange":
                cost += 100;
                break;
            case "red":
                cost += 150;
                break;
            case "yellow":
                cost += 150;
                break;
            case "green":
                cost += 200;
                break;
            case "dark blue":
                cost += 200;
                break;
            default:
        }
        if (!utility && !railroad) {
            totalRent = timesLandedOn * getRent(currHouses);
        }

    }

    public void revertHouseOne() {

        setCurrHouses(currHouses - 1);
        switch (color) {
            case "brown":
                cost -= 50;
                break;
            case "light blue":
                cost -= 50;
                break;
            case "pink":
                cost -= 100;
                break;
            case "orange":
                cost -= 100;
                break;
            case "red":
                cost -= 150;
                break;
            case "yellow":
                cost -= 150;
                break;
            case "green":
                cost -= 200;
                break;
            case "dark blue":
                cost -= 200;
                break;
            default:
        }
        if (!utility && !railroad) {
            totalRent = timesLandedOn * getRent(currHouses);
        }

    }

    public void buildHouseAll() {

        setCurrHouses(currHouses + 1);
        switch (color) {
            case "brown":
                brownCost += 100;
                break;
            case "light blue":
                lightBlueCost += 150;
                break;
            case "pink":
                pinkCost += 300;
                break;
            case "orange":
                orangeCost += 300;
                break;
            case "red":
                redCost += 450;
                break;
            case "yellow":
                yellowCost += 450;
                break;
            case "green":
                greenCost += 600;
                break;
            case "dark blue":
                darkBlueCost += 400;
                break;
            case "railroad":
                cost += 200;
                break;
            case "utility":
                cost += 150;
                break;
            default:
        }
        if (!utility && !railroad) {
            totalRent = timesLandedOn * getRent(currHouses);
        }

    }

    public void revertHouseAll() {

        setCurrHouses(currHouses - 1);
        switch (color) {
            case "brown":
                brownCost -= 100;
                break;
            case "light blue":
                lightBlueCost -= 150;
                break;
            case "pink":
                pinkCost -= 300;
                break;
            case "orange":
                orangeCost -= 300;
                break;
            case "red":
                redCost -= 450;
                break;
            case "yellow":
                yellowCost -= 450;
                break;
            case "green":
                greenCost -= 600;
                break;
            case "dark blue":
                darkBlueCost -= 400;
                break;
            case "railroad":
                cost -= 200;
                break;
            case "utility":
                cost -= 150;
                break;
            default:
        }
        if (!utility && !railroad) {
            totalRent = timesLandedOn * getRent(currHouses);
        }

    }

    public void land(int roll) {

        timesLandedOn++;
        totalRent += utility ? getRent(currHouses) * roll : getRent(currHouses);

    }
    
    public void landFromChance(int roll) {
        
        timesLandedOn++;
        totalRent += utility ? roll * 10 : (railroad && MonopolySim.board.deck[0].get(0).effect == 456 ? (getRent(currHouses) * 2) : getRent(currHouses));
        chanceLandsUtil += utility ? roll : 0;
        
    }

    public double getTimesLanded() {

        return timesLandedOn;

    }

    private int setGroupCost() {

        int groupCost;
        switch (color) {
            case "brown":
                groupCost = brownCost;
                break;
            case "light blue":
                groupCost = lightBlueCost;
                break;
            case "pink":
                groupCost = pinkCost;
                break;
            case "orange":
                groupCost = orangeCost;
                break;
            case "red":
                groupCost = redCost;
                break;
            case "yellow":
                groupCost = yellowCost;
                break;
            case "green":
                groupCost = greenCost;
                break;
            case "dark blue":
                groupCost = darkBlueCost;
                break;
            default:
                groupCost = 0;
        }
        return groupCost;

    }

    public String getStats(int returnType) { // Either 0, 1, or 2.

        double avgRolls = MonopolySim.turns /  timesLandedOn;
        String lands = "\nLanded on " + timesLandedOn + " times";
        String avgTurnsForLand = "\nAverage of " + avgRolls + " turns to land on this space";
        String avgRecoupUnim = "\nAverage of " + avgRolls * cost / (timesLandedOn != 0 ? totalRent / timesLandedOn : 1) + " turns to recoup investment (Unimproved, Single Property)";
        int groupCost = setGroupCost();
        String avgRecoupAll2 = "\nAverage of " + avgRolls * groupCost / (timesLandedOn != 0 ? 2 * totalRent / timesLandedOn : 1) + " turns to recoup investment (Unimproved, All Properties of this Color, Counting Costs for Other Properties in this Group)";
        String avgRecoupAll1 = "\nAverage of " + avgRolls * cost / (timesLandedOn != 0 ? 2 * totalRent / timesLandedOn : 1) + " turns to recoup investment (Unimproved, All Properties of this Color, Counting Costs for this Property Only)";
        String avgRecoupOneRR1 = "\nAverage of " + avgRolls * (cost / (timesLandedOn != 0 ? totalRent / timesLandedOn : 1)) + " turns to recoup investment (One Railroad)";

        buildHouseOne();

        String avgRecoupOneHouse1 = "\nAverage of " + avgRolls * cost / (timesLandedOn != 0 ? totalRent / timesLandedOn : 1) + " turns to recoup investment (One House, Counting Costs for this Property Only)";
        totalRent *= 2;
        String avgRecoupTwoRR1 = "\nAverage of " + avgRolls * cost / (timesLandedOn != 0 ? totalRent / timesLandedOn : 1) + " turns to recoup investment (Two Railroads, Counting Costs for this Property Only)";
        totalRent /= 2;
        
        revertHouseOne();

        buildHouseAll();

        groupCost = setGroupCost();
        String avgRecoupOneHouse2 = "\nAverage of " + avgRolls * groupCost / (timesLandedOn != 0 ? totalRent / timesLandedOn : 1) + " turns to recoup investment (One House, Counting Costs for Other Properties in this Group)";
        totalRent *= 2;
        String avgRecoupTwoRR2 = "\nAverage of " + avgRolls * 400 / (timesLandedOn != 0 ? totalRent / timesLandedOn : 1) + " turns to recoup investment (Two Railroads, Counting Costs for Other Properties in this Group)";
        totalRent /= 2;
        
        revertHouseAll();

        buildHouseOne();
        buildHouseOne();

        String avgRecoupTwoHouse1 = "\nAverage of " + avgRolls * cost / (timesLandedOn != 0 ? totalRent / timesLandedOn : 1) + " turns to recoup investment (Two Houses, Counting Costs for this Property Only)";
        totalRent *= 4;
        String avgRecoupThreeRR1 = "\nAverage of " + avgRolls * cost / (timesLandedOn != 0 ? totalRent / timesLandedOn : 1) + " turns to recoup investment (Three Railroads, Counting Costs for this Property Only)";
        totalRent /= 4;
        
        revertHouseOne();
        revertHouseOne();

        buildHouseAll();
        buildHouseAll();

        groupCost = setGroupCost();
        String avgRecoupTwoHouse2 = "\nAverage of " + avgRolls * groupCost / (timesLandedOn != 0 ? totalRent / timesLandedOn : 1) + " turns to recoup investment (Two Houses, Counting Costs for Other Properties in this Group)";
        totalRent *= 4;
        String avgRecoupThreeRR2 = "\nAverage of " + avgRolls * 600 / (timesLandedOn != 0 ? totalRent / timesLandedOn : 1) + " turns to recoup investment (Three Railroads, Counting Costs for Other Properties in this Group)";
        totalRent /= 4;
        
        revertHouseAll();
        revertHouseAll();

        buildHouseOne();
        buildHouseOne();
        buildHouseOne();

        String avgRecoupThreeHouse1 = "\nAverage of " + avgRolls * cost / (timesLandedOn != 0 ? totalRent / timesLandedOn : 1) + " turns to recoup investment (Three Houses, Counting Costs for this Property Only)";
        totalRent *= 8;
        String avgRecoupFourRR1 = "\nAverage of " + avgRolls * cost / (timesLandedOn != 0 ? totalRent / timesLandedOn : 1) + " turns to recoup investment (Four Railroads, Counting Costs for this Property Only)";
        totalRent /= 8;
        
        revertHouseOne();
        revertHouseOne();
        revertHouseOne();

        buildHouseAll();
        buildHouseAll();
        buildHouseAll();

        groupCost = setGroupCost();
        String avgRecoupThreeHouse2 = "\nAverage of " + avgRolls * groupCost / (timesLandedOn != 0 ? totalRent / timesLandedOn : 1) + " turns to recoup investment (Three Houses, Counting Costs for Other Properties in this Group)";
        totalRent *= 8;
        String avgRecoupFourRR2 = "\nAverage of " + avgRolls * 800 / (timesLandedOn != 0 ? totalRent / timesLandedOn : 1) + " turns to recoup investment (Four Railroads, Counting Costs for Other Properties in this Group)";
        totalRent /= 8;
        
        revertHouseAll();
        revertHouseAll();
        revertHouseAll();

        for (int i = 0; i < 4; i++) {
            buildHouseOne();
        }

        String avgRecoupFourHouse1 = "\nAverage of " + avgRolls * cost / (timesLandedOn != 0 ? totalRent / timesLandedOn : 1) + " turns to recoup investment (Four Houses, Counting Costs for this Property Only)";

        for (int i = 0; i < 4; i++) {
            revertHouseOne();
        }

        for (int i = 0; i < 4; i++) {
            buildHouseAll();
        }

        groupCost = setGroupCost();
        String avgRecoupFourHouse2 = "\nAverage of " + avgRolls * groupCost / (timesLandedOn != 0 ? totalRent / timesLandedOn : 1) + " turns to recoup investment (Four Houses, Counting Costs for Other Properties in this Group)";

        for (int i = 0; i < 4; i++) {
            revertHouseAll();
        }

        for (int i = 0; i < 5; i++) {
            buildHouseOne();
        }

        String avgRecoupHotel1 = "\nAverage of " + avgRolls * cost / (timesLandedOn != 0 ? totalRent / timesLandedOn : 1) + " turns to recoup investment (Hotel, Counting Costs for this Property Only)";

        for (int i = 0; i < 5; i++) {
            revertHouseOne();
        }

        for (int i = 0; i < 5; i++) {
            buildHouseAll();
        }

        groupCost = setGroupCost();
        String avgRecoupHotel2 = "\nAverage of " + avgRolls * groupCost / (timesLandedOn != 0 ? totalRent / timesLandedOn : 1) + " turns to recoup investment (Hotel, Counting Costs for Other Properties in this Group)";

        for (int i = 0; i < 5; i++) {
            revertHouseAll();
        }

        String avgIncomePerTurnZero = "\nAverage of $" + getRent(0) / avgRolls + " earned per turn (Unimproved, Single Property).";
        String avgIncomePerTurnZero2 = "\nAverage of $" + 2 * getRent(0) / avgRolls + " earned per turn (Unimproved, Color Group Owned).";
        String avgIncomePerTurnOne = "\nAverage of $" + getRent(1) / avgRolls + " earned per turn (One House).";
        String avgIncomePerTurnTwo = "\nAverage of $" + getRent(2) / avgRolls + " earned per turn (Two Houses).";
        String avgIncomePerTurnThree = "\nAverage of $" + getRent(3) / avgRolls + " earned per turn (Three Houses).";
        String avgIncomePerTurnFour = "\nAverage of $" + getRent(4) / avgRolls + " earned per turn (Four Houses).";
        String avgIncomePerTurnHotel = "\nAverage of $" + getRent(5) / avgRolls + " earned per turn (Hotel).";
        String avgIncomePerTurnOneRR = "\nAverage of $" + totalRent / (timesLandedOn != 0 ? timesLandedOn * avgRolls : 1) + " earned per turn (One Railroad).";
        totalRent *= 2;
        String avgIncomePerTurnTwoRR = "\nAverage of $" + totalRent / (timesLandedOn != 0 ? timesLandedOn * avgRolls : 1) + " earned per turn (Two Railroads).";
        totalRent *= 2;
        String avgIncomePerTurnThreeRR = "\nAverage of $" + totalRent / (timesLandedOn != 0 ? timesLandedOn * avgRolls : 1) + " earned per turn (Three Railroads).";
        totalRent *= 2;
        String avgIncomePerTurnFourRR = "\nAverage of $" + totalRent / (timesLandedOn != 0 ? timesLandedOn * avgRolls : 1) + " earned per turn (Four Railroads).";
        totalRent /= 8;
        String avgIncomePerTurnOneUtil = "\nAverage of $" + totalRent / (timesLandedOn != 0 ? timesLandedOn * avgRolls : 1) + " earned per turn (One Utility).";
        totalRent -= (6 * chanceLandsUtil);
        totalRent *= 5;
        totalRent /= 2;
        String avgIncomePerTurnTwoUtil = "\nAverage of $" + totalRent / (timesLandedOn != 0 ? timesLandedOn * avgRolls : 1) + " earned per turn (Both Utilities).";

        totalRent *= 2;
        totalRent /= 5;
        totalRent += (6 * chanceLandsUtil);

        String avgRecoupOneUtil = "\nAverage of " + avgRolls * 150 / (timesLandedOn != 0 ? totalRent / timesLandedOn : 1) + " turns to recoup investment (One Utility)";
        totalRent -= (6 * chanceLandsUtil);
        totalRent *= 5;
        totalRent /= 2;
        String avgRecoupTwoUtil1 = "\nAverage of " + avgRolls * 150 / (timesLandedOn != 0 ? totalRent / timesLandedOn : 1) + " turns to recoup investment (Both Utilities, Counting Costs for this Property Only)";
        String avgRecoupTwoUtil2 = "\nAverage of " + avgRolls * 300 / (timesLandedOn != 0 ? totalRent / timesLandedOn : 1) + " turns to recoup investment (Both Utilities, Counting Costs for Other Properties in this Group)";

        String output = name + lands + avgTurnsForLand;
        switch (returnType) {
            case 0:
                output += !other && !chance && !commChest && !railroad && !utility ? avgRecoupUnim : "";
                output += railroad ? avgRecoupOneRR1 + avgRecoupTwoRR1 + avgRecoupThreeRR1 + avgRecoupFourRR1 : "";
                output += !other && !chance && !commChest && !railroad && !utility ? avgRecoupAll1 + avgRecoupOneHouse1 + avgRecoupTwoHouse1 + avgRecoupThreeHouse1 + avgRecoupFourHouse1 + avgRecoupHotel1 : "";
                output += utility ? avgRecoupOneUtil + avgRecoupTwoUtil1 : "";
                break;
            case 1:
                output += !other && !chance && !commChest && !railroad && !utility ? avgRecoupUnim : "";
                output += railroad ? avgRecoupOneRR1 + avgRecoupTwoRR2 + avgRecoupThreeRR2 + avgRecoupFourRR2 : "";
                output += !other && !chance && !commChest && !railroad && !utility ? avgRecoupAll2 + avgRecoupOneHouse2 + avgRecoupTwoHouse2 + avgRecoupThreeHouse2 + avgRecoupFourHouse2 + avgRecoupHotel2 : "";
                output += utility ? avgRecoupOneUtil + avgRecoupTwoUtil2 : "";
                break;
            default:
                output += !other && !chance && !commChest && !railroad && !utility ? avgIncomePerTurnZero + avgIncomePerTurnZero2 + avgIncomePerTurnOne + avgIncomePerTurnTwo + avgIncomePerTurnThree + avgIncomePerTurnFour + avgIncomePerTurnHotel : "";
                output += railroad ? avgIncomePerTurnOneRR + avgIncomePerTurnTwoRR + avgIncomePerTurnThreeRR + avgIncomePerTurnFourRR : "";
                output += utility ? avgIncomePerTurnOneUtil + avgIncomePerTurnTwoUtil : "";
        }
        return output;

    }

}
