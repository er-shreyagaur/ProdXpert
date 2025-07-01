package Project;

public class Mobile extends Product {
	String model;
	int ram;
	int storage;

	public Mobile(String productId, String brand, double price, String model, int ram, int storage) {
		super(productId, "Mobile", brand, price);
		this.model = model;
		this.ram = ram;
		this.storage = storage;
	}
	
	@Override
	public String getSubcategory() {
		return model;
	}
	@Override
	public String toString() {
	    return "Mobile [id = " + productId + ", brand = " + brand + ", price = " + price + ", category = " + category +
	           ", model = " + model + ", ram = " + ram + "GB, storage = " + storage + "GB]";
	}

}
