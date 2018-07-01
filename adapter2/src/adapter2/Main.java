package adapter2;
//使用委托的适配器
public class Main {
	public static void main(String[] args) {
		Print print=new PrintBanner("hello");
		print.printWeek();
		print.printStrong();
	}
}
