package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws FileNotFoundException {
        // create a file
        File file = new File("src/Files/test.txt");

        // create a Scanner
        Scanner input = new Scanner(file);

        // read data from the file
        while(input.hasNext()){
            String firstName = input.nextLine();
            String comment = input.nextLine();
            String lineSeparator = System.getProperty("line.separator");
            System.out.println(lineSeparator);
            System.out.println(firstName + " " + comment);
        }

        // close the file
        input.close();
    }

}
