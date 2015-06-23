package Kata01;

public class NoDiscountItem extends Item {

	/**
	 *  Items that have not discount.
	 */
	
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
