import java.io.File;
import java.io.FileWriter;


public class WriteFile {
    public static void main(String[] args) {
        

        try (FileWriter myObj = new FileWriter("demo.txt")) {
            myObj.write("this is a demo file.");
            System.out.println("File has been wrote!");
        } catch (Exception e) {
            System.out.println("Error : "+e);
            e.printStackTrace();
        }
    }
}
