package teamplateMethod;

public class StringDisplay extends AbstractDisplay {
	private String string;
	private int len;

	public StringDisplay(String string) {
		this.string = string;
		len = string.getBytes().length;
	}

	@Override
	public void open() {

		printLine();
	}

	@Override
	public void print() {
		System.out.println(string);

	}

	@Override
	public void close() {
		printLine();
	}

	public void printLine() {
		System.out.print("+");
		for (int i = 0; i < len; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

}
