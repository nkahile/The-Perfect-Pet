import java.util.ArrayList;

public class Hunger extends Attribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6258844229474355140L;

	public Hunger() {
		super();
		// TODO Auto-generated constructor stub
		ArrayList<String> hungerLevels= new ArrayList<String>();
		hungerLevels.add("Starving");
		hungerLevels.add("kinda hungry");
		hungerLevels.add("Full");
		hungerLevels.add("Bloated");
		hungerLevels.add("Stuffed");
		
		this.setAttributes(hungerLevels);
		
	}

}
