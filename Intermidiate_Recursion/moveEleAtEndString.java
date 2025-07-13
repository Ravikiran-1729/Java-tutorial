import java.util.Scanner;

public class moveEleAtEndString {
    
    public static String newstr = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String:- ");
        String str = sc.nextLine();

        System.out.print("Enter a Character Element :- ");
        char element = sc.next().charAt(0);

        moveEleAtEnd(str, element, 0);

        sc.close();
    }

    //   axbc   4     
    //   abc    3

    public static void moveEleAtEnd(String str, char element, int idx){

        if(idx == str.length() && newstr.length() != str.length()){   //0 1 2 3 4
            for(int i = 0; i<str.length()-newstr.length(); i++){
                newstr += Character.toString(element);
            }
            System.out.println(newstr);
            return;
        }

        if(str.charAt(idx) != element){
            newstr += str.charAt(idx);
            // newstr += str.substring(idx,idx+1);
        }
        moveEleAtEnd(str, element, idx+1);
    }
}
