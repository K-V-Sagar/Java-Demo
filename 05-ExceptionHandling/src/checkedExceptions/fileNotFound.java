package checkedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class fileNotFound {

	public static void main(String[] args) {
		try {
		FileInputStream obj = new FileInputStream("C:\\javafsd\\files\\test1.txt");
		}
		catch(FileNotFoundException e) {
		System.out.println("File not Found!!!");
		}
		finally {
		System.out.println("Close file here!");
		}
	}
}