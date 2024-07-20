public class ChooseState implements State{
    GumballMachine gumballMachine;

    public ChooseState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Quarters returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("You have to choose the flavor first");
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public void choose() {
        if(!gumballMachine.getFlavor().isEmpty()) {
            System.out.println("You have chosen the flavor " + gumballMachine.getFlavor());
            gumballMachine.setState(gumballMachine.getHasQuarterState());
        }
    }
}
//6510451085 Aphisit Prasertvesyakorn