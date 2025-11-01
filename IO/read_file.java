import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read_file {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        try (Scanner myScanner = new Scanner(myObj)){
            while (myScanner.hasNextLine()) {
                String data = myScanner.nextLine();
                System.out.println(data);
            }
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
            e.printStackTrace();
        }
    }
    
}
