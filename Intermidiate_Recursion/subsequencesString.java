import java.util.Scanner;

public class subsequencesString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String:- ");
        String str = sc.next();

        subsequences(str, 0, "");
        sc.close();
    }

    public static void subsequences(String str, int idx, String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        // to be 
        subsequences(str, idx+1, newStr+currChar);


        // not to be 
        subsequences(str, idx+1, newStr);
    }
}
