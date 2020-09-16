public class Cat extends Pet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2350480547639016265L;
	private Attribute happiness;
	
	public Cat(String name, String color) {
		super(name, color);
		this.happiness = new Happiness();
	}
	
	public void feed() {
		this.hunger.increaseValue();
		this.happiness.increaseValue();
		this.energyLevel.increaseValue();
	}
	
	public void play() {
		this.happiness.increaseValue();
		this.energyLevel.decreaseValue();
		
	}
	
	public void sleep() {
		this.happiness.increaseValue();
		this.energyLevel.increaseValue();
	}

	@Override
	public String getPetType() {
		// TODO Auto-generated method stub
		return "Cat";
	}

}
