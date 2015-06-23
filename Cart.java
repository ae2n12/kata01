package Kata01;

public class Cart {

		
	public double checkout(Item[] items, int numOfItems){
		int counter3for2 = 0;
		int counter3forPound = 0;
		double total = 0;
		
		for (int i=0; i<numOfItems; i++){
			if (items[i] instanceof ThreeForTwo){
				counter3for2++;				
				if (counter3for2 == 3){	
					total += items[i].applyDiscountRule();	
					counter3for2 = 0;
				}
				else{					
					total += items[i].applyRule();	
				}
			}
			if (items[i] instanceof ThreeForPound){
				counter3forPound++;
				if (counter3forPound == 3){
					total += items[i].applyDiscountRule();
					counter3forPound = 0;
				
				}
				else{
					total += items[i].applyRule();
					
				}
					
			}
		  else if (items[i] instanceof NoDiscountItem || items[i] instanceof WeightedGoods ){
				total += items[i].applyRule();
				
			}
		}
		
		return total;
	}

}
