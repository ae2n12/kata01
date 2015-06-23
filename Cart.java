
public class Cart {

	public static void main(String[] args) {

		Item[] items = new Item[100];
		int i = 0;
		
		Apple a = new Apple(0.40);
		items[i++] = a;
		Apple a1 = new Apple(0.40);
		items[i++] = a1;
		Apple a2 = new Apple(0.40);
		items[i++] = a2;
		Apple a3 = new Apple(0.40);
		items[i++] = a3;
		Apple a4 = new Apple(0.40);
		items[i++] = a4;
		Bread b = new Bread(1.25);
		items[i++] = b;
		Cheese c = new Cheese (19.9, 1.0);
		items[i++] = c;
		Drinks f1 = new Drinks(0.70);
		items[i++] = f1;	
		Drinks f2 = new Drinks(0.70);
		items[i++] = f2;	
		Drinks f3 = new Drinks(0.70);
		items[i++] = f3;	
		
		
		items = (new Cart()).setFinalPriceForItemsInCart(items, i);
		
		System.out.println("Price " + new Cart().checkout(items, i));
	}
	
	public double checkout(Item[] items, int numOfItems){
		double total = 0;
		
		items = setFinalPriceForItemsInCart(items, numOfItems);
		
		for (int i=0; i<numOfItems; i++){
			total += items[i].getFinalPrice();
			System.out.println(total);
		}
		
		return total;		
	}
	
	public Item[] setFinalPriceForItemsInCart(Item[] items, int numOfItems){
		int counter3for2 = 0;
		int counter3forPound = 0;
		
		for (int i=0; i<numOfItems; i++){
			if (items[i] instanceof ThreeForTwo){
				counter3for2++;				
				if (counter3for2 < 3){	
					items[i].applyRule();	
				}
				else{
					counter3for2 = 0;
					items[i].setFinalPrice(0.0);
					//System.out.println(items[i].getFinalPrice());
				}
			}
			if (items[i] instanceof ThreeForPound){
				counter3forPound++;
				if (counter3forPound == 3){
					items[i].applyRule();
					counter3forPound = 0;
				}
			}
			else{
				items[i].applyRule();
			}
		}
		
		return items;
	}

}
