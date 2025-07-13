import java.util.*;

class age_if_else 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age:- ");
        int age = sc.nextInt();

        if(age > 18)
        {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }

        sc.close();

    }
}