import java.util.ArrayList;
import java.util.Scanner;

public class User implements PlayWithPets {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8567665266605819744L;
	private String name;
	private String age;
	private ArrayList<Pet> pets;
	private Scanner scanner;

	public User() {
		this.name = "user1";
		this.age = "22";
		this.scanner = new Scanner(System.in);
		this.pets = PlayWithPets.readSavedPets("./" + this.name + "-pets-" + this.age + ".iml");
	}

	@Override
	public void putPetsToSleep() {
		// TODO Auto-generated method stub
		for (int i = 0; i < this.pets.size(); i++) {
			this.pets.get(i).sleep();
			System.out.println("After sleeping  the energy level for "+ this.pets.get(i).name+" the "+
			this.pets.get(i).getPetType()+" is " + this.pets.get(i).getEnergyLevel());

		}
	}

	@Override
	public void feedPets() {
		for (int i = 0; i < this.pets.size(); i++) {
			this.pets.get(i).feed();
		}
	}

	@Override
	public void getHungerLevel() {
		for (int i = 0; i < this.pets.size(); i++) {
			Pet pet = this.pets.get(i);
			System.out.println("For " + pet.name + " their hunger level is at " + pet.getHunger().getCurrentValue());

		}
	}

	@Override
	public void getAllPets() {
		for (int i = 0; i < this.pets.size(); i++) {
			Pet pet = this.pets.get(i);
			System.out.println("Pet # " + (i + 1) + ": " + pet.name + " is a " + pet.getPetType() + " who is " + pet.age
					+ " years old");

		}
	}

	public void start() {
		System.out.println("Welcome back to the wonder full world of pets!");
		System.out.println("Please enter the number for one of the following options: ");
		while (true) {
			System.out.println("Add new pet (1)");
			System.out.println("Feed Pets (2)");
			System.out.println("Play with the monkey (3)");
			System.out.println("Run with Dog(4)");
			System.out.println("Get Pets hunger level (5)");
			System.out.println("Get All Pets (6)");
			System.out.println("Grow all pets by 1 year (7)");
			System.out.println("Put all pets to sleep (8)");
			System.out.println("Exit (9)");

			int option = this.scanner.nextInt();
			switch (option) {
			case 1:
				this.createPetsWithInput();
				break;
			case 2:
				this.feedPets();
				break;
			case 3:
				this.monkeyMakeNoise();
				break;
			case 4:
				this.walkDog();
				break;
			case 5:
				this.getHungerLevel();
				break;
			case 6:
				this.getAllPets();
				break;
			case 7:
				this.growAllPets();
				break;
			case 8:
				this.putPetsToSleep();
				break;
			case 9:
				PlayWithPets.savePets(this.pets, "./" + this.name + "-pets-" + this.age + ".iml");
				System.exit(0);
			default:
				System.out.println("Please select a valid option");
			}
		}
	}

	private void createPetsWithInput() {
		this.scanner.nextLine();
		System.out.println("What kind of pet would you like? (Dog,monkey,cat, fish)");
		String petType = this.scanner.nextLine().toLowerCase();

		System.out.println("What would you like to name it?");
		String petName = this.scanner.nextLine().toLowerCase();

		System.out.println("What color is it?");
		String petColor = this.scanner.nextLine().toLowerCase();

		this.createNewPets(petName, petColor, petType);
	}

	@Override
	public void createNewPets(String name, String color, String type) {
		switch (type.toLowerCase()) {
		case "monkey":
			this.pets.add(new Monkey(name, color));
			System.out.println("Added a new monkey");
			break;
		case "dog":
			this.pets.add(new Dog(name, color));
			System.out.println("Added a new dog");
			break;
		case "cat":
			this.pets.add(new Cat(name, color));
			break;
		case "fish":
			this.pets.add(new Fish(name, color));
			break;
		default:
			System.out.println("Currently it's illegal to buy that pet");
			break;
		}
	}

	@Override
	public void monkeyMakeNoise() {
		this.scanner.nextLine();
		System.out.println("Name the monkey that you would like to have make noise");
		String monkeyName = this.scanner.nextLine().toLowerCase();

		for (int i = 0; i < this.pets.size(); i++) {
			if (this.pets.get(i).getPetType().toLowerCase().equals("monkey")
					&& this.pets.get(i).getName().toLowerCase().equals(monkeyName.toLowerCase())) {
				System.out.println(this.pets.get(i).name+" the monkey "+ ((Monkey) this.pets.get(i)).giveBanana());
				return;
			}
		}

		System.out.println("No monkey like that exists");
	}

	@Override
	public void walkDog() {
		this.scanner.nextLine();

		System.out.println("Which dog would you like to walk? (if you want, you can do all");
		String dogName = this.scanner.nextLine().toLowerCase();

		if (dogName.equals("all")) {
			int count = 0;
			for (int i = 0; i < this.pets.size(); i++) {
				Pet pet = this.pets.get(i);
				if (pet.getPetType().toLowerCase().equals("dog")) {
					pet.play();
					System.out.println(pet.getName() + "the dog's level of happiness is "
							+ ((Dog) pet).getHappiness().getCurrentValue());
					count++;
				}
			}
			if (count == 0) {
				System.out.println("You don't have any dogs to walk");
			}
		}

		for (int i = 0; i < this.pets.size(); i++) {
			Pet pet = this.pets.get(i);
			if (pet.getPetType().toLowerCase().equals("dog")
					&& pet.getPetType().toLowerCase().equals(dogName.toLowerCase())) {

				System.out.println(pet.getName() + "the dog's level of happiness is "
						+ ((Dog) pet).getHappiness().getCurrentValue());

				return;
			}
		}

		System.out.println("No Dogs with that name exist");
	}

	@Override
	public void growAllPets() {
		for (int i = 0; i < this.pets.size(); i++) {
			Pet pet = this.pets.get(i);
			pet.increasePetAge();
			System.out.println(pet.name + " the " + pet.getPetType() + " grew by one year");
		}
	}

}
