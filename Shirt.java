package Project;

public class Shirt extends Product {
	String subCategory;
	int size;
	String color;
	String type;

	public Shirt(String productId, String brand, double price, String subCategory, int size, String color,
			String type) {
		super(productId, "Shirt", brand, price);
		this.subCategory = subCategory;
		this.size = size;
		this.color = color;
		this.type = type;

	}
	public int getSize() {
		return size;
	}
	public String getColor() {
		return color;
	}
	@Override
	public String getSubcategory() {
		return subCategory;
	}
	@Override
	public String toString() {
	    return "Shirt [id = " + productId + ", name = " +brand + ", price = " + price + ", category = " + category + 
	           ", size = " + size + ", color = " + color + ", subCategory = " + subCategory + "]";
	}

}
