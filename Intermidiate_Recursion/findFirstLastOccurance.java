import java.util.Scanner;

public class findFirstLastOccurance {

    public static int first = -1;
    public static int last = -2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String :-");
        String str = sc.nextLine();

        System.out.print("Enter element to find Occurance:- ");
        char element = sc.next().charAt(0);
    

        findFirstLastOcc(str,0, element);
        
        sc.close();
    }

    public static void findFirstLastOcc(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println("First Occurance of character "+element+" is at index "+first);
            System.out.println("last Occurance of character "+element+" is at index "+last);
            return;
        }

        if(str.charAt(idx) == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }

        findFirstLastOcc(str,idx+1,element);
    }
}
