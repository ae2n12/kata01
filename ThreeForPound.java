package Kata01;
public class ThreeForPound extends Item {
	
	public double applyRule() {		
		setFinalPrice(getPrice());	
		return getFinalPrice();	
	}

	@Override
	public double applyDiscountRule() {
		//Only triggered the third time a ThreeForPound item is scanned
		setFinalPrice(1.00 - (getPrice() * 2));	
		return getFinalPrice();
	}

}
