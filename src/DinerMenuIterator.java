

import java.util.Iterator;

public class DinerMenuIterator implements Iterator{
	
	MenuItem[] items; 
	int position = 0; 
	
	public DinerMenuIterator(MenuItem[] items) { 
	  this.items = items;
	}

	public MenuItem Next() {
		//MenuItem menuItem = items[position]; 
		//position  = position + 1; 
		return items[position++];
	}
	


	public boolean hasNext() { 
		/*if(position >= items.length || items[position] == null) {
			 return false;
		} else { 
			return true; 
		}
		
	} */

		return items.length > position; 
	}
	
	public void remove() { 
		throw new UnsupportedOperationException(" you shouldn't be trying tio remove items");
	}

	@Override
	public java.awt.MenuItem next() {
		// TODO Auto-generated method stub
		return null;
	}

}
