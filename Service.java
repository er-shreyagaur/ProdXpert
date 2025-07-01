package Project;

import java.util.*;
import java.util.stream.Collectors;

public class Service {
	Map<String, Product> m1 = new HashMap<>();

	public void addProduct(Product p) {
		m1.put(p.productId, p);
	}

	public void printAllProducts() {
		for (Product p : m1.values()) {
			System.out.println(p);
		}
	}

	public void printAllShirts() {
		for (Product p : m1.values()) {
			if (p instanceof Shirt) {
				System.out.println(p);
			}
		}
	}

	public int countShirts() {
		int count = 0;
		for (Product p : m1.values()) {
			if (p instanceof Shirt)
				count++;
		}
		return count;
	}

	public void printAllMobiles() {
		for (Product p : m1.values()) {
			if (p instanceof Mobile) {
				System.out.println(p);
			}
		}
	}

	public int countMobiles() {
		int count = 0;
		for (Product p : m1.values()) {
			if (p instanceof Mobile)
				count++;
		}
		return count;
	}

	public int countShirtsOfSize(int targetSize) {
		int count = 0;
		for (Product p : m1.values()) {
			if (p instanceof Shirt) {
				Shirt s = (Shirt) p;
				if (s.size == targetSize)
					count++;
			}
		}
		return count;
	}

	public List<Shirt> printBlackberryShirtOfSize(int size) {
		List<Shirt> result = new ArrayList<>();
		for (Product p : m1.values()) {
			if (p instanceof Shirt) {
				Shirt s = (Shirt) p;
				if (s.brand.equalsIgnoreCase("Blackberry") && s.size == size)
					result.add(s);
			}
		}
		return result;
	}

	public List<Shirt> printShirtOfSizeAndPrice(int size, int price) {
		List<Shirt> result = new ArrayList<>();
		for (Product p : m1.values()) {
			if (p instanceof Shirt) {
				Shirt s = (Shirt) p;
				if (s.size == size && s.price > price)
					result.add(s);
			}
		}
		return result;
	}

	public List<Product> printProduct() {
		return new ArrayList<>(m1.values());
	}

	public Map<String, Integer> countOfProductType() {
		Map<String, Integer> typeCount = new HashMap<>();

		for (Product p : m1.values()) {
			String type = p.category;
			typeCount.put(type, typeCount.getOrDefault(type, 0) + 1);
		}
		return typeCount;
	}

	public List<Shirt> sortShirtsByPriceLowToHigh() {
		List<Shirt> shirts = new ArrayList<>();

		for (Product p : m1.values()) {
			if (p instanceof Shirt)
				shirts.add((Shirt) p);

		}
		shirts.sort((s1, s2) -> Double.compare(s1.price, s2.price));
		return shirts;
	}

	public List<Shirt> sortShirtsByPriceHighToLow() {
		List<Shirt> shirts = new ArrayList<>();

		for (Product p : m1.values()) {
			if (p instanceof Shirt)
				shirts.add((Shirt) p);
		}
		shirts.sort((s1, s2) -> Double.compare(s2.price, s1.price));
		return shirts;
	}

	public List<Mobile> sortMobileByPriceHighToLow() {
		List<Mobile> mobile = new ArrayList<>();

		for (Product p : m1.values()) {
			if (p instanceof Mobile)
				mobile.add((Mobile) p);
		}
		mobile.sort((m1, m2) -> Double.compare(m2.price, m1.price));
		return mobile;
	}

	public List<Mobile> sortMobileByPriceLowToHigh() {
		List<Mobile> mobile = new ArrayList<>();

		for (Product p : m1.values()) {
			if (p instanceof Mobile)
				mobile.add((Mobile) p);
		}
		mobile.sort((m1, m2) -> Double.compare(m1.price, m2.price));
		return mobile;
	}

	public Set<String> listAllBrands() {
		Set<String> brands = new HashSet<>();

		for (Product p : m1.values()) {
			brands.add(p.brand);
		}

		return brands;
	}

	public Set<Integer> sizeAvailable() {
		return m1.values().stream().filter(p -> p instanceof Shirt).map(p -> ((Shirt) p).size)
				.collect(Collectors.toSet());
	}

	public Set<String> listAllProductTypes() {
		Set<String> productTypes = new HashSet<>();
		for (Product p : m1.values()) {
			productTypes.add(p.category);
		}
		return productTypes;
	}

	public int countShirtsByBrand(String brand) {
		int count = 0;
		for (Product p : m1.values()) {
			if (p instanceof Shirt) {
				Shirt s = (Shirt) p;
				if (s.brand.equalsIgnoreCase(brand))
					count++;

			}
		}
		return count;
	}

	public Map<Integer, Integer> countShirtsBySize() {
		Map<Integer, Integer> sizeCount = new HashMap<>();

		for (Product p : m1.values()) {
			if (p instanceof Shirt) {
				Shirt s = (Shirt) p;
				sizeCount.put(s.size, sizeCount.getOrDefault(s.size, 0) + 1);
			}
		}
		return sizeCount;
	}

	public Map<String, Integer> countShirtsByColor() {
		Map<String, Integer> colorCount = new HashMap<>();

		for (Product p : m1.values()) {
			if (p instanceof Shirt) {
				Shirt s = (Shirt) p;
				colorCount.put(s.color, colorCount.getOrDefault(s.color, 0) + 1);
			}
		}
		return colorCount;
	}

	public void printProductsByAllCategories() {
		Set<String> categories = new HashSet<>();
		for (Product p : m1.values()) {
			categories.add(p.category);
		}

		for (String cat : categories) {
			System.out.println("Products in category: " + cat);
			for (Product p : m1.values()) {
				if (p.category.equalsIgnoreCase(cat)) {
					System.out.println(p);
				}
			}

		}
		System.out.println();
	}

	public void printAllProductsByAllSubCategories() {

		Set<String> subCategories = new HashSet<>();
		for (Product p : m1.values()) {
			if (p instanceof Shirt) {
				subCategories.add(((Shirt) p).subCategory);
			}

			else if (p instanceof Tshirt) {
				subCategories.add(((Tshirt) p).subcategory);
			} else if (p instanceof Mobile) {
				subCategories.add(((Mobile) p).model);
			}

		}

		for (String subCat : subCategories) {
			System.out.println("Products in SubCategory: " + subCat);
			for (Product p : m1.values()) {
				if (p instanceof Shirt && ((Shirt) p).subCategory.equalsIgnoreCase(subCat)) {
					System.out.println(p);
				} else if (p instanceof Tshirt && ((Tshirt) p).subcategory.equalsIgnoreCase(subCat)) {
					System.out.println(p);
				} else if (p instanceof Mobile && ((Mobile) p).model.equalsIgnoreCase(subCat)) {
					System.out.println(p);
				}
			}
			System.out.println();
		}
	}

	public void printAllCategories() {
		Set<String> categories = new HashSet<>();

		for (Product p : m1.values()) {
			categories.add(p.category);
		}
		System.out.println("All Categories: ");
		for (String cat : categories) {
			System.out.println(cat);
		}
	}

	public int countAllCategories() {
		Set<String> categories = new HashSet<>();

		for (Product p : m1.values()) {
			categories.add(p.category);
		}

		return categories.size();
	}

	public void printAllSubCategoriesForEveryCategory() {
		Map<String, Set<String>> SubCategoryMap = m1.values().stream()
				.collect(Collectors.groupingBy(p -> p.category, Collectors.mapping(p -> {
					if (p instanceof Shirt) {
						return ((Shirt) p).subCategory;
					} else if (p instanceof Mobile) {
						return ((Mobile) p).model;
					} else if (p instanceof Tshirt) {
						return ((Tshirt) p).subcategory;
					}
					return null;
				}, Collectors.toSet())));
		SubCategoryMap.forEach((type, subCategories) -> {
			System.out.println("Product Type: " + type);
			System.out.println("Subcategories: " + subCategories);
			System.out.println();
		});

	}

	public Map<String, Integer> countSubCategoryForCategories() {
		return m1.values().stream().collect(Collectors.groupingBy(p -> p.category, Collectors.mapping(p -> {
			if (p instanceof Shirt)
				return ((Shirt) p).getSubcategory();
			if (p instanceof Tshirt)
				return ((Tshirt) p).getSubcategory();
			if (p instanceof Mobile)
				return ((Mobile) p).getSubcategory();
			return "";
		}, Collectors.collectingAndThen(Collectors.toSet(), Set::size)

		)));
	}

	public boolean removeProduct(String productID) {
		if (m1.containsKey(productID)) {
			m1.remove(productID);
			return true;
		} else
			return false;
	}

}
