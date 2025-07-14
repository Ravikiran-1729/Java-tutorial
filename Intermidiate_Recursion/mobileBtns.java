import java.util.Scanner;

public class mobileBtns {

    public static String [] keypad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Pressed Btn's on mobile :- ");
        String digitStr = sc.next();

        possibleCombinations(digitStr, 0, "");
    }

    public static void possibleCombinations(String dstr, int idx, String commbinations){
        if(idx == dstr.length()){
            System.out.println(commbinations);
            return;
        }

        char currdigt = dstr.charAt(idx);

        String kpadMapping = keypad[currdigt-'0'];    // '2'-'0' == 2   ->>  ie. keypad[2]= "def"

        // Alternative option for for loop:-
        // for(char ch : kpadMapping.toCharArray()){
        //     possibleCombinations(dstr, idx+1, commbinations+ch);
        // }

        for(int i = 0; i<kpadMapping.length(); i++){
            possibleCombinations(dstr, idx+1, commbinations+kpadMapping.charAt(i));
        }
    }
}
