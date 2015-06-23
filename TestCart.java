import static org.junit.Assert.*;

import org.junit.Test;


public class TestCart {

	@SuppressWarnings("deprecation")
	@Test
	public void testThreeForTwo_ThreeItems() {
		Item[] items = new Item[3]; 
		int i=0;
		Drinks f1 = new Drinks(0.70);
		items[i++] = f1;	
		Drinks f2 = new Drinks(0.70);
		items[i++] = f2;	
		Drinks f3 = new Drinks(0.70);
		items[i++] = f3;	
		
		Cart cart = new Cart();
		
		double total = cart.checkout(items, 3);
		
		assertEquals(total, 1.40);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testThreeForTwo_TwoItems() {
		Item[] items = new Item[2]; 
		int i=0;
		Drinks f1 = new Drinks(0.70);
		items[i++] = f1;	
		Drinks f2 = new Drinks(0.70);
		items[i++] = f2;	
		
		Cart cart = new Cart();
		
		double total = cart.checkout(items, 2);
		
		assertEquals(total, 1.4);
	}

}
