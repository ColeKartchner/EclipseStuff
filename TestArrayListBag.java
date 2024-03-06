import static org.junit.Assert.*;

import org.junit.Test;


public class TestArrayListBag {
	
	@Test
	public void testAdd() {
		Bag bag = new ArrayListBag();
		
		bag.add("Apple");
		bag.add("Banana");
		bag.add("Cherry");
		bag.add("Dates");
		bag.add("Eggplant");
		
		assertEquals(5,bag.getSize());
				
		bag.add("Figs");
		
		assertEquals(6,bag.getSize());
	}
	
	@Test
	public void testAddAll() {
		String[] letters = {"A","B","C","D","E","F"};
		
		Bag bag = new ArrayListBag();
		bag.addAll(letters);
		
		assertEquals(6,bag.getSize());
	}
	
	@Test
	public void testContains() {
		Bag bag = new ArrayListBag();
		
		assertFalse(bag.contains("Apple"));
		
		bag.add("Apple");
		
		assertTrue(bag.contains("Apple"));
	}
	
	@Test
	public void testRemove() {
		Bag bag = new ArrayListBag();
		
		bag.remove("Apple");
		
		assertEquals(0,bag.getSize());
		
		bag.add("Apple");
		assertEquals(1,bag.getSize());
		
		bag.remove("Apple");
		assertEquals(0,bag.getSize());
	}

}
