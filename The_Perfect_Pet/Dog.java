
public class Dog extends Pet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3960348533058245354L;
	private Attribute happiness;
	
	
	public Dog(String name, String color) {
		super(name, color);
	// TODO Auto-generated constructor stub
		this.happiness = new Happiness();
	}

	@Override
	public void feed() {
		this.hunger.increaseValue();
		this.happiness.increaseValue();
		this.energyLevel.decreaseValue();
	}
	
	public void run() {
		this.happiness.increaseValue();
		this.energyLevel.decreaseValue();
	}

	@Override
	public void sleep() {
		((EnergyLevel) this.energyLevel).maxEnergyLevel();
	}

	@Override
	public String getPetType() {
		// TODO Auto-generated method stub
		return "Dog";
	}

	public Attribute getHappiness() {
		return happiness;
	}

}
