public class Main {
    public static void main(String[] args) {
        GumballMachine gm1 = new GumballMachine(5);
        System.out.println();
        gm1.insertQuarter();
        gm1.turnCrank();

        System.out.println();
        GumballMachine gm2 = new GumballMachine(5);
        System.out.println();
        gm2.insertQuarter();
        gm2.choose("Mango");
        gm2.choose("Orange");
        gm2.turnCrank();
    }
}
//6510451085 Aphisit Prasertvesyakorn