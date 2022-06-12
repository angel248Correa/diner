import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {

	Map<String, MenuItem> menuItems = new HashMap<String, MenuItem>(); 
	
	public CafeMenu() { 
		addItem("Veggie Buger and Air Fries", 
				"Veggie burger on  a whole wheat bun, lettuce, tomatos, and fries", true,3.99 ); 
		addItem("Soup of the day", "A Cup of the soup of the day, with a side salad", 
				false, 3.69); 
		addItem("Burrito" ,
				"A Large burriro, with wholepinto beans, salasa, guacamole",true, 4.29);
		
	}
	public void addItem(String name, String description,
					boolean vegetarian, double price) { 
		MenuItem menuItem =  new MenuItem(name, description, vegetarian, price); 
		menuItem.put(name, menuItem); 
		
	}
	
	@Override
	public Iterator<MenuItem> createIterator() {

		return menuItems.values().iterator();
	}
	
	
}
