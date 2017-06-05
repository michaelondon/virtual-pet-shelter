package virtualps;

public class VirtualPet {
	// Pets name and how he is doing (constructor)
	public String name;
	public String description;
	public int hungry;
	public int thirst;
	public int boredom;
	public int messyCage;

public VirtualPet(String name, String description, int hungry, int thirst, int boredom, int messyCage) {
	
	// constructor for pet name & needs levels
	this.name=name;
	this.description = description;
	this.hungry=hungry;
	this.thirst=thirst;
	this.boredom=boredom;
	this.messyCage = messyCage;
	}

public VirtualPet(String name, String description) { // constructor for pet name & description
	this.name = name;
	this.description = description;
}
	
	// Users input action
	void feed() {
		hungry = hungry + 20;
		thirst = thirst + 10;
		boredom = boredom - 20;
		System.out.println("Great you fed my pet, but it's still thirsty and wants to play");
	}
	

	void water() {
		hungry = hungry + 20;
		thirst = thirst + 50;
		boredom = boredom - 10;
		System.out.println("My pet really enjoyed the water, but she's still wants to play.");
	}

	void played() {
		hungry = hungry - 10;
		thirst = thirst - 15;
		boredom = boredom + 20;
		System.out.println("I hope my pet didn't try you out, I'm sure she's thirsty now.");

	}

	// Passage of time
	void tick() {
		hungry = hungry + 30;
		thirst = thirst + 50;
		boredom = boredom - 20;

	}

	@Override
	public String toString() {
		return ("" + name + " " + description);
	
}
}
