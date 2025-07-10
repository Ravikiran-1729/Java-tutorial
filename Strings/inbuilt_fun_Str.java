import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class inbuilt_fun_Str {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "Ravi";
        String subname = "Kiran";


        concanate(name, subname);
        Substring(name);


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
        System.out.println("Char At "+index+" in "+name+" is :- "+name.charAt(index));
    }


    //Compares two strings lexicographically.
    public static void CompareStr(String name1, String name2){
        name1.compareTo(name2);

        if (name1.compareTo(name2)==0){
            System.out.println("Strings are Equal");
        }else if (name1.compareTo(name2)>0){
            System.out.println("First String larger than Second i.e "+ name1+"> "+name2);
        }else{
            System.out.println("Second String larger than Firsti.e "+ name2+"> "+name1);
        }
    }

    public static void Substring(String name){
        String subStr = name.substring(0,2);
        System.out.println("Substring is :- " + subStr);
    }
}
