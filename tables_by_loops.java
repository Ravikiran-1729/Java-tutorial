import java.util.*;

public class tables_by_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       // for(int Counter = 1; Counter < 11; Counter++)
        //{
            //System.out.print(n*Counter);
        //}
        for(int Counter = 1; Counter < 11; Counter++)
        {
            System.out.println(n*Counter);
        }
        //for(int Counter = 1; Counter < 11; Counter++)
        //{
           // System.out.print(n*Counter+" ");
        //}
        sc.close();
    }
}
            //all three are gives diff output 
            //1st print in in row with no space bet two no. due to 'print'
            //2nd print in column due to println
            //3rd print in row with space bet two no. due to 'print' and space due to (+" ")
            //counter will be represented as "i" also