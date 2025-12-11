import java.io.File;
import java.io.IOException;

public class Createfile {
    public static void main(String[] args) {
        try {
            File myObj = new File("demo.txt");
        
            if(myObj.createNewFile()){
                System.out.println("File Created Successfully");
            }else{
                System.out.println("error");
            }
        } catch (IOException e) {
            System.out.println("Error :");
            e.printStackTrace();
        }
        
    }
}
