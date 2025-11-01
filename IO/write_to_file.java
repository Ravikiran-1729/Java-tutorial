import java.io.FileWriter;
import java.io.IOException;

public class write_to_file {
    public void write_file(){
        try(FileWriter myWriter = new FileWriter("filename.txt")){
            myWriter.write("Ravikiran Yavalkar");
            System.out.println("File Wrote Successfully");
        }catch(IOException e){
            System.out.println("Error Occured");
            e.printStackTrace();
        }
    }
    public void append_file(){
        try(FileWriter myWriter = new FileWriter("filename.txt", true)){ // true (append Mode on (true))
            myWriter.write(" is an Engineer.");
            System.out.println("File Appended Successfully");
        }catch(IOException e){
            System.out.println("Error Occured");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        write_to_file myObj = new write_to_file();
        myObj.write_file();
        myObj.append_file();
    }
}