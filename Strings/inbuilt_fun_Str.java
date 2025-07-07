import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class inbuilt_fun_Str {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "Ravi";
        String subname = "Kiran";


        concanate(name, subname);


        System.out.print("Enter index to search charAt :- ");
        int index = sc.nextInt();
        charAtIndex(subname, index);


        //Compares two strings lexicographically.
        String name1 = "z";
        String name2 = "mz";
        CompareStr(name1, name2);


    }

    public static void concanate(String name, String subname){
        String Fullname = name + subname;
        System.out.println(Fullname);
    }

    public static void charAtIndex(String name, int index){
        if(index >= name.length()){
            System.err.println("Index out of bound");
            return;
        }
        System.out.println(name.charAt(index));
    }


    //Compares two strings lexicographically.
    public static void CompareStr(String name1, String name2){
        name1.compareTo(name2);

        if (name1.compareTo(name2)==0){
            System.out.println("Strings are Equal");
        }else if (name1.compareTo(name2)>0){
            System.out.println("First String larger than Second");
        }else{
            System.out.println("Second String larger than First");
        }
    }
}
