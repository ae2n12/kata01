
public class ThreeForPound extends Item {
	
	public void applyRule() {
		//Only triggered the third time a ThreeForPound item is scanned
		setFinalPrice(0.20);		
	}

}
