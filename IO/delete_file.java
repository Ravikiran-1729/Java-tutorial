import java.io.File;



public class delete_file {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        if(myObj.delete()){
            System.out.println("File Get Deleted :- "+ myObj.getName());
        }else{
            System.out.println("Failed to Delete File");
        }
    }
}
