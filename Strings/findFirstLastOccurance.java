import java.util.Scanner;

public class findFirstLastOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String:- ");
        String str = sc.nextLine();

        System.out.print("Enter a character element :- ");
        char element = sc.next().charAt(0);

        int first = str.indexOf(element);
        int last = str.lastIndexOf(element);


        System.out.println("First Occurance of character " + element + " is at index " + first);
        System.out.println("last Occurance of character " + element + " is at index " + last);

        sc.close();
    }
}
