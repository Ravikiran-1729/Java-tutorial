import java.util.Scanner;

public class linear_search_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int Marks[] = new int[size];

        for(int i = 1; i<=size; i++){
            System.out.print("enter " +i+"th element :-");
            Marks[i-1] = sc.nextInt();
        }
        printArray(Marks);
        
        System.out.print("\nEnter x to search in array:- ");
        int x = sc.nextInt();

        Linear_search(Marks, x);
    }
    public static void printArray(int marks[]){
        System.out.println();
        System.out.print("Array of Marks is :- ");
        for(int i = 0; i<marks.length; i++){
            System.out.print(marks[i]+"  ");
        }
    }
    public static void Linear_search(int marks[], int x){
        System.out.println("Finding......");
        for(int i = 0; i<marks.length; i++){
            if(marks[i] == x){
                System.out.println(x+" found at index "+i);
            }
        }
    }
}
