package es.wanchopi.collections.model;

import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author Wanchopi
 *
 */
public class TreeSetStore {
	
	private Set<Product> products;
	
	/*
	 * Constructor
	 */
	public TreeSetStore() {
		
		this.products = new TreeSet<Product>();
		
		loadProducts();
	}
	
	/**
	 * @return the products
	 */
	public Set<Product> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	/**
	 * load some products as an example
	 */
	private void loadProducts() {
		
		Product table = new Product(100, "Wood table");
		this.products.add(table);
		Product tv = new Product(120, "Color T.V.");
		this.products.add(tv);
		Product bed = new Product(90, "Big bed");
		this.products.add(bed);
		Product table2 = new Product(100, "Plastic table");
		this.products.add(table2);
	}

}
