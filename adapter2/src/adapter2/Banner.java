package adapter2;

public class Banner {

	private String string;
	public Banner(String string){
		this.string=string;
	}
	
	public void printWithParen(){
		System.out.println("("+string+")");
	}
	public void printWithAster(){
		System.out.println("*"+string+"*");
	}
}
