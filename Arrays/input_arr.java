import java.util.Scanner;

public class input_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Size of array:- ");
        int size = sc.nextInt();

        int Marks[] = new int[size];

        //INPUT Marks Array
        for(int i = 1; i<=size; i++){
            System.out.print("enter " +i+"th element :-");
            Marks[i-1] = sc.nextInt();
        }
        
        printArray(Marks);
        
        sc.close();

    }



    public static void printArray(int marks[]){
        System.out.print("Array of Marks is :- ");
        for(int i = 0; i<marks.length; i++){
            System.out.print(marks[i]+"  ");
        }
    }
}
