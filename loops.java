import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
//1st loop FOR LOOP
//this loop print output when the all conditions wiil be satisfied otherwise it doesn't print at least one lettr too
//if we change the condition "counter < 11;" to "counter > 11;" then nothing is print in output 
        for(int Counter = 1; Counter < n; Counter++) //for(intializer; condition; updation)
        {
            System.out.println(Counter); 
        }
//2nd loop WHILE LOOP
//this loop print output when the all conditions wiil be satisfied otherwise it doesn't print at least one lettr too
//if we change the condition "i < 11;" to "i > 11;" then nothing is print in output 

        int i = 0;        //initializer
        while(i < n)     //condition
        {
            System.out.println(i);
            i++;          //updater
        }
//3rd loop DO WHILE LOOP
//this loop print output at least one i.e, "intialisation" means for below "i = 1" without watching the condition if condition is not satisfied then also initializer will be print ie. 1 on output
//if we change the condition "counter < 11;" to "counter > 11;" then 1 i.e, we defined intializer will be print in output 

        i = 1;                 //initializer
        do 
        { 
            System.out.print(i+" ");
            i++;              //updater
        } while (i < n);     //condition
    }
}
