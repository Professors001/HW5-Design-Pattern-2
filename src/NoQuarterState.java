public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getChooseState());
    }
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }
    public void turnCrank() {
        System.out.println("You turned but there's no quarter");
    }
    public void dispense() {
        System.out.println("You need to pay first");
    }
    public void choose() {
        System.out.println("You haven't inserted a quarter Yet!");
    }
}
//6510451085 Aphisit Prasertvesyakorn