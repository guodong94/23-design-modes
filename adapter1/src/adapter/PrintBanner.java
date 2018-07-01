package adapter;

public class PrintBanner extends Banner implements Print{

	public PrintBanner(String string) {
		super(string);
		
	}

	@Override
	public void printWeek() {
		super.showWithParen();
		
	}

	@Override
	public void printStrong() {
		super.showWithAster();
		
	}

}
