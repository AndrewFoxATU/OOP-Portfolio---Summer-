package ie.atu;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class PrintWriter1 {

    public static void main(String[] args) {

        String fileName = "File13.txt";
        File myFile = new File(fileName);
        String data = "Test File String2";

        try {
            PrintWriter output =  new PrintWriter(new FileWriter(fileName, true));

            output.print(data);
            System.out.println("String created successfully at " + myFile.getAbsolutePath());
            output.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

    }

}