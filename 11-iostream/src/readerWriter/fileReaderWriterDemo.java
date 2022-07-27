package readerWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileReaderWriterDemo {
	
	public static void main(String[] args) throws IOException {
	
		FileReader fr = new FileReader("C:\\javafsd\\test1.txt");
		FileWriter fw = new FileWriter("C:\\javafsd\\test2.txt");
		
		int ch;
		while((ch=fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
		
	}

}
