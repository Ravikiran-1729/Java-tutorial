// You can create a string using:
// 1. "String s = "Hello";"               // String literal  
// 2. "String s2 = new String("Hello");"  // Using constructor




import java.util.Scanner;

public class input_str{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String name = sc.next();  it take input of first token (after space get vanished and first token taken as input)
        
        String name = sc.nextLine();
        System.out.println("Your name is "+name);
    }
}