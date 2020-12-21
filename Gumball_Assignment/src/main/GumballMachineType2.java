package main;

import java.util.Arrays;
import java.util.HashSet;

public class GumballMachineType2 extends GumballMachine {

	public GumballMachineType2(int size) {
		super(size);
		this.costPerGumball = 50;
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
