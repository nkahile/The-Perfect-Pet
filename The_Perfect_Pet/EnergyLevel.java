import java.util.ArrayList;

public class EnergyLevel extends Attribute {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1934410316640638196L;

	public EnergyLevel() {
		super();
		// TODO Auto-generated constructor stub
		ArrayList<String> eneryLevel= new ArrayList<String>();
		eneryLevel.add("Tired");
		eneryLevel.add("kinda tired");
		eneryLevel.add("Half energy");
		eneryLevel.add("Good amount of enery");
		eneryLevel.add("Full of Energy");
		
		this.setAttributes(eneryLevel);
		
	}
	
	public void maxEnergyLevel() {
		this.setValueIndex(4);
	}
}
