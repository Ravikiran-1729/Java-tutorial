import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String revString = revString(str, str.length()-1);


        System.out.println("Reversed String :-"+revString);

        sc.close();
    }

    public static String revString(String str, int len) {
        if(len == 0){
            return String.valueOf(str.charAt(len));
        }
        return str.charAt(len) + revString(str, len-1);
    }
}
