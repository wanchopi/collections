package es.wanchopi.collections.main;

import java.util.Set;

import es.wanchopi.collections.model.HashSetStore;
import es.wanchopi.collections.model.Product;
import es.wanchopi.collections.model.TreeSetStore;

/**
 * 
 * @author Usuario
 *
 */
public class RunExample {

	public static void main(String[] args) {
		
		TreeSetStore store = new TreeSetStore();
		Set<Product> products = store.getProducts();
		
		System.out.println("TreeSet");
		System.out.println("=======");
		for(Product p : products) {
			System.out.println("\t" + p);
		}
		
		HashSetStore store2 = new HashSetStore();
		Set<Product> products2 = store2.getProducts();
		System.out.println("TreeSet");
		System.out.println("=======");
		for(Product p : products2) {
			System.out.println("\t" + p);
		}
		

	}

}
