
public class Basic_2_Advance_Patterns {
    public static void main(String[] args) { 
        Runnable[] patterns = {
            () -> pattern0(),
            () -> pattern1(),
            () -> pattern2(),
            () -> pattern3(),
            () -> pattern4(),
            () -> pattern5(),
            () -> pattern6(),
            () -> pattern7(),
            () -> pattern8(),
            () -> pattern9(),
            () -> pattern10(),
            () -> pattern11(),
            () -> pattern12(),
            () -> pattern13(),
            () -> pattern14(),
            () -> pattern15(),
            () -> pattern16(),
            () -> pattern17(),
            () -> pattern18(),
            () -> pattern19(),
            () -> pattern20()
        };
        for(int i = 0; i<21; i++){
            System.out.println("Pattern No "+i+" :- ");
            patterns[i].run();
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }






    // solid rectangle
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    public static void pattern0() {
        int n = 4;
        int m = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    // hollow rectangle or boarder of rectamgle
    // * * * * * *
    // *         *
    // *         *
    // * * * * * *
    public static void pattern1() {
        int n = 4;
        int m = 6;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }



    // half peramid
    // *
    // * *
    // * * *
    // * * * *
    public static void pattern2() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }



    // Inverted Half Peramid
    // * * * *
    // * * *
    // * *
    // *
    public static void pattern3() {
        int n = 4;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }



    // Inverted Half Peramid
    // * * * *
    // * * *
    // * *
    // *
    public static void pattern4() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }



    // Inverted Half Peramid
    //         *
    //       * *
    //     * * *
    //   * * * *
    // * * * * *
    public static void pattern5() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }



    // Piramid
    //    *
    //   * *
    //  * * *
    // * * * *
    public static void pattern6() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }



    // Inverted Half Peramid (180 degree)
    // * * * * *
    //   * * * *
    //     * * *
    //       * *
    //         *
    public static void pattern7() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }



    // Inverted Peramid
    //  * * * *
    //   * * *
    //    * *
    //     *
    public static void pattern8() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }



    // no. in Half Peramid
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    public static void pattern9() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }



    // Inverted No. Peramid
    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
    public static void pattern10() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }



    // Inverted No. Peramid
    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
    public static void pattern11() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }



    // Serially No. Peramid
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14
    public static void pattern12() {
        int n = 5;
        int number = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }



    // Peramid of 1 & 0
    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1
    public static void pattern13() {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }



    // Buterfly pattern
//      *             *
//      * *         * *
//      * * *     * * *
//      * * * * * * * *
//      * * * * * * * *
//      * * *     * * *
//      * *         * *
//      *             *
    public static void pattern14() {
        int n = 4;

        // upper half
        for (int i = 1; i <= n; i++) {
            // 1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            // spaces
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" " + " ");
            }
            // 2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }


        // lower half
        for (int i = n; i >= 1; i--) {
            // 1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            // spaces
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" " + " ");
            }
            // 2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }



    // Rhombus
    //       * * * *
    //     * * * *
    //   * * * *
    // * * * * 
    public static void pattern15() {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");// +" " => is for clearification or looking separate
            }
            // stars in rhombus
            for (int j = 1; j <= n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }



    // Hollow Rhombus
    //    * * * * * *
    //   *         *
    //  *         *
    // * * * * * *
    public static void pattern16() {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            // stars at border
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();

        }
    }



    // No. Peramid
    //    1
    //   2 2
    //  3 3 3
    // 4 4 4 4
    public static void pattern17() {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // no.
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }



    // Palindromic Pattern
    //         1
    //       2 1 2
    //     3 2 1 2 3
    //   4 3 2 1 2 3 4
    // 5 4 3 2 1 2 3 4 5
    public static void pattern18() {
        int n =  5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    // Diamand
    //              *
    //            * * *
    //          * * * * *
    //        * * * * * * *
    //        * * * * * * *
    //          * * * * *
    //            * * *
    //              *
    public static void pattern19() {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    // Diamand
    //              *
    //            * * *
    //          * * * * *
    //        * * * * * * *      this line is printed double in above code & once in this code(THIS IS MINOR DIFF)
    //          * * * * *
    //            * * *
    //              *
    public static void pattern20() {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = n- 1; i >= 1; i--)///////////////////////CHANGE IS HERE. THIS CODE IS DIFF FROM ABOVE (i=n) AND HERE (i=n-1) is present. due to it minor diff bet diamand 

        {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

}