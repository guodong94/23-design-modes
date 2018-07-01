package adapter2;

public class PrintBanner extends Print {
	private Banner banner;
	public PrintBanner(String string){
		banner=new Banner(string);
	}
	@Override
	public void printWeek() {
		banner.printWithParen();
		
	}

	@Override
	public void printStrong() {
		banner.printWithAster();
	}

}
