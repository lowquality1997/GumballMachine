public class GumballMachine {
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;

	int state = SOLD_OUT;
	int count = 0 ;
	
	
	public GumballMachine(int count) {
			this.count = count;
			if (count > 0) {
			state = NO_QUARTER;	
}
}
	public void insertQuarter() {
	if (state == HAS_QUARTER) { 
	System.out.println("ThYou can�t insert another quarter");
    } else if (state == NO_QUARTER) {
	state = HAS_QUARTER;
	System.out.println("You inserted a quarter"); 
    } else if (state == SOLD_OUT) {
	System.out.println("You can�t insert a quarter, the machine is sold out");
    } else if (state == SOLD) {
	System.out.println("Please wait, we�re already giving you a gwnball");
}
}
	

	public void ejectQuarter() {
	if (state == HAS_QUARTER) { 
	System.out.println("Quarter returned"); 
	  state = NO_QUARTER;
	} else if (state == NO_QUARTER) {
	System.out.println("You haven�t inserted a quarter"); 
	} else if (state == SOLD) {
	System.out.println("Sorry, you already turned the crank");
	} else if (state == SOLD_OUT) {
	System.out.println("You can�t e]ect, you haven�t inserted a quarter yet");
}
	}
	
	public void turnCrank() {
	if (state == SOLD) {
	System.out.println("Turning twice doesn�t get you another gwnball!");
    } else if (state == NO_QUARTER) {
	System.out.println("You turned but there�s no quarter"); 
	} else if (state == SOLD_OUT){
	System.out.println("mYou turned, but there are no guznballs");
	} else if (state == HAS_QUARTER) {
	System.out.println("You turned...");
	state = SOLD; 
	dispense();
	}
    }

	public void dispense () {
	     if (state == SOLD){
	System.out.println("A gumball comes rolling out the slot");
	  count = count -1;
	if (count == 0) {
	System.out.println("Oops, out of qumballs!");
	state = SOLD_OUT;
	} else{ 
		state = NO_QUARTER;
	}
	} else if (state == NO_QUARTER) {
           System.out.println("You need to pay first");
    }  else if (state == SOLD_OUT) {
	System.out.println("No gumball dispensed");
    } else if (state == HAS_QUARTER){
	System.out.println("No gumball dispensed");
	
    }
}
	public String toString(){
		String status = "Gumball Machine";
		if(state == HAS_QUARTER){
			status = status+"\n status : HAS_QUARTER";
		} else if(state == NO_QUARTER){
		    status = status+"\n status : NO_QUARTER";
		} else if(state == SOLD){
			status = status+"\n status :  SOLD";
        } else if(state == SOLD_OUT){
        	status = status+"\n status :  SOLD_OUT";
        }
		status = status+"\n status : "+this.count;
		
		return status;
	}
	
	
}
		

	

 