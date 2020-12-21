package main;

/*
 * Defines the state where the Machine does not have any Gumballs left to dispense
 */
public class NoGumballsState implements State{
	
	GumballMachine machine;
	
	public NoGumballsState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertCoin() {
		System.out.println("The Gumball Machine has no more gumballs. Sorry, can't return your coin/s");
	}

	@Override
	public void turnCrank() {
		System.out.println("This machine is out of Gumballs. Sorry, it cannot dispense anymore Gumball/s thus.");
	}
	
}
