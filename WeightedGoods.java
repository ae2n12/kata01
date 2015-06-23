package Kata01;
public class WeightedGoods extends Item {

	private double pricePerKilo;
	private double weight;
	
	public void setPrice(){
		setPrice(pricePerKilo * weight);
	}

	public double getPricePerKilo() {
		return pricePerKilo;
	}

	public void setPricePerKilo(double d) {
		this.pricePerKilo = d;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double applyRule() {
		setPrice();
		setFinalPrice(getPrice());	
		return getFinalPrice();	
	}

	@Override
	public double applyDiscountRule() {
		//No discount applies
		return getFinalPrice();		
	}
	
}
