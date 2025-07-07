import java.util.*;

public class pattern 
{
    //solid rectangle
    // * * * * * *
    // * * * * * *
    // * * * * * *
    // * * * * * *
    public static void main0(String[] args)
    {
        int n = 4;
        int m = 5;

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=m; j++)
            {
                System.out.print("*");
            }
           System.out.println();
        }
    }
    
    //hollow rectangle or boarder of rectamgle
    // * * * * * 
    // *       *
    // *       *
    // * * * * *
    public static void main1(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=1; i<=n; i++)
       {
            for(int j=1; j<=m; j++)
            {
               if(i==1 || j==1 || i == n || j == m)
               {
                  System.out.print("*"+" ");
               }else
               {
                  System.out.print(" "+" ");
               }
            }System.out.println();
        }
        sc.close();
    }
    
    //half peramid 
    //*
    //* *
    //* * *
    //* * * *
    public static void main2(String[] args) 
    {
        int n = 4;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    //Inverted Half Peramid
    //* * * *
    //* * *
    //* *
    //* 
    public static void main3(String[] args) 
    {
        int n = 4;
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    //Inverted Half Peramid
    //* * * *
    //* * *
    //* *
    //* 
    public static void main4(String[] args)
    {
        int n = 4;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    //Inverted Half Peramid
    //          *
    //        * *
    //      * * *
    //    * * * *
    //  * * * * *
    public static void main5(String[] args)
    {
        int n = 4;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" "+" ");
            }
            for(int j=1; j <= i; j++)
            {
                System.out.print("*"+" ");
            }
          System.out.println();  
        }
    }

    //Piramid
    //   *
    //  * *
    // * * *
    //* * * *
    public static void main6(String[] args)
    {
        int n = 4;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j <= i; j++)
            {
                System.out.print("*"+" ");
            }
          System.out.println();  
        }
    }

//Inverted Half Peramid (180 degree)
    // * * * * *
    //   * * * *
    //     * * *
    //       * *   
    //         * 
    public static void main7(String[] args)
    {
        int n = 4;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<i; j++)
            {
                System.out.print(" "+" ");
            }
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    //Inverted Peramid
    // * * * * * 
    //  * * * *
    //   * * * 
    //    * *
    //     *
    public static void main8(String[] args)
    {
        int n = 4;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    //no. in Half Peramid
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    public static void main9(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
         sc.close();
    }

    //Inverted No. Peramid
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
    public static void main10(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }

    //Inverted No. Peramid
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
    public static void main11(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }

    //Serially No. Peramid
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 
    public static void main12(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 1;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
        sc.close();
    }

    //Peramid of 1 & 0
    // 1
    // 0 1 
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1
    public static void main13(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
            {
                int sum = i+j;
                if(sum%2 == 0)
                {
                    System.out.print("1"+" ");
                }else
                {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }sc.close();
    }

    //Buterfly pattern
    // *             *
    // * *         * *
    // * * *     * * *
    // * * * * * * * *
    // * * * * * * * *
    // * * *     * * *
    // * *         * *
    // *             *
    public static void main14(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //upper half
        for(int i=1; i<=n; i++)
        { 
            //1st part
            for(int j=1; j<=i; j++)
            {
                System.out.print("*"+" ");
            }
            //spaces
            int space = 2*(n-i);
            for(int j=1; j<=space; j++)
            {
                System.out.print(" "+" ");
            }
            //2nd part
            for(int j=1; j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        //lower half
        for(int i=n; i>=1; i--)
        { 
            //1st part
            for(int j=1; j<=i; j++)
            {
                System.out.print("*"+" ");
            }
            //spaces
            int space = 2*(n-i);
            for(int j=1; j<=space; j++)
            {
                System.out.print(" "+" ");
            }
            //2nd part
            for(int j=1; j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    //
    //       * * * *
    //     * * * *
    //   * * * *
    // * * * *
    public static void main15(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

        for(int i=1; i<=n; i++)
        {
            //space
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" "+" ");//+" " => is for clearification or looking separate
            }
            //stars in rhombus
            for(int j=1; j<=n; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    //Hollow Rhombus
    //       * * * *
    //     *     *
    //   *     *
    // * * * *
    public static void main16(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        for(int i=1; i<=n; i++)
        {
            //space
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" "+" ");
            }
            //stars at border
            for(int j=1; j<=n; j++)
            {
                if(i==1 || j==1 || i==n || j==n)
                {
                    System.out.print("*"+" ");
                } else
                {
                    System.out.print(" "+" ");
                }

            }
            System.out.println();
            
        }
        sc.close();
    }
    //No. Peramid
    //    1
    //   2 2
    //  3 3 3
    // 4 4 4 4
    public static void main17(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        for(int i=1; i<=n; i++)
        {
            //spaces
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            //no.
            for(int j=1; j<=i; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    //Palindromic Pattern
    //         1 
    //       2 1 2
    //     3 2 1 2 3
    //   4 3 2 1 2 3 4
    // 5 4 3 2 1 2 3 4 5
    public static void main18(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" "+" ");
            }
            for(int j=i; j>=1; j--)
            {
                System.out.print(j+" ");
            }
            for(int j=2; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
    //Diamand
    //       *
    //     * * *
    //   * * * * *
    // * * * * * * * 
    // * * * * * * *
    //   * * * * *
    //     * * *
    //       *
    public static void main19(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" "+" ");
            }
            for(int j=1; j<=2*i-1; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" "+" ");
            }
            for(int j=1; j<=2*i-1; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    //Diamand
    //       *
    //     * * *
    //   * * * * *
    // * * * * * * * //this line is printed double in above code & once in this code(THIS IS MINOR DIFF)
    //   * * * * *
    //     * * *
    //       *
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" "+" ");
            }
            for(int j=1; j<=2*i-1; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--)///////////////////////CHANGE IS HERE. THIS CODE IS DIFF FROM ABOVE (i=n) AND HERE (i=n-1) is present. due to it minor diff bet diamand 

        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" "+" ");
            }
            for(int j=1; j<=2*i-1; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }

    
}