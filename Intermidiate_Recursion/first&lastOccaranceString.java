import java.util.Scanner;

public class FirstLastOccurrenceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String :-");
        String str = sc.nextLine();

        findFirstLastOcc(str, -1, -1, str.length()-1);

    }

    public static void findFirstLastOcc(String str, int first, int last, int len){
        char a = 'a';

        if(len < 0){
            return;
        }

        if(str.charAt(len) == a){
            if(first == -1){
                first = len;
                System.out.println(first);
            }else{
                last = len;
            }
        }

        findFirstLastOcc(str,first,last,len-1);
        System.out.println(last);
    }
}
