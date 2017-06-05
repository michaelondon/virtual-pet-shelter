package virtualps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualShelterPetApp {
	public static void main(String[] args) {
		VirtualPetShelter shelter=new VirtualPetShelter();
		Scanner input = new Scanner(System.in);
		
		//		Welcome message to user
		writeLine("Thank you for volunteering at All 41 Virtual Pet Shelter");
		
		// 		Print each Pet and their current status
		VirtualPet petMowgli = new VirtualPet("Mowgli", "likes exploring", 30, 50, 80);
		shelter.intakePet(petMowgli);
		
		VirtualPet petBaloo = new VirtualPet("Baloo"," loves honey", 20, 40, 40);
		shelter.intakePet(petBaloo);
		
		VirtualPet petKaa = new VirtualPet("Kaa"," is a hugger", 30, 40, 40);
		shelter.intakePet(petKaa);
		
		VirtualPet petBagheera = new VirtualPet("Bagheera"," is wise", 50, 40, 70);
		shelter.intakePet(petBagheera);
		
		
			// Start Status of my pet
			System.out.println("Currently my pet's level is at " + VirtualPetShelter.hungry);
			System.out.println("Currently my pet's thirst level is at " + VirtualPetShelter.thirst);
			System.out.println("Currently my pet's boredom level is at " + VirtualPetShelter.boredom);

			// What do you want to do
			System.out.println("How would you like to interact with my pet's?");
			System.out.println("Enter 1 To feed my pet's");
			System.out.println("Enter 2 To water my pet's");
			System.out.println("Enter 3 To play with my pet's");
			String interact = input.nextLine();
			System.out.println("play");
		
			writeLine("To interact with our pets, to adopt, or to surrender your own pet, come on in!");
			writeLine("\nMeet our pets!");
			writeLine("-----");
			System.out.println(petMowgli);
			System.out.println(petBaloo);
			System.out.println(petKaa);
			System.out.println(petBagheera);
			writeLine("-----");
			
			do {
				for (VirtualPet currentPet : shelter.pet()) 
					writeLine(currentPet.name + "\t|  " + currentPet.hungry + "\t|  " + currentPet.thirst + "\t|  "
							+ currentPet.boredom);
			}
			
			writeLine("\nHow do you want to interact with the mini hippos?\n1 Meet the pets\n2 Feed hippos\n3 Give water\n4 Play with\n5 Clean cages\n6 ADOPT!\n7 Surrender a mini hippo to the shelter\nType the number that corresponds to the interaction.");
			String interact1 = input.next();
			input.nextLine();
			
			switch (interact1) {
		
			case "1":
			writeLine("Meet our pets!");
			writeLine("-----");
			for (VirtualPet currentPet : shelter.pet()) {
				writeLine(currentPet.name + currentPet.description);
			}
			writeLine("-----");
			writeLine("\nHow do you want to interact with the mini hippos? Type the number that corresponds to the interaction.");
			String interact2 = input.next();
			input.nextLine();
			
			case "2":
			writeLine("Choose a meal to feed the mini hippos:\n1 Fruit\n2 Hay, alfalfa & lettuce\n3 Pumpkins & melon");
			String feed1 = input.next();
			if (feed1.equals("1")) {
				shelter.feed();
				writeLine("The hippos LOVE chopped fruits!");
			} else if (feed1.equals("2")) {
				shelter.feed();
				writeLine("The hippos will be munching on their meal for a while!");
			} else if (feed1.equals("3")) {
				shelter.feed();
				writeLine("Yummy!! Hippos love pumpkin & melon!");
			}
			break;
			case "3":
				shelter.water();
				writeLine("You fill the trough with water and the hippos happily slurp it up.");
				break;
			case "4":
				writeLine("You want to adopt a mini hippo!! How noble of you :D");
				writeLine("\nWhich hippo would you like to adopt?");
				writeLine("-----");
				System.out.println(petMowgli);
				System.out.println(petBaloo);
				System.out.println(petKaa);
				System.out.println(petBagheera);
				writeLine("-----");
				
				String adoptPet = input.next();
				VirtualPet petToAdopt = shelter.getPet(adoptPet);
				shelter.adoptPet(petToAdopt);

				if (adoptPet.equals("Mowgli")) {
					writeLine("Mowgli ");
				} else if (adoptPet.equals("Baloo")) {
					writeLine("Baloo");
				} else if (adoptPet.equals("Kaa")) {
					writeLine("Kaa");
				} else {
					writeLine("You chose Bagheera.");
				}
				break;
			case "5":
				writeLine("You have a mini hippo to surrender to the shelter? Type \'yes\' or \'no\'");
				String surrenderHippo = input.next();

				if (surrenderHippo.equals("yes")) {
					writeLine("We'd be more than happy to accept your pet! Please tell us your pets name:");
					String newPetName = input.next();
					writeLine(newPetName
							+ " is a lovely name for a mini hippo! Can you give us a description for our website?");
					String newPetDescription = input.next();
					writeLine("Got it! " + newPetName + " " + newPetDescription
							+ " is exactly how we will update the profile on our website!\nWould you like to interact with the hippos here at the shelter?\nType \'status\' or \'leave\'");
					String stayOrLeave = input.next();
				} else {
					writeLine("Would you like to interact with the hipps here at the shelter?\nType \'status\' or \'leave\'");
				String leaveGame = if;
				}
				break;
			default:
				writeLine("Have a great day! Stop by again soon.");
				System.exit(0);
				break;
				
			}
			shelter.tick();

		}while(6>5); // (myPets.hungerLevel <= 5) if one pet dies, the
					//  shelter gets shut down
	input.close();

	}

	private static String input(String string) {
		return null;
	}

	public static void writeLine(String message) {
	} {
		System.out.println(message);
	}
}
}