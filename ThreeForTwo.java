package Kata01;
public class ThreeForTwo extends Item {

	public double applyRule() {
		setFinalPrice(getPrice());	
		return getFinalPrice();	
	}

	@Override
	public double applyDiscountRule() {
		//Only triggered the 3rd time a ThreeForTwo item is scanned
		setFinalPrice(0.0);	
		return getFinalPrice();
	}
	

}
