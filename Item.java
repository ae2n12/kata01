package Kata01;

public abstract class Item {

	private double price;
	private double finalPrice;
	
	public double getFinalPrice() {
		return finalPrice;
	}
	
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double d) {
		this.price = d;
	}
	
	public abstract double applyRule();

	public abstract double applyDiscountRule() ;
	
	
	
	
}
