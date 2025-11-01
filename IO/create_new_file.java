import java.io.File;
import java.io.IOException;
import java.util.*;
public  class create_new_file {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            if(myObj.createNewFile()){
                System.out.println("File Created Successfully :-" + myObj.getName());
            }else{
                System.out.println("File Already Exist");
            }
        } catch(IOException e){
            System.out.println("Error Get Occured");
            e.printStackTrace();
        }
    }
    
}

