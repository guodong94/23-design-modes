package teamplateMethod;

public class Main {
	public static void main(String[] args) {
		AbstractDisplay ch=new CharDisplay('C');
		AbstractDisplay str=new StringDisplay("你好，世界！");
		
		ch.display();
		str.display();
		
	}

}
