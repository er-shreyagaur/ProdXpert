package Project;

import java.util.*;
import Project.Mobile;

public class Main {
	public static void main(String[] args) {
		Service ser = new Service();
		
		ser.addProduct(new Shirt("S1", "Blackberry", 2500, "Casual", 42, "Blue", "Full"));
		ser.addProduct(new Shirt("S2", "Levis", 1900, "Formal", 40, "White", "Half"));
		ser.addProduct(new Shirt("S3", "Arrow", 2100, "Formal", 40, "Blue", "Half"));
		ser.addProduct(new Shirt("S4", "Van Heusen", 2750, "Casual", 41, "Black", "Half"));
		ser.addProduct(new Shirt("S5", "Blackberry", 1800, "Party", 39, "Red", "Full"));
		ser.addProduct(new Shirt("S6", "Levis", 2300, "Casual", 40, "Green", "Full"));

		ser.addProduct(new Mobile("M1", "Samsung", 15000, "A51", 6, 128));
		ser.addProduct(new Mobile("M2", "Apple", 7000, "iPhone 13", 4, 256));
		ser.addProduct(new Mobile("M3", "OnePlus", 32000, "Nord CE", 8, 128));
		ser.addProduct(new Mobile("M4", "Xiaomi", 18000, "Redmi Note 12", 6, 64));
		ser.addProduct(new Mobile("M5", "Samsung", 12000, "M31", 4, 64));
		ser.addProduct(new Mobile("M6", "App", 9000, "iPhone 12", 4, 128));

		ser.addProduct(new Tshirt("T1", "Nike", 1200.0, "Sportswear", 40, "Black", "Graphic"));
		ser.addProduct(new Tshirt("T2", "Adidas", 1350.0, "Casual", 38, "White", "Plain"));
		ser.addProduct(new Tshirt("T3", "Puma", 1100.0, "Activewear", 42, "Red", "Text"));
		ser.addProduct(new Tshirt("T4", "HRX", 950.0, "Gymwear", 39, "Blue", "Printed"));
		ser.addProduct(new Tshirt("T5", "HRX", 1050.0, "Gymwear", 45, "Black", "Printed"));
		ser.addProduct(new Tshirt("T6", "Nike", 1290.0, "Casual", 39, "Orange", "Text"));
		
		MenuHandler menu = new MenuHandler(ser);
		menu.startMenu();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("\nAll Shirts: ");
		ser.printAllShirts();

		System.out.println("\nAll Mobiles");
		ser.printAllMobiles();

		System.out.println("\nTotal Mobiles: " + ser.countMobiles());

		System.out.println("\nTotal Shirts: " + ser.countShirts());

		System.out.println("\nCount of Shirts of size 40: " + ser.countShirtsOfSize(40));

		System.out.println("\nBlackberry Shirts of size 42: " + ser.printBlackberryShirtOfSize(42));

		System.out.println("\nShirts of size 40 and and price > 2000:" );
		for(Shirt s : ser.printShirtOfSizeAndPrice(40,2000)) {
			System.out.println(s);
		}

		System.out.println("Product counts by type: " + ser.countOfProductType());

		System.out.println("Shirts price from Low to High:");
			for(Shirt s : ser.sortShirtsByPriceLowToHigh()) {
				System.out.println(s);
			}
			
		System.out.println("Shirts price from High to Low:");
			for(Shirt s : ser.sortShirtsByPriceHighToLow()) {
				System.out.println(s);
			}

		System.out.println("Mobiles from Low to High:");
			for(Mobile m : ser.sortMobileByPriceLowToHigh()) {
				System.out.println(m);
			}

		System.out.println("Mobile from High to Low:");
			for(Mobile m : ser.sortMobileByPriceHighToLow()) {
				System.out.println(m);
			}

		System.out.println("List of All Brands: " + ser.listAllBrands());

		System.out.println("Sizes of Shirts: " + ser.sizeAvailable());

		System.out.println("Types of Product: " + ser.listAllProductTypes());

		System.out.println("Shirts Available for BlackBerry: " + ser.countShirtsByBrand("Blackberry"));

		System.out.println("Shirts count by size: " + ser.countShirtsBySize());

		System.out.println("Shirts count by color: " + ser.countShirtsByColor());

	

		ser.printProductsByAllCategories();

		ser.printAllProductsByAllSubCategories();

		ser.printAllCategories();

		System.out.println("\nTotal number of categories: " + ser.countAllCategories());

		System.out.println("\nAll Subcategories for every category: ");
		ser.printAllSubCategoriesForEveryCategory();

		System.out.println("Count of Subcategories for each Category: " + ser.countSubCategoryForCategories());
		
		sc.nextLine();
		
		System.out.print("Enter the productID of Shirt to remove: ");
		String productId = sc.nextLine();
		boolean isRemoved = ser.removeProduct(productId);
		System.out.println("Shirts of ID are removed " + productId + " removed: " + isRemoved);
	}

}
