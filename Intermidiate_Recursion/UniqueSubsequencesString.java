import java.util.HashSet;
import java.util.Scanner;

public class UniqueSubsequencesString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String:- ");
        String str = sc.next();

        HashSet<String> set = new HashSet<>();

        subsequences(str, 0, "", set);

        System.out.println(set);


        sc.close();
    }

    public static void subsequences(String str, int idx, String newStr, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newStr)){
                return;
            }else{
                set.add(newStr);
                System.out.println(newStr);
                return;
            }
        }
        char currChar = str.charAt(idx);
        // to be 
        subsequences(str, idx+1, newStr+currChar, set);


        // not to be 
        subsequences(str, idx+1, newStr, set);
    }
}
