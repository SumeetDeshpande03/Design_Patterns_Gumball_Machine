package main;

import java.util.Arrays;
import java.util.HashSet;

public class GumballMachineType3 extends GumballMachine {

	public GumballMachineType3(int size) {
		super(size);
		this.costPerGumball = 50;
		this.coinsAccepted = new HashSet<>(Arrays.asList(5,10,25));
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
