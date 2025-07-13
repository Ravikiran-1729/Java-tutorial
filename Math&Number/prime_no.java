import java.util.*;

public class prime_no {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :- ");
        int a = sc.nextInt();

        if(isPrime(a)){
            System.out.println(a + "is Not a prime number");
        }else{
            System.out.println(a+"is a prime number");
        }

        sc.close();

    }



    public static boolean isPrime(int a){
        if(a<=1){
            return false;
        }
        for(int i = 2; i<= Math.sqrt(a); i++){
            if(a % i == 0){
                return true;
            }
        }
        return false;
    }
}
