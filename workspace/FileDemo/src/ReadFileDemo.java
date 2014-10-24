import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadFileDemo {
	public static void main(String [] args) {
		try {
			Scanner fileReader = new Scanner(new File("C:/Users/tkanchanawanchai6403/workspace/FileDemo/src/Test.txt"));
			System.out.println(fileReader.nextLine());
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print("Problem reading the file");
		}
	}
}
