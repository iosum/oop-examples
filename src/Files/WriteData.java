package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws FileNotFoundException {
        // create a file
        File file = new File("src/Files/test.txt");
        if(file.exists()) {
            System.out.println("file exists");
            System.exit(1);
        }

        // write formatted output to the file
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.print("Casey");
        printWriter.println("i love binfu");
        printWriter.print("rich");
        printWriter.println("has a girlfriend and break my heart");

        // close the file
        printWriter.close();
    }
}
