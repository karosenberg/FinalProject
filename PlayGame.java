

import java.util.Scanner;

public class PlayGame {
	public static boolean DinnerSecond = false;
	
	public static void main(String[] args){
		
		Welcome();
		Scene.Morning();
		Scene.CS112();
		Scene.Lunch();
		Scene.Study();  
		Scene.Section();
			TimeShift();
		
	
	}
	
	public static void Welcome(){
		
		System.out.println("Welcome to the Game of Life with J-Lo Suave");
			
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
			console.close();	
	}
}
