
public class Fish extends Pet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1617265048638077530L;
	private Attribute hunger;
	private Attribute EnergyLevel;

	public Fish(String name, String color) {
		super(name, color);
		this.hunger = new Hunger();
		this.energyLevel =new EnergyLevel();
	}
	
	public void feed() {
	this.hunger.increaseValue();
	}
	
	public void energyLevel() {
		this.EnergyLevel.increaseValue();
	}

	@Override
	public void sleep() {
		// Nothing happens, fish don't sleep
		
	}

	@Override
	public String getPetType() {
		// TODO Auto-generated method stub
		return "Fish";
	}
	
	
	
}
