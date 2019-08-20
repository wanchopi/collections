package es.wanchopi.collections.model;


/**
 * Products.java
 * @author Wanchopi
 *
 */
public class Product implements Comparable<Product>{
	
	private int code;
	private String description;
	
	/**
	 * Empty constructor
	 */
	public Product() {
		
	}

	/**
	 * @param code
	 * @param description
	 */
	public Product(int code, String description) {
		this.code = code;
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (code != other.code)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + "]";
	}

	@Override
	public int compareTo(Product p) {
		
		return this.code - p.code;
	}
	
	

}
