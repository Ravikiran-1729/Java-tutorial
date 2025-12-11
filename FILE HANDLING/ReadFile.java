import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File myObj = new File("demo.txt");
        try (Scanner sc = new Scanner(myObj)) {
            
            while (sc.hasNextLine()) {     
                
                String data = sc.nextLine();
                System.out.println(data);
            }
        } catch (Exception e) {
            System.out.println("Error :- "+e);
            e.printStackTrace();
        }
    }
}
