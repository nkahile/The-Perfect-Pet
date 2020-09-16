
public class Monkey extends Pet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5574447260054034803L;
	private Attribute happiness;
	private Attribute sounds;
	
	public Monkey(String name, String color) {
		super(name, color);
		this.happiness = new Happiness();
		this.sounds = new Sounds();
	}

	@Override
	public void feed() {
			this.hunger.increaseValue();
			this.happiness.increaseValue();
			this.energyLevel.decreaseValue();
		}
				
	public void play() {
		this.happiness.increaseValue();
		this.energyLevel.decreaseValue();
	}
	
	public String giveBanana() {
		this.sounds.increaseValue();
		return this.sounds.getCurrentValue();
	}

	public void sleep() {
		this.happiness.increaseValue();
		this.energyLevel.increaseValue();
		this.sounds.increaseValue();
	}

	@Override
	public String getPetType() {
		// TODO Auto-generated method stub
		return "Monkey";
	}
	
}
