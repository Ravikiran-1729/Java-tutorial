import java.util.Scanner;

public class reverseSubsequenceString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String:- ");
        String str = sc.next();
        reverseSubsequence(str, str.length()-1, "");
        sc.close();
    }



    public static void reverseSubsequence(String str, int idx, String newString){
        if(idx == 0){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        reverseSubsequence(str, idx-1, newString+currChar);
        
        reverseSubsequence(str, idx-1, newString);

    }
}
