package adapter;

//使用继承的适配器
public class Main {

	public static void main(String[] args) {

		Print print=new PrintBanner("hello");
		print.printWeek();
		print.printStrong();
		
	}
}
