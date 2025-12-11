import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("demo.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
