		}
		else{
			System.out.println("Going to dinner so early is a bold move, you see your best friends there but you know you will be hungry later, \nyou leave happy but your stomach is dissatisfied");
			Counter.WellbeingUp();	
		}
	}

	public static void Procrastinate() {
		System.out.println();
		DinnerSecond = 0;
		System.out.println("Procrastination is essential for being a productive member of society: \nNetflix(1), Yale Memes for Special Snowflake Teens(2), A run to East Rock(3). Pick your Poison");
		Scanner console = new Scanner(System.in);
		int ProcrastinateAns = console.nextInt();
			if (ProcrastinateAns == 1){
				System.out.println("You fire up Netflix but you are completly underwhelmed by the two episodes you watched and feel like you wasted time");
				Counter.WellbeingDown();
			}
			else if (ProcrastinateAns == 2){
				System.out.println("You troll around for a couple hours and you finally stumble upon the meme of a lifetime");
				Counter.WellbeingUp();
				// cue Std.Draw Dope ass meme??????
			}
			else {
				System.out.println("You take a run and feel that nice runners afterglow and feel confident about your health, \nbut it makes you even more hungry than you usually are");
				Counter.Wellbeing2Up();
				Counter.HungerUp();	
			}	
	}
	public static void Extracurricular() {
		System.out.println();
		public static void Extracurricular() {
			Scanner console = new Scanner(System.in);
			System.out.println("You check your phone. It's almost time for your extra-curricular activity. First things first, are you the editor of the YDN? Yes(1) No way(2).");
			int dailyNews = console.nextInt();
			if (dailyNews == 1){
				System.out.println("...");
				System.out.println("Why?");
				System.out.println("You spend all day at the office, crawling through first, second, and fifteenth drafts of\n whatever your writers put in front of you before scrapping everything and picking whatever will get you on Overheard.\n You fall asleep atop your coffee at 3am, regretting your life choices.");
				goodnight();
			}
			else if (dailyNews == 2){
			System.out.println("Very well, unimportant person, then what do you do in your free time? A capella(1) Dwight Hall(2) IntraMurals(3)");
			int activity = console.nextInt();
			if (activity == 1){
				aCapella();
				secondExtra(1);
				}
				else if (activity == 2){
				dwight();
				secondExtra(2);
				}
				else if (activity == 3){
				intra();
				secondExtra(3);
				}
				else{
				System.out.println("That was an invalid input");  
				Extracurricular();
				}
			}
		}
		public static void aCapella(){

				int throat = Math.round(Math.random());
				System.out.println("You join your bestest buddies and sing your heart out during rehearsals!"
					if (throat == 0){
						System.out.print("You hit the perfect notes and walk away fine!");
					}
					else{
						System.out.print("You see a cat outside the window and scream in your singing voice.\n Now you have a sore throat!");
						Counter.WellbeingDown();
					}
		}
		public static void dwight(){
			System.out.println("As a member of one of the many honorable societies under Dwight Hall, you are helping make the world a better place.");
			Counter.WellbeingUp();
		}
		public static void intra(){
			System.out.println("Of course you're going to go play an IM, and help your college win everlasting glory (for one semester.) You reach the site of the game and your friend asks you to join them. What do you do? PLAY(1) Cheer from the sidelines(2).");
					
			int play = console,nextInt();
							   if (play == 1){
								   System.out.println("You don the colors of your team and charge onto the field, roaring as loud as you can. You give the game your all, but end up messing everything up and making your team lose! You're a CS student, what did you expect?");
								   Counter.WellbeingDown();
							   }
							   else if (play == 2){
								   System.out.println("You join your friends on the sidelines, where you belong, and cheer your team to victory. The players swear it was your loud cries that pushed them all the way.");
								   Counter.WellbeingUp();
							   }
							   else{
								 System.out.println("That was an invalid input");  
								 intra();
							   }
		}
		public static void secondExtra(int beenDone){
			Scanner console = new Scanner(System.in);
			if (beenDone == 1){
				System.out.println("You say goodbye to your posse, and check your phone. Like every yalie, you have another extra curricular planned for the night. What will it be? DwightHall(1) or IMs(2)?");
				int choice = console.nextInt();
					if (choice == 1){
						dwight();
					}
					else if (choice == 2){
						intra();
					}
					else{
						System.out.println("That was an invalid input");  
						secondExtra(1);
					}
			}
			else if (beenDone == 2){
				System.out.println("Enough good deeds for one day. Like every yalie, you have another extra curricular planned for the night. What will it be? a Capella(1) or IMs(2)?");
				int choice = console.nextInt();
					if (choice == 1){
						aCapella();
					}
					else if (choice == 2){
						intra();
					}
					else{
						System.out.println("That was an invalid input");  
						secondExtra(2);
					}
			}
			else if (beenDone == 3){
				System.out.println("Tired from all that physical exertion, you leave your friends and check your phone.\n You still have time for one more activity.\n What will it be? a Capella(1) or DwightHall(2)");
				int choice = console.nextInt();
					if (choice == 1){
						aCapella();
					}
					else if (choice == 2){
						dwight();
					}
					else{
						System.out.println("That was an invalid input");  
						secondExtra(3);
					}
			}
		

	}

	public static void Buttery() {
		System.out.println();
		System.out.println("Is it a buttery kind of night?(1/0)");
		Scanner console = new Scanner(System.in);
		int ButteryAns = console.nextInt();
			if(ButteryAns == 1){
				System.out.println("You go to the buttery for a late night snack \nand you have a ball playing billiards with your best buds");
				Counter.WellbeingUp();
				Counter.HungerDown();
			}
			else {
				System.out.println("You end up just meandering around accumulating stress about your looming deadlines");
				Counter.WellbeingDown();
				System.out.println("You got this!");
			}
				
	}


	public static void Nighttime() {
		System.out.println("The night air is chilly yet alive with the warmth of bustling bodies and alcohol.\n But you know you shouldn't go out tonight. Your unfinished pset fills you with guilt. \nDo you go to office hours(1) or bite the bullet and go to WOADS(2)?");
		Scanner console = new Scanner(System.in);
		int ProcrastinateAns = console.nextInt();
			if (ProcrastinateAns == 1){
				System.out.println("You drag yourself through the cold to a tiny room full of panicking students and jovial TAs.\n Of course, there are a few students who are completely chill because they finished the pset the hour it was posted, \nthey only came here to laugh at plebs like you.\nOne of them points out that pizza was promised at office hours. \nYou could second his request for nourishment(1) or focus on your pset(2). Note that the pizza will be Papa Johns.");
				int pizzaChoice = console.nextInt();
				if (pizzaChoice == 1){
					System.out.println("You wail frantically for pizza, praying to Steve Jobs' ghost for a large Papa Johns.\n You receive it, and take a big gooey bite while your peers gorge themselves on the garlic sauce.\n However, the promise of the great John distracted you from work.\n");
							   Counter.HungerDown();
							   Counter.WellbeingDown();
				}
				else {
					System.out.println("You bite your lips, resisting the allure of pizza, and let the overly enthusiastic \npizza-wanting student drown under the combined pressure of the death glares your peers heap on him. \nThat puts you in a happy mood and the gods of computing take pity on you at last,\nfixing your code inexplicably!");
						Counter.WellbeingUp();
				}
			}
			else {
				System.out.println("You bite the bullet, throwing caution to the wind. Speaking of wind, it's cold out.\nDid you bring your jacket? Yes (1) No (2).");
				int jacket = console.nextInt();
				if (jacket == 1){
					System.out.println("Of course you did, doing otherwise would be irresponsible! \nYou join the seething mass of bodies inside Toads, and get puked out at 1am, sans jacket.");
					Counter.WellbeingDown();
				}
				else {
					System.out.println("Well, whatever. Hopefully the dancing will warm you up! \nYou jump into the swirling whirpool of dancers and leave the club at 1.");
					Counter.WellbeingUp();
				}
			}	
	}
	public static void goodNight() {
		System.out.println();
		System.out.println("You walk back, dazed and confused, to your room. You collapse on your bed,\nhaving made it through a completely ordinary day. Good Night!");
		if (Counter.getHunger() > 0){
			System.out.println("You wake up as your tummy rumbles, cursing you for not filling it \nduring the day. Thus, you have lost the most important battle and will have a terrible night.");
			Counter.theHungerEffect();
			Counter.terminationClause();
		}
		wellbeingDeath();
		Counter.showWellbeing();	
	}
							   
	public static void wellbeingDeath(){
		if (Counter.getWellbeing() <= -3){
		System.out.println("Oh no! The weight of all your hopes, dreams, and responsibilities comes\n crashing down on you! You curl up into the fetal position and begin bawling your eyes out.");	
		}
	}
}
}
