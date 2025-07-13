// ALWAYS REMEMBER : Java Strings are Immutable.
// 1. Once a String object is created, its value cannot be changed.
// 2. Any operation that seems to modify a string actually creates a new string object.



import java.util.Scanner;



public class inbuilt_fun_Str {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        String name = "Ravi";

        String subname = "Kiran";
        concanate(name, subname);
        Substring(name);


        String Sentence = "I am GXCoder";
        System.out.print("Enter index to search charAt :- ");
        int index = sc.nextInt();
        charAtIndex(Sentence, index);


        //Compares two strings lexicographically.
        String name1 = "z";
        String name2 = "mz";
        CompareStr(name1, name2);

        
        String str = "1729";
        int str_2_no = parseInt(str);
        System.out.println(str + " is (String) converted into integer "+ str_2_no);


        int number = 1729;
        String no_2_String = Tostring(number);
        System.out.println(number + " is (Int) converted into String " + no_2_String);

        sc.close();
    }


    // Return Concanate Stings
    // Format :- "String_name1 + String_name2"
    public static void concanate(String name, String subname){
        String Fullname = name + subname;
        String FullName = name.concat(subname);
        System.out.println(Fullname);
        System.out.println(FullName);
    }



    // Gives Character at Index of String
    // Format :- "String_name.charAt(index)"
    public static void charAtIndex(String name, int index){
        if(index >= name.length()){
            System.err.println("Index out of bound");
            return;
        }
        System.out.println("Char At "+index+" in "+name+" is :- "+name.charAt(index));
    }



    //Compares two strings lexicographically.
    public static void CompareStr(String name1, String name2){
        if(name1.equals(name2)){
            System.out.println("Strings are Equal");
            return;
        }

        if (name1.compareTo(name2)==0){
            System.out.println("Strings are Equal");
        }else if (name1.compareTo(name2)>0){
            System.out.println("First String larger than Second lexicographically i.e "+ name1+"> "+name2);
        }else{
            System.out.println("Second String larger than First lexicographically i.e "+ name2+"> "+name1);
        }
    }



    // Gives Substring from main string.
    // Format  "Sting_name.substring(beginIndex, endIndex);""
    public static void Substring(String name){
        String subStr = name.substring(0,2);
        System.out.println("Substring is :- " + subStr);
    }



    // Convert String (primitive data type) to Int
    // Format "Integer.parseInt(str_name);"
    public static int parseInt(String str){
        return Integer.parseInt(str);
    }



    // Convert Int (primitive data type) to String
    // Format "Integer.toString(int_name);"
    public static String Tostring(int number){
        return Integer.toString(number);
    }
}
