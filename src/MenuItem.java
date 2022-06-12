import java.util.Iterator;

public class MenuItem extends MenuComponent {

	String name; 
	String description; 
	boolean vegetarian; 
	double price; 
	
	public MenuItem(String name, String description, boolean vegetarian, double price) { 
		
		this.name  = name; 
		this.description = description; 
		this.vegetarian = vegetarian; 
		this.price = price; 
		
	}
	public String getName() { 
		return name; 
	}
	public String getDescription() { 
		return description; 
	}
	public boolean isVegetarian () { 
		return vegetarian; 
	}
	public double getPrice() { 
		 return price; 
	}
	public void put(String name2, MenuItem menuItem) {
		// TODO Auto-generated method stub
		
	}
	public static Iterator<MenuItem> Iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	public void print() { 
		System.out.println(" " + getName());
		if(isVegetarian()) { 
			System.out.println("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println("     --" + getDescription());
	}
}
