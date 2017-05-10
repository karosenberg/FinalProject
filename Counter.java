
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
	terminationClause();
	
	System.out.println("Oops, Your well being is currently at " + wellbeing + ", bad move.");
	
	if (wellbeing == -2){
		System.out.println("Be careful, your state of wellbeing is dangerously close to -3");
	}
}

public static void HungerDown(){
	hunger--;
	
	System.out.println("You decided to eat, your hunger level is now " + hunger + ", Mmm Satisfying" );
}

public static void HungerUp(){
	hunger++;	
	System.out.println("Your hunger level is now " + hunger + ", *Stomach Grumbles*");
}

public static void Wellbeing2Up(){
	wellbeing += 2;
	System.out.println("Awesome move, your well being is currently at " + wellbeing );
}
 public static void Excom(){
	 wellbeing = -4;
	 StdAudio.play("deathsong_harvard.wav");
	 System.out.println("Do you want to play again? 1/0");
				Scanner console = new Scanner(System.in);
				int playAgain = console.nextInt();
				if (playAgain == 1) {
					wellbeing = 0;
					hunger = 3;
					PlayGame.main(null);
				} else {
					System.exit(0);
				}
				console.close();
 }
 public static void showWellbeing(){
	System.out.println("Congratulations! You have an awesome " + wellbeing + " points to show off to your friends!");
	 StdAudio.play("bulldog.wav");
}
 public static int getHunger(){
	return hunger;
}
public static int getWellbeing(){
	return wellbeing;
}

public static void theHungerEffect(){
	if (hunger == 3){
		wellbeing -= 6;
	}
	else if (hunger == 2){
		wellbeing -= 4;
	}
	else if (hunger == 1){
		wellbeing -= 2;
	}
}
	public static void terminationClause() {
		if (wellbeing < -2) {
			System.out.println("GAME OVER, your wellbeing reached negative 3.");
			if (Counter.getWellbeing() <= -3) {
				StdAudio.play("deathsong_harvard.wav");
				System.out.println("Do you want to play again? 1/0");
				Scanner console = new Scanner(System.in);
				int playAgain = console.nextInt();
				if (playAgain == 1) {
					wellbeing = 0;
					hunger = 3;
					PlayGame.main(null);
				} else {
					System.exit(0);
				}
				console.close();
			}
		}
	}
}
