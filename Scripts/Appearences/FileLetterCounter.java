import java.util.Scanner;
import java.io.*;

public class FileLetterCounter {
    public static void main(String[] args) throws IOException {

        String fileInput;
        char letterInput;
        String conjData = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter file name: ");
        fileInput = input.nextLine();

        System.out.print("Enter character to count: ");
        letterInput = input.next().charAt(0);

        File file = new File(fileInput);
        Scanner desFile = new Scanner(file);

        while (desFile.hasNext()) {
            String data = desFile.nextLine();
            conjData = conjData + data;
        }

        int count = 0;
        for (int i = 0; i < conjData.length(); i++) {
            if (conjData.charAt(i) == letterInput) {
                count++;
            }
            ;
        }
        ;
        System.out.println("The character " + "'" + letterInput + "'" + " appears in the file " + fileInput + " "
                + count + " times.");
        desFile.close();

    }
}