import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPet dragon = new VirtualPet();
		dragon.boredLevel = 0;
		dragon.hungerLevel = 0;
		dragon.tiredLevel = 0;
		
		System.out.println(dragon.dragonPicture);
		
		System.out.println("Hello brave soul you have just adopted a baby Dragon!");
		System.out.println("What would you like to name your new baby Dragon?");
		String dragonName = input.nextLine();
		dragon.tick();
		
		System.out.println("Here are " + dragonName + "'s current need levels.");
		System.out.println("*Tip* Do not let ANY of " + dragonName + "'s need levels go over 50 after your turn or you WILL lose this rare pet.");
		
		while(dragon.dragonLives()) {
			dragon.tick();
			
		System.out.println(dragonName + " hunger level: " + dragon.hungerLevel);
		System.out.println(dragonName + " tired level: " + dragon.tiredLevel);
		System.out.println(dragonName + " bordom level: " + dragon.boredLevel);
		
		System.out.println("Choose a comand by it's number to interact with " + dragonName + ".");
		System.out.println("1. Feed " + dragonName);
		System.out.println("2. Comand " + dragonName + " to Sleep");
		System.out.println("3. Play with " + dragonName);
		
		int comandDragon = input.nextInt();
		
			
		if(comandDragon == 1) {
			dragon.comandFeed();
			System.out.println("You fed " + dragonName + "!");
			System.out.println(dragonName + " should have finished eating; let's check on " + dragonName + ".");
		}if(comandDragon == 2) {
			dragon.comandSleep();
			System.out.println("You comanded " + dragonName + " to sleep.");
			System.out.println(dragonName + " should have woken up from his nap; let's check on " + dragonName + ".");
		}if(comandDragon == 3) {
			dragon.comandPlay();
			System.out.println("You played with " + dragonName + "!");
			System.out.println("Some time has passed since we played; let's check on " + dragonName + ".");
		}else {
			dragon.dragonLives();
		}
		

		}if(dragon.dragonLives() == false) {
			System.out.println("You have killed one of the last Dragons in the world with your carelessness!");
			System.out.println("You have lost more than this game.");
		}
	}

}
// VirtualPetApp class
// + - Create a `main` method that…
// + - [ ] implements a *game loop*.
// + - [ ] asks for user input.
// + - [ ] writes output to the console.