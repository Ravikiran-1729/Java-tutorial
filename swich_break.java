import java.util.*;

public class swich_break 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = sc.nextInt();
        int Month = sc.nextInt();

        //first give input for button as 1, 2, 3, ......
        //second give input for "a" as 1, 2, 3, .....
        //third give inut for "b" as 1, 2, 3, .....
        //forth give input for operation i.e, for case 1(add), for case 2(substract) as 1, 2, 3, .....
        //fifth give input for sr. no. of months i.e, 1(will get january), 2, 3, .....
        
        //first will get for 1 - Hello as so on
        //second will get answer of operation which we choose as 1 for add, 2 for substract, and so on
        //third will get name of month which we choose as 1 for january, 2 for february and so on

        //button
        switch(button) 
        {
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid button");
        }

        //CALCLULATOR
        switch (operator) 
        {
            case 1: System.out.println(a + b);
            break;
            case 2 : System.out.println(a - b);
            break;
            case 3 : System.out.println(a * b);
            break;
            case 4 : if(b == 0)
            {
                System.out.println("Invalid Operation");
            } else
            {
                System.out.println(a / b);
            }
            break;
            case 5 : if(b == 0)
            {
                System.out.println("Invalid Operation");
            } else
            {
                System.out.println(a % b);
            }
            break;
            default: System.out.println("Invalid Operation");
            break;
        }

        //SR. NO. & MONTHS
        switch (Month) 
        {
            case 1: System.out.println("January");
            break;
            case 2: System.out.println("February");
            break;
            case 3: System.out.println("March");
            break;
            case 4: System.out.println("April");
            break;
            case 5: System.out.println("May");
            break;
            case 6: System.out.println("June");
            break;
            case 7: System.out.println("July");
            break;
            case 8: System.out.println("August");
            break;
            case 9: System.out.println("September");
            break;
            case 10: System.out.println("October");
            break;
            case 11: System.out.println("November");
            break;
            case 12: System.out.println("December");
            break;
            default: System.out.println("Invalid Month");
            break;
        }
    }
}