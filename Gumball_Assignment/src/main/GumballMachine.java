package main;

import java.util.Set;

public class GumballMachine {

    public int numberOfGumballs;
    public int costPerGumball;
	public Set<Integer> coinsAccepted;
	public int totalMoneyInGumball;

	State hasAmountEqualToCostState;
    State doesNotHaveAmountEqualToCostState;
    State noGumballsState;
    
    State currentState;

	public GumballMachine(int size) {
        /*
         * Initialize the States, Current State and number of gumballs in machine
         */
		hasAmountEqualToCostState = new HasAmountEqualToCostState(this);
		doesNotHaveAmountEqualToCostState = new DoesNotHaveAmountEqualToCostState(this);
		noGumballsState = new NoGumballsState(this);
		
		currentState = doesNotHaveAmountEqualToCostState;
		this.numberOfGumballs = size;
		
		/*
		 * If size is zero/less than zero, set it to zero and No gumball state by default
		 */
		if(size<=0) {
			currentState = noGumballsState;
			this.numberOfGumballs = 0;
		}
		
		/*
		 * Initialize total money in machine
		 */
        this.totalMoneyInGumball = 0;
    }
	
	/*
	 * Inserts a coin based on the validation of machine. The code is written in the Super Class .ie.GumballMachine, 
	 * however, it has scope for extension in its child classes 
	 */
    public void insertCoin(int coin) {
    	/*
    	 * Validate the coins inserted
    	 */
    	if(coinValidation(coin)) {
    		/*
    		 * Call of insert coin will be based on the state
    		 */
    		this.currentState.insertCoin();
		} else {
			/*
			 * Print message based on Machine Type
			 */
			if((this.getClass().equals(GumballMachineType1.class)) || (this.getClass().equals(GumballMachineType2.class))) {
				System.out.println("This machine accepts only quarters. Please enter a Quarter(25 cents)");
			} else if(this.getClass().equals(GumballMachineType3.class)) {
				System.out.println("This machine accepts Nickels, Dimes and Quarters. Please enter a Nickel(5 cents), Dime(10 cents) or a Quarter(25 cents)");
			}			
		}
    }
    
    /*
     * Method to check whether a valid coin is inserted
     */
    public boolean coinValidation(int coin) {
    	if(this.getCoinsAccepted().contains(coin)) {
    		this.totalMoneyInGumball+= coin;
    		return true;
    	} else {
    		return false;
    	}
    }
    
    /*
	 * Turns the crank to dispense Gumballs based on the state of the machine. The code is written in the Super Class .ie.GumballMachine, 
	 * however, it has scope for extension in its child classes 
	 */
    public void turnCrank() {
    	this.currentState.turnCrank();
    }
    
    public State getHasAmountEqualToCostState() {
		return hasAmountEqualToCostState;
	}

	public State getDoesNotHaveAmountEqualToCostState() {
		return doesNotHaveAmountEqualToCostState;
	}

	public State getNoGumballsState() {
		return noGumballsState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
	
	public State getCurrentState() {
		return currentState;
	}
	
	public int getTotalMoneyInGumball() {
		return totalMoneyInGumball;
	}
	
	public int getCostPerGumball() {
		return costPerGumball;
	}
	
	public int getNumberOfGumballs() {
		return numberOfGumballs;
	}

	public Set<Integer> getCoinsAccepted() {
		return coinsAccepted;
	}
	
}