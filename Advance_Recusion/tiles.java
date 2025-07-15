import java.util.Scanner;

public class tiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n of N*M floor :- ");
        int n = sc.nextInt();

        System.out.print("Enter m of N*M floor :- ");
        int m = sc.nextInt();

        int Ways = placeTiles(n, m);
        System.out.println("Possible ways to place 1*M tiles on the floor of N*M dimentions are :- "+Ways);

        sc.close();
    }

    public static int placeTiles(int n, int m){
        if(n == m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vertTiles = placeTiles(n-m, m);

        int horzTiles = placeTiles(n-1, m);

        return vertTiles + horzTiles;

        }
}
