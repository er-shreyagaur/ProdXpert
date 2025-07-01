package Project;

import java.util.List;
import java.util.Scanner;

public class MenuHandler {
	 private final Scanner sc = new Scanner(System.in);
	 private final Service service;
	 
	 public MenuHandler(Service service) {
		 this.service = service;
	 }

	public void startMenu() {
		while (true) {
			showMenu();
			int choice = getChoice();

			switch (choice) {
			case 1 -> addProduct();
			case 2 -> service.printAllProducts();
			case 3 -> service.printAllShirts();
			case 4 -> service.printAllMobiles();
			case 5 -> System.out.println("Total shirts: " + service.countShirts());
			case 6 -> {
				System.out.print("Enter size: ");
				int size = sc.nextInt();
				System.out.println("Count: " + service.countShirtsOfSize(size));
			}
			case 7 -> {
				System.out.print("Enter size: ");
				int size = sc.nextInt();
				System.out.println(service.printBlackberryShirtOfSize(size));
			}
			case 8 -> {
				List<Shirt> shirts = service.printShirtOfSizeAndPrice(40, 2000);
				for (Shirt s : shirts) {
	            System.out.println(s);
	        }
			
			}
			
			case 9 -> service.sortShirtsByPriceLowToHigh().forEach(System.out::println);
			case 10 -> service.sortMobileByPriceHighToLow().forEach(System.out::println);
			case 11 -> service.listAllBrands().forEach(System.out::println);
			case 12 -> System.out.println(service.sizeAvailable());
			case 13 -> System.out.println(service.countOfProductType());
			case 14 -> System.out.println(service.countSubCategoryForCategories());
			case 15 -> {
				System.out.print("Enter Product ID: ");
				String id = sc.next();
				System.out.println("Removed: " + service.removeProduct(id));
			}
			case 0 -> {
				System.out.println("Exiting...");
				return;
			}
			default -> System.out.println("Invalid choice!");
			}
		}
	}

	private void showMenu() {
		System.out.println("\n======== ProdXpert =============");
		System.out.println("1. Add Product");
		System.out.println("2. View All Products");
		System.out.println("3. View All Shirts");
		System.out.println("4. View All Mobiles");
		System.out.println("5. Count All Shirts");
		System.out.println("6. Count Shirts by Size");
		System.out.println("7. Find Blackberry Shirts of Given Size");
		System.out.println("8. View Shirts (Size 40 & Price > 2000)");
		System.out.println("9. Sort Shirts by Price (Low to High)");
		System.out.println("10. Sort Mobiles by Price (High to Low)");
		System.out.println("11. List All Brands");
		System.out.println("12. List Shirt Sizes Available");
		System.out.println("13. Count Products by Type");
		System.out.println("14. Count Subcategories per Category");
		System.out.println("15. Remove Product by ID");
		System.out.println("0. Exit");
		System.out.print("\nEnter your choice: ");
		System.out.println();
	}

	private int getChoice() {
		try {
			return Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			return -1;
		}
	}

	private void addProduct() {
		System.out.print("Enter product type (Shirt/Mobile/Tshirt): ");
		String type = sc.nextLine();

		System.out.print("Enter ID: ");
		String id = sc.nextLine();
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Price: ");
		double price = Double.parseDouble(sc.nextLine());

		if (type.equalsIgnoreCase("Shirt")) {
			System.out.print("Size: ");
			int size = Integer.parseInt(sc.nextLine());
			System.out.print("Color: ");
			String color = sc.nextLine();
			System.out.print("Subcategory: ");
			String sub = sc.nextLine();
			service.addProduct(new Shirt(id, name, price, "Shirt", size, color, sub));
		} else if (type.equalsIgnoreCase("Mobile")) {
			System.out.print("Model: ");
			String model = sc.nextLine();
			System.out.print("RAM: ");
			int ram = sc.nextInt();
			System.out.print("Storage: ");
			int storage = sc.nextInt();
			service.addProduct(new Mobile(id, name, price, model, ram, storage));
		} else if (type.equalsIgnoreCase("Tshirt")) {
			System.out.print("Size: ");
			int size = Integer.parseInt(sc.nextLine());
			System.out.print("Color: ");
			String color = sc.nextLine();
			System.out.print("Subcategory: ");
			String sub = sc.nextLine();
			service.addProduct(new Tshirt(id, name, price, "Tshirt", size, color, sub));
		} else {
			System.out.println("Unknown product type.");
		}
	}
}
