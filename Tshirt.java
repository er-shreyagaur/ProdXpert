package Project;

public class Tshirt extends Product {
	String subcategory;
	int size;
	String color;
	String type;

	public Tshirt(String productId, String brand, double price, String subCategory, int size, String color,
			String type) {
		super(productId, "Tshirt", brand, price);
		this.subcategory = subCategory;
		this.size = size;
		this.color = color;
		this.type = type;
	}
	@Override
	public String getSubcategory() {
		return subcategory;
	}
	@Override
	public String toString() {
	    return "Tshirt [id = " + productId + ", name = " + brand + ", price = " + price + ", category = " + category + 
	           ", size = " + size + ", color = " + color + ", subcategory = " + subcategory + "]";
	}

}
