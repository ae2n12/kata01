package Kata01;
import static org.junit.Assert.*;

import org.junit.Test;


public class TestCart {

	@SuppressWarnings("deprecation")
	@Test
	public void EmptyCart() {
		Item[] items = new Item[0]; 
		
		Cart cart = new Cart();
		
		double total = cart.checkout(items, 0);
		
		assertEquals(0, total, 0.0001);
	}
	
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
		
		assertEquals( 1.40,total, 0.0001);
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
		
		assertEquals( 1.4,total, 0.0001);
	}
	
	public void testThreeForTwo_MultipleOf3() {
		Item[] items = new Item[6]; 
		int i=0;
		Drinks f1 = new Drinks(0.70);
		items[i++] = f1;	
		Drinks f2 = new Drinks(0.70);
		items[i++] = f2;	
		Drinks f3 = new Drinks(0.70);
		items[i++] = f3;	
		Drinks f4 = new Drinks(0.70);
		items[i++] = f4;	
		Drinks f5 = new Drinks(0.70);
		items[i++] = f5;	
		Drinks f6 = new Drinks(0.70);
		items[i++] = f6;
		
		Cart cart = new Cart();
		
		double total = cart.checkout(items, 6);
		
		assertEquals( 2.8, total, 0.0001);
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
		
		assertEquals( 1.0, total,0.0001);
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
		
		assertEquals( 0.8, total, 0.0001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testThreeForPound_MultiplesOf3() {
		Item[] items = new Item[6]; 
		int i=0;
		Apple f1 = new Apple(0.40);
		items[i++] = f1;	
		Apple f2 = new Apple(0.40);
		items[i++] = f2;	
		Apple f3 = new Apple(0.40);
		items[i++] = f3;	
		Apple f4 = new Apple(0.40);
		items[i++] = f4;	
		Apple f5 = new Apple(0.40);
		items[i++] = f5;	
		Apple f6 = new Apple(0.40);
		items[i++] = f6;	
		
		Cart cart = new Cart();
		
		double total = cart.checkout(items, 6);
		
		assertEquals( 2.0, total, 0.0001);
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
		
		assertEquals( 24.35 , total, 0.0001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAllTogether_2() {

		Item[] items = new Item[5];
		int i = 0;
		
		Apple a = new Apple(0.40);
		items[i++] = a;
		Apple a1 = new Apple(0.40);
		items[i++] = a1;		
		Cheese c = new Cheese (19.9, 3.0);
		items[i++] = c;
		Drinks f1 = new Drinks(0.70);
		items[i++] = f1;	
		Drinks f2 = new Drinks(0.70);
		items[i++] = f2;	
		
		
		Cart cart = new Cart();
		double total = cart.checkout(items, 5);
		
		assertEquals( 61.9 , total, 0.0001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testManyApples() {

		Item[] items = new Item[50];
		int i = 0;
	
		for (;i<50;i++){
			items[i] = new Apple(0.40);
		}
				
		
		Cart cart = new Cart();
		double total = cart.checkout(items, 50);
		
		assertEquals( 16.8 , total, 0.0001);
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAllTogether_3() {

		Item[] items = new Item[7];
		int i = 0;
		
		Apple a = new Apple(0.40);
		items[i++] = a;
		Apple a1 = new Apple(0.40);
		items[i++] = a1;		
		Cheese c = new Cheese (19.9, 3.0);
		items[i++] = c;
		Drinks f1 = new Drinks(0.70);
		items[i++] = f1;	
		Drinks f2 = new Drinks(0.70);
		items[i++] = f2;	
		
		Bread b1 = new Bread(1.25);
		items[i++] = b1;
		Bread b2 = new Bread(1.25);
		items[i++] = b2;
		
		Cart cart = new Cart();
		double total = cart.checkout(items, 7);
		
		assertEquals(64.4 , total,  0.0001);
	}

}
