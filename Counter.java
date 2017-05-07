public class Counter {
	private int wellbeing;
	private int hunger;

public void WellbeingUp(){
	wellbeing++;

	System.out.println("Your well being is currently at " + wellbeing + ", Nice Job.");
	
}

public void WellbeingDown(){
	wellbeing--;
	
	System.out.println("Oops, Your well being is currently at " + wellbeing + ", bad move.");
}

public void HungerDown(){
	hunger--;
	
	System.out.println("You decided to eat, your hunger level is now " + hunger + ", Satisfying" );
}
		

}
  
