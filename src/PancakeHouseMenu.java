import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu  {
	
	List<MenuItem> menuItems; 
	
	public PancakeHouseMenu() { 
		
		menuItems = new ArrayList<MenuItem>();
		
		addItem("K&B's Pancakes Breakfast",
				"Pancakes with scrambled eggs, and toast", true, 2.99);
		addItem("Regular Pancake Breakfast ", 
				"pancake with fried eggs, sausage",  false, 2.99);
		addItem("Blueberry Pancake",
				"Pancake made with fresh blueberry", true, 3.49); 
		addItem("Waffle", 
				"waffle with your choice o blueberry or strawberry", 
				true, 3.59); 
		
	}
	public void addItem(String name, String description, boolean vegetarian, double price) { 
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price); 
		menuItems.add(menuItem); 
	}
	
	 public List<MenuItem> getMenuItem() { 
		 return menuItems; 
	 }
	public Iterator<MenuItem> createIterator() {
		return MenuItem.Iterator();
	}
	 

}
