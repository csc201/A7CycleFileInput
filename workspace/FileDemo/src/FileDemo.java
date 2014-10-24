import java.io.File;


public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File aFile = new File("Test.txt");
		System.out.println(aFile.isDirectory());
		System.out.println(aFile.getAbsolutePath());
		System.out.println(aFile.getPath());
		System.out.println(aFile.getName());
		System.out.println(aFile.canRead());
	}

}
