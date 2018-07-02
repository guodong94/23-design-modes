import java.util.ArrayList;
import java.util.List;

import framework.Factory;
import framework.Product;
import idcard.FactoryIDCard;
import idcard.IDCard;

public class Main {
	public static void main(String[] args) {
		Factory factory=new FactoryIDCard();
		
		Product p=factory.create("小A");
		Product p1=new IDCard("小云");
		Product p2=new IDCard("小马");
		Product p3=new IDCard("小彦");
		factory.registerProduct(p1);
		factory.registerProduct(p2);
		factory.registerProduct(p3);
		List list=((FactoryIDCard) factory).getOwners();
		for (int i = 0; i <list.size(); i++) {
			if(i==0){
				System.out.println("---------------");
			}
			System.out.println(list.get(i));
			System.out.println("---------------");
		}
		p.use();
		p1.use();
		p2.use();
		p3.use();
		
		
	}
}
