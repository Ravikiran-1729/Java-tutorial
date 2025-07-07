import java.util.Scanner;

public class sum_ofOddNo {
    public static int sum_ofOddNo(int a){
        int sum = 0;
        int n;
        if(a%2==0){
            n = a-1; 
        }else{
            n = a;
        }
        for(int i = 1; i<=n; i = i+2){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println(sum_ofOddNo(a));
    }
}
