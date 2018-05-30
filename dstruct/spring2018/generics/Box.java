package generics;

public class Box<THING> {
	private THING data;
	
	
	public THING getData() {
		return this.data;
	}
	public void setData(THING data) {
		this.data = data;
	}
	
}
