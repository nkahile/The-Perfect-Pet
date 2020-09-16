import java.io.Serializable;
import java.util.ArrayList;

public abstract class Attribute implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5275502683251383050L;
	private ArrayList<String> values;
	private int valueIndex;
	
	public Attribute() {
		this.values = new ArrayList<String>();
		this.valueIndex = 0;
	}
	
	public void setAttributes(ArrayList<String> vals) {
		this.values=vals;
	}
	
	public void increaseValue() {
		if(this.values.size()-1>this.valueIndex) {
			this.valueIndex++;
		}
	}
	public void decreaseValue() {
		if(this.valueIndex>0) {
			this.valueIndex--;
		}
	}
	
	public String getCurrentValue() {
		return this.values.get(this.valueIndex);
	}
	
	protected void setValueIndex(int i) {
		this.valueIndex=i;
	}
}
