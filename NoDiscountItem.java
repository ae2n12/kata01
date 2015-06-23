
public class NoDiscountItem extends Item {

	@Override
	public void applyRule() {
		setFinalPrice(getPrice());		
	}

}
