import java.util.Scanner;
import java.io.*;

class TwoFiles {
	public static void main(String[] args) throws IOException {
		
		File file1 = new File("file1.txt");
		File file2 = new File("file2.txt");
		
		Scanner fileOne = new Scanner(file1);
		Scanner fileTwo = new Scanner(file2);

		PrintWriter new_file = new PrintWriter("file1-file2.txt");

		while (fileOne.hasNext() && fileTwo.hasNext()) {
    			String line1 = fileOne.nextLine();
    			String line2 = fileTwo.nextLine();
    
    			new_file.println(line1);
    			new_file.println(line2);
		};

		fileOne.close();
		fileTwo.close();
		new_file.close();
	}
}