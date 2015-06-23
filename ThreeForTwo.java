
public class ThreeForTwo extends Item {

	public void applyRule() {
		//Only triggered the 3rd time a ThreeForTwo item is scanned
		setFinalPrice(getPrice());		
	}
	

}
