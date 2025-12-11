import java.io.FileWriter;


public class AppendFile {
    public static void main(String[] args) {
        try (FileWriter myObj = new FileWriter("demo.txt", true)) {
            myObj.write("They there how are you");
            System.out.println("File appended successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
