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
		p.use();
		p1.use();
		p2.use();
		p3.use();
		
	}
}
