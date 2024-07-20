import java.util.Random;

public class HasQuarterState implements State {
    GumballMachine gumballMachine;
    Random randMachine = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
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
        if(gumballMachine.getFlavor().isEmpty()) {
            System.out.println("You have to choose the flavor first");
        } else {
            System.out.println("You turned...");
            int randNum = randMachine.nextInt(10);
            if ((randNum == 0) && (gumballMachine.getGumballCount() > 1)) {
                gumballMachine.setState(gumballMachine.getWinnerState());
            } else {
                gumballMachine.setState(gumballMachine.getSoldState());
            }
        }
    }
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
//6510451085 อภิสิทธิ์ ประเสริฐเวศยากร