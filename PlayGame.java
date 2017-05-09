package project;

import java.util.Scanner;

public class PlayGame {
	public static void main(String[] args){	
		Welcome();
		Scene.Morning();
		Scene.CS112();
		Scene.Lunch();
		Scene.Study();  
		Scene.Section();
			TimeShift();
		Scene.Extracurricular();
		Scene.Buttery(); 
		Scene.Nighttime();
		Scene.goodNight();
			
	}
	
	public static void Welcome(){
		System.out.println("Welcome to \"A Day in the Life of a Yalie\"");
		System.out.println("You start the game with 0 Wellbeing points, and your goal is to accumulate as many as possible. \nA series of decisions impacts whether your Wellbeing point total increases or decreases. \nBeware, if your Wellbeing total ever drops below -3 its game over.\n");
		System.out.println("You also begin the game with a hunger level of 3. \nAnother goal of yours is to have it that your hunger level reaches 0 by the end of the game. \nIf you do not reach zero, in the end your Wellbeing will be deducted by 2 for every hunger point above zero.");		 
		System.out.println("Good Luck and Have Fun!");
		System.out.println( "\n\n");
	}
	
	public static void TimeShift(){
		System.out.println("Do you want to do Dinner before a procrastination session(1), or the procrastination session first(2)?");
		Scanner console = new Scanner(System.in);
			int TimeShiftAns = console.nextInt();
			if  (TimeShiftAns == 1){
				
				Scene.Dinner();
				Scene.Procrastinate();	
			}
			else{		
				Scene.Procrastinate();
				Scene.Dinner();
			}	
	}
}
