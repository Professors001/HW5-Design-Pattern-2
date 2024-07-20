public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    State chooseState;

    State state;
    int gumballCount = 0;
    String flavor;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        chooseState = new ChooseState(this);

        this.gumballCount = numberGumballs;
        if (numberGumballs <= 0) {
            state = soldOutState;
        } else {
            state = noQuarterState;
        }
        System.out.println("Mighty Gumball, Inc.");
        System.out.println("Java-enabled Standing Gumball Model #2004");
        System.out.println("Inventory: " + gumballCount + " Gumballs");
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void choose(String flavor) {
        this.flavor = flavor;
        state.choose();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void dispense() {
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A " + flavor + " gumball comes rolling out the slot...");
        if(gumballCount != 0) {
            gumballCount = gumballCount - 1;
        }
    }

    State getSoldOutState() {
        return soldOutState;
    }

    State getNoQuarterState() {
        return noQuarterState;
    }

    State getHasQuarterState() {
        return hasQuarterState;
    }

    State getSoldState() {
        return soldState;
    }

    State getWinnerState() {
        return winnerState;
    }

    State getChooseState() {
        return chooseState;
    }

    int getGumballCount() {
        return gumballCount;
    }

    String getFlavor() {
        return flavor;
    }
}
//6510451085 Aphisit Prasertvesyakorn
