import java.util.ArrayList;

public class Sounds extends Attribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3589311292043680544L;

	public Sounds() {
		super();
		ArrayList<String> sounds = new ArrayList<String>();
		sounds.add("Monkey needs a hug");
		sounds.add("Monkey is okay");
		sounds.add("Monkey is happy");
		sounds.add("Monkey Loves you");
		
		this.setAttributes(sounds);
		
	}

}
