package main;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Gumball Machine Type 1: \n");
		
		GumballMachine machine = GumballMachineFactory.getGumballMachine(1);
		machine.insertCoin(25);
		machine.insertCoin(25);
		/*
		 * Will dispense the number of Gumballs equal to the money inserted before the last dispensing
		 */
		machine.turnCrank();
		
		System.out.println("____________________________________________________________________________\n");
		
		machine.insertCoin(10);
		machine.insertCoin(25);
		machine.turnCrank();
		
		System.out.println("____________________________________________________________________________\n");
		
		machine.insertCoin(25);
		machine.insertCoin(25);
		machine.turnCrank();
		machine.turnCrank();
		machine.insertCoin(25);
		
		System.out.println("____________________________________________________________________________\n");
		
		
		System.out.println("Gumball Machine Type 2: \n");
		
		GumballMachine machine2 = GumballMachineFactory.getGumballMachine(2);
		machine2.insertCoin(25);
		machine2.insertCoin(25);
		machine2.insertCoin(25);
		machine2.turnCrank();
		
		System.out.println("____________________________________________________________________________\n");
		
		/*
		 * Will carry forward the extra amount
		 */
		machine2.turnCrank();
		machine2.insertCoin(125);
		machine2.insertCoin(25);
		machine2.insertCoin(25);
		machine2.insertCoin(25);
		machine2.turnCrank();
		
		System.out.println("____________________________________________________________________________\n");
		
		machine2.insertCoin(25);
		machine2.insertCoin(25);
		machine2.insertCoin(25);
		machine2.insertCoin(25);
		machine2.insertCoin(25);
		machine2.insertCoin(25);
		machine2.turnCrank();
		/*
		 * Will only dispense those many Gumballs that are present in the system
		 */
		machine2.turnCrank();
		machine2.insertCoin(25);
		
		System.out.println("____________________________________________________________________________\n");
		
		System.out.println("Gumball Machine Type 3: \n");
		
		GumballMachine machine3 = GumballMachineFactory.getGumballMachine(3);
		machine3.insertCoin(5);
		machine3.insertCoin(45);
		machine3.insertCoin(25);
		machine3.insertCoin(10);
		machine3.insertCoin(10);
		machine3.insertCoin(25);
		machine3.turnCrank();
		
		System.out.println("____________________________________________________________________________\n");
		
		machine3.turnCrank();
		machine3.insertCoin(25);
		machine3.insertCoin(25);
		machine3.insertCoin(25);
		machine3.insertCoin(25);
		machine3.insertCoin(25);
		machine3.turnCrank();
		
		System.out.println("____________________________________________________________________________\n");
		
		machine3.turnCrank();
		machine3.insertCoin(15);
		machine3.insertCoin(5);
		machine3.insertCoin(10);
		machine3.insertCoin(25);
		machine3.insertCoin(5);
		machine3.insertCoin(5);
		machine3.turnCrank();
		machine3.turnCrank();
		machine3.insertCoin(10);
		
		
	}

}
