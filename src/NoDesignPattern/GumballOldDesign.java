package NoDesignPattern;

import java.util.Random;

public class GumballOldDesign {
    private int gumballCount;
    private boolean hasQuarters;
    private final Random randomEngine;
    private String flavor;

    public GumballOldDesign(int gumballCount) {
        this.randomEngine = new Random();
        this.gumballCount = gumballCount;
        hasQuarters = false;
        System.out.println("Mighty Gumball, Inc.");
        System.out.println("Java-enabled Standing Gumball Model #2004");
        System.out.println("Inventory: " + gumballCount + " Gumballs");
        if (gumballCount > 0) {
            System.out.println("Machine is waiting for quarter");
        } else {
            System.out.println("Machine is sold out");
        }
    }

    public int getGumballCount() {
        return gumballCount;
    }

    public void insertCoin() {

        if(hasQuarters) {
            System.out.println("You can't insert another quarter");
            return;
        }
        if(gumballCount <= 0) {
            System.out.println("You can't insert another quarter, the machine is sold out");
            return;
        }
        System.out.println("You inserted a quarter");
        hasQuarters = true;
    }

    public void ejectCoin() {
        if(hasQuarters) {
            hasQuarters = false;
            System.out.println("Quarters returned");
            return;
        }
        System.out.println("You haven't inserted a quarter");
    }

    public void turnsCrank() {
        if(gumballCount <= 0) {
            System.out.println("You turned, but there are no gumballs");
            return;
        }
        if(hasQuarters) {
            if(getFlavor()) {
                System.out.println("You turned...");
                int randValue = randomEngine.nextInt(1, 11);
                if(randValue == 1 && getGumballCount() >= 2) {
                    System.out.println("LUCKY FOR YOU!");
                    System.out.println("A Two " + flavor + " gumball comes rolling out the slot");
                    hasQuarters = false;
                    gumballCount -= 2;
                } else {
                    System.out.println("A " + flavor + " gumball comes rolling out the slot");
                    hasQuarters = false;
                    gumballCount--;
                }
                if(gumballCount == 0) {
                    System.out.println("Oops, Out of gumballs!");
                }
                return;
            }
            return;
        }
        System.out.println("You turned but there's no quarter");
        return;
    }

    public void choose(String flavor) {
        this.flavor = flavor;
        System.out.println("You have chosen the flavor " + flavor);
    }

    public boolean getFlavor() {
        if(flavor == null) {
            System.out.println("You have to choose the flavor first\n" +
                    "No gumball dispensed");
            return false;
        }
        return true;
    }

}
//6510451085 อภิสิทธิ์ ประเสริฐเวศยากร
