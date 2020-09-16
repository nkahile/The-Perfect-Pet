import java.util.ArrayList;

public class Happiness extends Attribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6078176451779789307L;

	public Happiness() {
		super();
		
		ArrayList<String> happineesLevels= new ArrayList<String>();
		happineesLevels.add("sad");
		happineesLevels.add("kinda sad");
		happineesLevels.add("neturl");
		happineesLevels.add("kinda happy");
		happineesLevels.add("Happy");

		this.setAttributes(happineesLevels);


	}
	
}
