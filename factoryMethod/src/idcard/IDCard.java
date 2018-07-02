package idcard;

import framework.Product;

public class IDCard extends Product{
	
	private String owner;
	public IDCard(String owner) {
		System.out.println("制作"+owner+"id卡");
		this.owner=owner;
	}

	@Override
	public void use() {
		System.out.println("使用"+owner+"id卡");
		
	}
	public String getOwner(){
		return owner;
	}

}
