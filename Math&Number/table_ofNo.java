import java.util.Scanner;

public class table_ofNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        table(a);

        sc.close();
    }



    public static void table(int a){
        for(int i = 1; i<=10; i++){
            System.out.println(a*i);
        }
    }
}
