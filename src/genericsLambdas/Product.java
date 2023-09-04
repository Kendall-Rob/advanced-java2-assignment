package genericsLambdas;

import java.util.*;

public class Product {
	//define the instance variables for 'name' and 'price'
		private String name;
		private double price;

	//define a public constructor for Product that takes a name and price as input and sets the instance variables accordingly
		 
		public Product(String name, double price) {
			this.name = name;
			this.price = price;
		}
		
	public static void main(String[] args) {
		//Make an Inventory object that holds Products
			
			Inventory<Product> furnitureOutlet = new Inventory<>();
		//Add as many products as you want to your Inventory Object using the addItem() method you defined 
			
			furnitureOutlet.addItems(new Product("Cindy Crawford LivingRoom Set", 2755.99));
			furnitureOutlet.addItems(new Product("Spellman 8 Pc LivingRoom Set", 1977.99));
			furnitureOutlet.addItems(new Product("Ramore Espresso 5 Pc DiningRoom Set", 1055.99));
			furnitureOutlet.addItems(new Product("Starlet Lane White 5Pc Queen BedRoom Set", 1849.99));
			furnitureOutlet.addItems(new Product("Soho Brown 5Pc Patio Set", 2399.99));


		//Your task is to calculate the total price of all products in an Inventory object called myInventory. Follow these steps:
		//1. Call the getItems method on your inventory object to retrieve the list of all products.
		//2. Convert this list into a stream by calling the stream method.
		//3. Apply the mapToDouble operation to this stream. The operation should be applied to each Product object 
		//	 	in the stream, converting it into its price. Use the lambda expression product -> product.price to 
		//		perform this conversion. This expression means "for each product, return its price".
		//4. Apply the sum operation to the stream to get the total price of all products.
		//5. Store this total price in a double variable called priceTotal.
		//6. Print out priceTotal to the console to make sure you are properly summing your Products!
			
			ArrayList<Product> myInventory = furnitureOutlet.getItems();
			double totalPrice = myInventory.stream().mapToDouble(product -> product.price).sum();
			
			System.out.println(totalPrice);
			System.out.println(furnitureOutlet.totalItems());
		
		
		
		//Helpful documentation:
		//https://www.baeldung.com/java-stream-sum#using-streamsum-with-objects

	}

	

}