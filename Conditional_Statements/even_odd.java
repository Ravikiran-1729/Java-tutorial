import java.util.*;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number :- ");
        int a = sc.nextInt();

        if(iseven(a)){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        sc.close();
    }



    public static boolean iseven(int a){
        if(a<=1){
            return false;
        }else if (a%2 == 0) {
            return true;
        }else{
            return false;
        }
    }
}


