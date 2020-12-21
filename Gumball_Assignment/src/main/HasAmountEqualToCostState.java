package main;

/*
 * Defines the state where the Machine has enough money to dispense a Gumball
 */
public class HasAmountEqualToCostState implements State{

	GumballMachine machine;
	
	public HasAmountEqualToCostState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertCoin() {
		System.out.println("The machine has sufficient coins to dispense the Gumball. You can now turn the crank");
	}

	@Override
	public void turnCrank() {
		
		int amountInMachine = this.machine.getTotalMoneyInGumball();
		int costPerGumball = this.machine.getCostPerGumball();
		int numberOfDispensableGumballs = amountInMachine/costPerGumball;	
		int numBerOfGumballsInMachine = this.machine.getNumberOfGumballs();
			
		if(numberOfDispensableGumballs>=numBerOfGumballsInMachine) {
			if(numBerOfGumballsInMachine==1) {
				System.out.println(numBerOfGumballsInMachine + " Gumball is ejected");
			} else {
				System.out.println(numBerOfGumballsInMachine + " Gumballs are ejected");
			}
			this.machine.numberOfGumballs = 0;
			numberOfDispensableGumballs = numberOfDispensableGumballs - numBerOfGumballsInMachine;
			this.machine.totalMoneyInGumball = numberOfDispensableGumballs*costPerGumball + amountInMachine%costPerGumball;
			this.machine.setCurrentState(this.machine.getNoGumballsState());
		} else {
			if(numberOfDispensableGumballs==1) {
				System.out.println(numberOfDispensableGumballs + " Gumball is ejected");
			} else {
				System.out.println(numberOfDispensableGumballs + " Gumballs are ejected");
			}
			this.machine.numberOfGumballs = numBerOfGumballsInMachine - numberOfDispensableGumballs;
			this.machine.totalMoneyInGumball = amountInMachine%costPerGumball;
			this.machine.setCurrentState(this.machine.getDoesNotHaveAmountEqualToCostState());
		}
			
	}
	
}
