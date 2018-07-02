package framework;

import java.util.List;

public abstract class Factory {
	
	public final Product create(String owner){
		Product product=createProduct(owner);
		registerProduct(product);
		return product;
	}
	
	public abstract Product createProduct(String owner);
	public abstract void registerProduct(Product product);
	
		
	

}
