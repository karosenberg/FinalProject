
import java.awt.*;

import java.util.Scanner;
public class Scene {
	
public static void Morning(){
	
	
	
	Scanner console = new Scanner(System.in);
	
	System.out.println("Good Morning! Do you want to stay in bed or head off to breakfast? (1/0)");
	int AnswerMorning = console.nextInt();
	if (AnswerMorning == 1){
	Counter.WellbeingUp();
	}
	
	else if (AnswerMorning == 0){
		Counter.WellbeingDown();
	}
	else 
		System.out.println("That was an invalid input");
		
	console.close();
}

public void CS112(){

	
	
}

public void Lunch(){
	
	
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
