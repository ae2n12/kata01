package Kata01;

public abstract class Item {

	private double price; //The initial price of the item
	private double finalPrice; //The price after discount
	
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
	
	//The following methods are used to transform price to final price based on the discounts
	//available for each item.
	public abstract double applyRule(); 

	public abstract double applyDiscountRule() ;
	
	
	
	
}
