
public class Gumballl4achineTestDrive {
	public static void main(String[] arqs){
		GumballMachine gumballMachine = new GumballMachine(5);
				
		System.out.println (gumballMachine);
		System.out.println ("--------------------------------------1");

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println (gumballMachine);
		System.out.println ("--------------------------------------2");
		
		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		gumballMachine.turnCrank ();
		System.out.println (gumballMachine);
		System.out.println ("--------------------------------------3");
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank ();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank ();
		gumballMachine.ejectQuarter();
		System.out.println (gumballMachine);
		System.out.println ("--------------------------------------4");
		
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank ();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank ();
		System.out.println(gumballMachine);
		System.out.println ("--------------------------------------5");


}
}


