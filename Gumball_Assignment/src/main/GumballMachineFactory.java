package main;

/*
 * Factory Pattern used to create objects of various machines based on the requirement
 */
public class GumballMachineFactory {

	public static GumballMachine getGumballMachine(int machineType){
		
		GumballMachine machine = null;
		
		switch(machineType) {
			case 1: machine = new GumballMachineType1(5);
					break;
			
			case 2: machine = new GumballMachineType2(5);
					break;
					
			case 3: machine = new GumballMachineType3(5);
					break;
					
			default: machine = new GumballMachineType1(5);		 
		}
		
		return machine;
	}

}
