// Generally Utility classes have only static methods, not even single attribute
class  Utility {

    private Utility(){}

    // Private Constructor class doesn't have Instance attributes & methods.
    // All Method & attributes must be static
    public static int add(int a, int b) {return a + b;}
    public static int subtract(int a, int b) {return a - b;}
    public static int multiply(int a, int b) {return a * b;}
    public static int divide(int a, int b) {return a / b;}

}


public class Private_Constructor {
    public static void main(String[] args) {
        int a = 100, b = 20;

        // Private Constructor restricts object creation.
        // Utility u = new Utility();

        int Addition = Utility.add(a, b);
        int Subtraction = Utility.subtract(a, b);
        int Multiplication = Utility.multiply(a, b);
        int Division = Utility.divide(a, b);


        System.out.println("Addition :- "+Addition);
        System.out.println("Subtraction :-"+Subtraction);
        System.out.println("Multiplication :- "+Multiplication);
        System.out.println("Division :- "+Division);
        
    }
}
