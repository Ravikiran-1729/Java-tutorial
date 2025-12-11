import java.io.File;

public class OperationFile {
    public static void main(String[] args) {
        File myObj = new File("demo.txt");
        
        System.out.println("File name :- " + myObj.getName());
        System.out.println("File location :- " + myObj.getAbsolutePath());
        System.out.println("File length :- " + myObj.length());
        System.out.println("is file readable :- " + myObj.canRead());
        System.out.println("is file writable :- " + myObj.canWrite());
        System.out.println("is file exists :- " + myObj.exists());
        System.out.println("is file :- " + myObj.isFile());

    }
}
