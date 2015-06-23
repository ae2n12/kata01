package Kata01;
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
		
		assertEquals(total, 1.40, 0.0001);
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
		
		assertEquals(total, 1.4, 0.0001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testThreeForPound_ThreeItems() {
		Item[] items = new Item[3]; 
		int i=0;
		Apple f1 = new Apple(0.40);
		items[i++] = f1;	
		Apple f2 = new Apple(0.40);
		items[i++] = f2;	
		Apple f3 = new Apple(0.40);
		items[i++] = f3;	
		
		Cart cart = new Cart();
		
		double total = cart.checkout(items, 3);
		
		assertEquals(total, 1.0, 0.0001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testThreeForPound_TwoItems() {
		Item[] items = new Item[2]; 
		int i=0;
		Apple f1 = new Apple(0.40);
		items[i++] = f1;	
		Apple f2 = new Apple(0.40);
		items[i++] = f2;	
		
		Cart cart = new Cart();
		
		double total = cart.checkout(items, 2);
		
		assertEquals(total, 0.8, 0.0001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAllTogether() {

		Item[] items = new Item[10];
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
		
		Cart cart = new Cart();
		double total = cart.checkout(items, 10);
		
		assertEquals(total, 24.35 , 0.0001);
	}
	

}
