package idcard;


import java.util.ArrayList;
import java.util.List;

import framework.Factory;
import framework.Product;

public class FactoryIDCard extends Factory {

	private List owners=new ArrayList();
	@Override
	public Product createProduct(String owner) {
		
		return new IDCard(owner);
	}

	@Override
	public void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
		
	}
	public List getOwners(){
		return owners;
	}

}
