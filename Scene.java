import java.awt.*;

import java.util.Scanner;
public class Scene {
	public static boolean HasStudied = false;
public static void Morning(){
	Scanner console = new Scanner(System.in);
	
	System.out.println("Good Morning! Do you want to stay in bed or head off to breakfast? (1 or 2)");
	int AnswerMorning = console.nextInt();
	if (AnswerMorning == 1){
		System.out.println("You get that much needed snooze button beauty rest and you feel better about the day ahead of you");
	Counter.WellbeingUp();
	}	
	else if (AnswerMorning == 2){
		System.out.println("You eat a wonderful breakfast, but it comes at a cost of being groggy and cranky because you missed that important snooze button beauty rest");
		Counter.WellbeingDown();
		Counter.HungerDown();
	}
	else {
		System.out.println("That was an invalid input");
	}		
}

public static void CS112(){

	Scanner console = new Scanner(System.in);
	double CorrectAnswer = Math.round((Math.random() * 4));
	System.out.println("After a nice start to your day you trek over to Computer Science 112 with Professor Yang Yang.");
	System.out.println("You get called on in class! input a number from 0 to 4 to see if you got the question right.");
	int AnswerCS112 = console.nextInt();
	if (AnswerCS112 == CorrectAnswer){
		System.out.println("You're a hotshot coder and you got the answer right!");
		Counter.WellbeingUp();
	}
	else {
		System.out.println("You got the answer wrong and embaressed yourself in front of the whole lecture.");
		Counter.WellbeingDown();
	}
	
	System.out.println("As you leave class, and are going up the sketchy staircase, a shadowy voice offers you their code for the current pset, do you take it?");
	System.out.println("You think to yourself that there is a 50% chance you get ex-commed for cheating and a 50% chance you finish the PSET and relieve youself of stress awarding you 2 wellbeing points.");
	System.out.println("Cheat or No? (1/0)");
	
	int AnswerCheat = console.nextInt();
	if (AnswerCheat == 1){
		double FiftyFifty = Math.random();
		if (FiftyFifty >= .5){
			System.out.println("Congratulations you little rebel, you've cheated yourself, but more importantly the system.");
			Counter.Wellbeing2Up();
		}
		else{
			System.out.println("Yea... Not a good idea, you knew the risks and now you pay for it, enjoy Excom! game over.");
			 Counter.Excom();
		}
	}
	else {
	 System.out.println("You're a true star of integrity! You put that shady voice behind you and go about your day.");
	}
		
}

public static void Lunch(){
	System.out.println("After a wonderful and informative lecture by your favorite CS professor you head to your favorite lunch spot out of Commons(1), Durfees(2) and your personal residential college dining hall(3)");
	Scanner console = new Scanner(System.in);
	int LunchAnswer = console.nextInt();
	
	if (LunchAnswer == 1){
		System.out.println("You head to commons and go to town on the stir fry fried rice with a little touch of sriracha on top, there's nothing like it and it makes you very happy.");
		Counter.WellbeingUp();
		Counter.HungerDown();	
	}
	else if(LunchAnswer == 2){
		System.out.println("You head to Durfees spend your eight dollars efficiently and get some studying in for section later rather than getting caught in conversation in a big dining hall.");
		Counter.HungerDown();
		HasStudied = true;
		
	}
	else 
		System.out.println("You head to your personal residential college, but the food today is awful. You can either choose to eat and damage your wellbeing(1), or not eat and go hungry(2)");
		int ResColAnswer = console.nextInt();
			if (ResColAnswer == 1 ){
				Counter.HungerDown();
				Counter.WellbeingDown();
			}
			else {
				System.out.println("Not eating is a pretty bold move");
			}
			console.close();
	}
	
	

public void Study(){
	
	
}

public void Section(){
	
	
	
}


public void Dinner(){
	
	
	
}

public void Procrastinate(){
	
	
}

public void Extracurricular(){
	
	
}

public void Buttery(){
	
	
}

public void Nighttime(){
	
	
}

}
