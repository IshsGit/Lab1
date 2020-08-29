import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class Data {
	
	/** reading()
	 * Method to read a file to test list.txt and format that txt as a list in format data 1.txt
	 */
	public void reading() throws IOException {
		
		// Variable Declaration
		String data;
		int count = 0;
		File file1 = new File("Format Data 1.txt"); 
		FileWriter newFile = new FileWriter(file1);	
		File myReader = new File("test list.txt"); 
		Scanner sc = new Scanner(myReader);
		
		// do-while loop, code block to process formatting
		try {
		do {
			// Reading test list.txt
		    data = sc.nextLine(); 
		   // Pulling COUNTRY and Value from test list.txt
			if(count>25) {
			if(data.contains("COUNTRY")) { 
				System.out.print(data);
				newFile.write(data); // Write formatted list to format data 1.txt
			}
			if(data.contains("Value")) {
				System.out.print(data + "\n");
				newFile.write(data);
			}
			}
			count++; 
		} while(count!=1000); 
		} catch(Exception e) {
			System.out.print("");
		}
		newFile.close();
		sc.close();
	}
	
	/** reading2()
	 * Method to read a file to test list 2.txt and format that txt as a list in format data 2.txt
	 */
	public void reading2() throws IOException {
		
		// Variable Declaration
		String data;
		int count = 0;
		File file2 = new File("Format Data 2.txt");
		FileWriter newFile = new FileWriter(file2);
		File myReader = new File("test list 2.txt");
		Scanner sc = new Scanner(myReader);
		
		// do-while loop, code block to process formatting
		try {
		do {
			// Reading test list.txt
			data = sc.nextLine();
			 // Pulling country and Value from test list 2.txt
			if(count>0) {
				if(data.contains("country"))
				System.out.println(data); // Print test list 2 to output
			}
			count++;	
		} while(count!=9999);
		} catch(Exception e) {
			System.out.print("");
		}
		sc.close();
	}
	
	public static void main(String[] args) throws IOException { 
		
		// Variable Declaration
		int o;
		Data dataobj = new Data();
		Scanner sc = new Scanner(System.in);
		System.out.println("Which file would you like read? " + "||" + "1 for file 1 or enter 3 to terminate");
		o = sc.nextInt();
		while(o<3) {
		switch(o) {
		case 1: 
			System.out.println("Who data extract 1");
			dataobj.reading();
			break;
		case 2:
			System.out.println("Who data extract 2");
			dataobj.reading2();
			break;
		}
		System.out.println("\n" + "Which file would you like read? " + "||" + " Or enter 3 to terminate");
		o = sc.nextInt();
	}
	}
}
