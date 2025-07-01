package Project;

public class Product {
	String productId;
	String category;
	String brand;
	double price;

	public Product(String productId, String category, String brand, double price) {
		this.productId = productId;
		this.category = category;
		this.brand = brand;
		this.price = price;
	}
	public String getSubcategory() {
		return "";
	}
	@Override
	public String toString() {
	    return "Product [id = " + productId + ", name = " + brand + ", price = " + price + ", category = " + category + "]";
	}

}
