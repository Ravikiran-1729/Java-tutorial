import java.util.Scanner;

public class SB_declaration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("HELLo");
        System.out.println("Default StringBuilder is "+sb);


        StringBuilder sb1 = new StringBuilder(sc.nextLine());
        System.out.println("User Entered StringBuilder is "+sb1);

        sc.close();
    }
}
