package adapterTest;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		FileIO f=new FileProperties();
		try {
			f.readFromFile("F:/JAVA/adapterTest/src/adapterTest/file.txt");
			String out=f.getValue("year");
			System.out.println(out);
			f.setValue("year", "2004");
			f.setValue("month", "4");
			f.setValue("day", "21");
			f.writeToFile("F:/JAVA/adapterTest/src/adapterTest/newFile.txt");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
