import java.util.Scanner;

public class linear_search_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        int Marks[] = new int[size];

        // INPUT Marks Array
        for(int i = 1; i<=size; i++){
            System.out.print("enter " +i+"th element :-");
            Marks[i-1] = sc.nextInt();
        }

        printArray(Marks);

        Linear_search(sc, Marks);

        sc.close();
    }



    public static void printArray(int marks[]){
        System.out.println();
        System.out.print("Array of Marks is :- ");
        for(int i = 1; i<=marks.length; i++){
            System.out.print(marks[i-1]+"  ");
        }
    }



    public static void Linear_search(Scanner sc, int marks[]){
        System.out.print("\nEnter x to search in array:- ");
        int x = sc.nextInt();

        System.out.println("Finding......");
        for(int i = 1; i<=marks.length; i++){
            if(marks[i-1] == x){
                System.out.println(x+" found at index "+i);
            }
        }
    }
}
