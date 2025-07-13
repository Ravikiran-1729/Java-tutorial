import java.util.Scanner;

public class removeDuplicatesFromString {
    public static boolean[] map = new boolean[26];
    public static String newstr = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String:- ");
        String str = sc.next();

        removeDuplicateChar(str, 0);
        sc.close();
    }



    public static void removeDuplicateChar(String str, int idx){
        if(idx == str.length()){
            System.out.println("Unique String is :- "+ newstr);
            return;
        }
        
        char currChar = Character.toLowerCase(str.charAt(idx));

        if(map[currChar-'a']==true){
            removeDuplicateChar(str, idx+1);
        }else{
            newstr += currChar;
            map[currChar-'a'] = true;
            removeDuplicateChar(str, idx+1);
        }
    }
}
