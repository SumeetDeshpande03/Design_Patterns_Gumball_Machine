package main;

import java.util.Arrays;
import java.util.HashSet;

public class GumballMachineType1 extends GumballMachine {

	public GumballMachineType1(int size) {
		super(size);
		this.costPerGumball = 25;
		this.coinsAccepted = new HashSet<>(Arrays.asList(25));
	}
	
	@Override
	public void insertCoin(int coin) {
		super.insertCoin(coin);
		/*
		 * Scope for further extension if need be
		 */
	}

	@Override
	public void turnCrank() {
		super.turnCrank();
		/*
		 * Scope for further extension if need be
		 */
	}

}
