package bufferedReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class test {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\javafsd\\test1.txt");
		// buffered reader works on top of file reader
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		int count =0;
		while( (line=br.readLine()) != null) {
			
			StringTokenizer st = new StringTokenizer(line);
			while(st.hasMoreTokens()) {
				count++;
				st.nextToken();
				// or use
				//count += st.countTokens();
			}
		}
		fr.close();
		br.close();
		
		System.out.println("count of words in file : "+count);
		
		
		
	}
	
}
