import java.util.Iterator;


import javax.swing.DebugGraphics;

public class DinerMenu implements Iterator {
	static final int MAX_ITEM = 6; 
	int numberOfItems = 0; 
	MenuItem[] menuItems; 
	
	public DinerMenu ()  { 
		menuItems = new MenuItem[MAX_ITEM];
		
		addItem("Vegetraian BLT", 
				"(Fakin) bacon with lettuce &  tomato on whole wheat", true, 2.99); 
		addItem("BLT", 
				"Bacon with lettuce & ",false, 2.99 ); 
		addItem("Soup of the day",
				"Soup of the day with aside of potato salad", false, 3.29 );
		addItem("HotDog",
				"A hot dog, with sauerkraut, relish, onoins, topped with cheese", false, 3.05); 
		
		// a couple other diner menu item add here
	}

	public void addItem(String name, String description, 
						boolean vegetarian, double price) { 
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >= MAX_ITEM) { 
			System.err.println("Sorry, the Menu is full! Can't add item to menu");
			
		}else { 
			menuItems[numberOfItems] = menuItem; 
			numberOfItems = numberOfItems + 1;  
		}
		 	}
	public MenuItem[] getMenuItems() {
		return menuItems; 
		 
	 }
	
	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(menuItems); 
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
