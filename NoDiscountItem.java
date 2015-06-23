package Kata01;

public class NoDiscountItem extends Item {

	@Override
	public double applyRule() {
		setFinalPrice(getPrice());	
		return getFinalPrice();	
	}

	@Override
	public double applyDiscountRule() {
		return getFinalPrice();	
	}

}
