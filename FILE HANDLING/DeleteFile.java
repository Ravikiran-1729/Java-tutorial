import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File myObj = new File("demo.txt");
        try {
            if(myObj.delete()){
                System.out.println("File deleted Succefully :- "  + myObj.getName());
            }else{
                System.out.println("Error to delete the file :- " + myObj.getName());
            }
        } catch (Exception e) {
            System.out.println("Error :- "+e);
            e.printStackTrace();
        }
    }
}
