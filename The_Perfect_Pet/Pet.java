import java.io.Serializable;

public abstract class Pet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2791826202480472547L;
	protected int age;
	protected String name;
	protected String color;
	protected Attribute hunger;
	protected Attribute energyLevel;
	
	
	public Pet(String name, String color) {
		this.age=0;
		this.name=name;
		this.color=color;
		this.hunger = new Hunger();
		this.energyLevel = new EnergyLevel();
	}
	
	

	public void increasePetAge() {
		this.age++;
	}
		
	abstract public void feed();
	
	abstract public void sleep();

	abstract public String getPetType();

	public void play() {
		// TODO Auto-generated method stub
		this.energyLevel.decreaseValue();
	}
	
	public String getEnergyLevel() {
		return this.energyLevel.getCurrentValue();
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Attribute getHunger() {
		return hunger;
	}


	public void setHunger(Attribute hunger) {
		this.hunger = hunger;
	}
	
}
