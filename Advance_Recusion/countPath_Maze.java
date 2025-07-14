import java.util.Scanner;

public class countPath_Maze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n for rows :- ");
        int n = sc.nextInt();
        System.out.print("Enter m for columns:- ");
        int m = sc.nextInt();


        System.out.print("Enter ith location of Starting Position:- ");
        int i = sc.nextInt();
        System.out.print("Enter jth location of Starting Position:- ");
        int j = sc.nextInt();

        int totalPaths = countPathInMaze(n, m, i, j,"");
        System.out.println("Total Possible Paths to reach from ["+i+"]["+j+"] to "+"[" + (n-1) + "][" + (m-1) + "] are :- " + totalPaths);

        sc.close();
    }


    public static int countPathInMaze(int n, int m, int i, int j, String Steps){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            Steps+=Integer.toString(i)+Integer.toString(j);
            System.out.println(Steps);
            return 1;
        }
        int downPath = countPathInMaze(n, m, i+1, j, Steps+Integer.toString(i)+Integer.toString(j)+" -> ");
        int rightPath = countPathInMaze(n, m, i, j+1,Steps+Integer.toString(i)+Integer.toString(j)+" -> ");

        return downPath+rightPath;
    }
}
