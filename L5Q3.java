package codes;
import java.util.*;

class ShoppingCart{
	private int number;
	private int total;
	private Item items[];
	
	public ShoppingCart(int number){
		this.number = number;
		this.total = 0;
		items = new Item[number];
		for(int i = 0; i < number; i++) {
			items[i] = new Item();
			items[i].assign();
		}
	}
	
	class Item{
		private String itemName;
		private int quantity;
		private int price;
		
		public Item() {
			this.itemName = "";
			this.quantity = 0;
			this.price = 0;
		}
		
		public void assign() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Item name: ");
			itemName = sc.nextLine();
			System.out.println("Enter Quantity needed: ");
			quantity = sc.nextInt();
			System.out.println("Enter Price: ");
			price = sc.nextInt();
		}
		
		public void display() {
			System.out.println("Item: " + itemName);
			System.out.println("Quatnity Inside: " + quantity);
			int totalp = quantity*price;
			System.out.println("Price: " + totalp);
		}
		
	}
	
	public void add_i() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the New Item name: ");
		String newItem = sc.nextLine();
		System.out.println("Enter the Quantity needed: ");
		int newq = sc.nextInt();
		System.out.println("Enter the Price: ");
		int newp = sc.nextInt();
		
		Item newi = new Item();
		newi.itemName = newItem;
		newi.price = newp;
		newi.quantity = newq;
		
		items = Arrays.copyOf(items, number + 1);
		items[number] = newi;
		number++;
	}
	
	public void displayFinal() {
		for(int i = 0; i < number; i++) {
			items[i].display();
		}
	}
	
	public void compute() {
		for(int i = 0; i < number; i++) {
			total += items[i].price;
		}
		System.out.println("The Cart Price: " + total);
	}
}

public class L5Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Items: ");
		int num = sc.nextInt();
		
		ShoppingCart shopping = new ShoppingCart(num);
		shopping.displayFinal();
		System.out.println("Do you want to add Items? 1 for yes, 2 for no");
		int response = sc.nextInt();
		if(response == 1) {
			System.out.println("How many: ");
			int more = sc.nextInt();
			for(int i = 0; i < more; i++) {
				shopping.add_i();
				shopping.displayFinal();
			}
		}else {
			System.out.println("The Cart has been displayed");
		}
		
		shopping.compute();
	}

}
