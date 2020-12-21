package main;

/*
 * Defines the state where the Machine does not have enough money to dispense a Gumball
 */
public class DoesNotHaveAmountEqualToCostState implements State{

	GumballMachine machine;
	
	public DoesNotHaveAmountEqualToCostState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertCoin() {
		int remainingMoney = this.machine.getCostPerGumball() - this.machine.getTotalMoneyInGumball();
		if(remainingMoney>0) {
			System.out.println("Please enter " + remainingMoney + " more cents to match the cost of the Gumball");
		} else {
			System.out.println("Sufficient coins are inserted to dispense a Gumball");
			this.machine.setCurrentState(machine.getHasAmountEqualToCostState());
		}		
	}

	@Override
	public void turnCrank() {
		int remainingMoney = this.machine.getCostPerGumball() - this.machine.getTotalMoneyInGumball();
		System.out.println("Coins inserted are not sufficient to dispense the Gumball. "
				+ "Please enter " + remainingMoney + " more cents to dispense a Gumball");
	}
	
}
