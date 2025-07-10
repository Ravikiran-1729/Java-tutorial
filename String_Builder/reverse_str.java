import java.util.Scanner;

public class reverse_str {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String :- ");
        StringBuilder str = new StringBuilder(input.nextLine());

        reverse_str(str);

    }

    public static void reverse_str(StringBuilder str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int first = i;
            int back = str.length() - 1 - i;

            char firstChar = str.charAt(first);
            char backChar = str.charAt(back);

            str.setCharAt(first, backChar);
            str.setCharAt(back, firstChar);
        }

        System.out.println(str);

    }
}
