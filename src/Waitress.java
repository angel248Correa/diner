
import java.util.Iterator;
import java.util.List;

public class Waitress {
	
	MenuComponent allMenu; 
	
	public Waitress(MenuComponent allMenu ) { 
		this.allMenu = allMenu; 
	}

	/*Menu pancakeHouseMenu; 
	Menu dinerMenu; 
	Menu cafeMenu;
	
	
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
		 this.pancakeHouseMenu = pancakeHouseMenu; 
		 this.dinerMenu = dinerMenu;
		 this.cafeMenu = cafeMenu; 
		
	} */
	
	
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu, CafeMenu cafeMenu) {
		// TODO Auto-generated constructor stub
	}

	public void printMenu() { 
		
		allMenu.print(); 
	/* Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
		*/
		/*Iterator<Menu> menuIterator = menus.iterator();
		while(menuIterator.hasNext()) { 
			Menu menu = menuIterator.next(); 
			printMenu(menu.createIterator()); 
		}*/
		
	}
		/*System.out.println("Menu\n ----\nBreakfast");
		printMenu(pancakeIterator);
		System.out.println("\nLunch");
		printMenu(dinerIterator);
		System.out.println("\nDINNER");
		printMenu(cafeIterator); 
	} */
	
	public void printMenu(Iterator<MenuItem> iterator) { 
		while(iterator.hasNext()) {
		 MenuItem menuItem = (MenuItem) iterator.next(); 
		 
		 System.out.println(menuItem.getName() + " ");
		 System.out.println(menuItem.getPrice()  +  " ");
		 System.out.println(menuItem.getDescription() + " ");
				 
		}
	}
}
