
public class Counter {
	public static int wellbeing = 0;
	public static int hunger = 3;
	
	public static void main(String[] args){
		WellbeingUp();
		WellbeingDown();
		HungerDown();	
		Wellbeing2Up();
	}

public static void WellbeingUp(){
	wellbeing++;
	System.out.println("Your well being is currently at " + wellbeing + ", Nice Job.");
	
	
}

public static void WellbeingDown(){
	wellbeing--;
	
	System.out.println("Oops, Your well being is currently at " + wellbeing + ", bad move.");
	if (wellbeing == -2){
		System.out.println("Be careful, your state of wellbeing is dangerously close to -3");
	}
}

public static void HungerDown(){
	hunger--;
	
	System.out.println("You decided to eat, your hunger level is now " + hunger + ", Mmm Satisfying" );
}

public static void Wellbeing2Up(){
	wellbeing += 2;
	System.out.println("Your well being is currently at " + wellbeing + ", sneaky sneaky...");
}
 public static void Excom(){
	 wellbeing = -4;
	 System.exit(0);
 }

}
