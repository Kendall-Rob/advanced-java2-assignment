package genericsLambdas;

import java.util.*;
import java.util.ArrayList;

//Add a type parameter to the Inventory class to say that it works with a generic type
public class Inventory<T> {
	
//Define a list instance variable that takes a generic type parameter 

	private ArrayList<T> inventoryList;
//Define a public constructor with no parameters that sets the list instance variable to an empty list
//(you can choose the type of list you want)
	
	public Inventory() {
		inventoryList = new ArrayList<>();
	}


//Define a function that returns all items in the list instance variable
	
	public ArrayList<T> getItems() {
		return inventoryList;
	}

//Define a function that takes an item of any type as input and adds it to the list
	
	public void addItems(T items) {
		inventoryList.add(items);
	}
//Define a function that takes an item of any type as input, removes it from the list, and then returns 
//the updated list
	
	public ArrayList<T> removeItems(T items) {
		inventoryList.remove(items);
			return inventoryList;
	}

//Define a function that returns the number of items currently in the list
	
	public int totalItems() {
		return inventoryList.size();
	}

}