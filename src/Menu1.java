import java.util.ArrayList;
import java.util.List;

public class Menu1 extends MenuComponent {

	List<MenuComponent> menuComponent =  new ArrayList<MenuComponent>();
	 String name; 
	 String description;
	 
	public Menu1(String name, String description) { 
		 this.name = name; 
		 this.description = description;
	}
	public void add (MenuComponent menuComponent) { 
		menuComponent.add(menuComponent);
	}
	public void remove (MenuComponent menuComponent) { 
		menuComponent.remove(menuComponent);
	
	}
	public MenuComponent getChild(int i) {
		return menuComponent.get(i); 
		
	}
	public String getName() { 
		return name;
	}
	
	public void print() { 
		System.out.println("\n" + getName());
		System.out.println(",  " + getDescription());
		System.out.println("-------------------------");
		
		 for(MenuComponent menuComponent: menuComponent) {
			 menuComponent.print();
		 }
	}
	 
}
