import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriteFile {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("demo.txt", true))) {
            bw.write("HI THERE");
            bw.newLine();
            bw.write("Hi there how are you!");
            System.out.println("File appended!");
        } catch (Exception e) {
            System.out.println("Error :- "+e);
            e.printStackTrace();
        }
    }
}
