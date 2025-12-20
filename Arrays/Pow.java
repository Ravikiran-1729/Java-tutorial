public class Pow {

    // Function to calculate x raised to the power n (x^n)
    // Uses binary exponentiation (divide and conquer)
    private static double pow(double x, int n){

        // Base case: any number raised to power 0 is 1
        if(n == 0){
            return 1;
        }

        // Handle negative powers
        if(n < 0){

            // Special case to handle Integer.MIN_VALUE
            // Because -Integer.MIN_VALUE causes overflow
            // x^(-2^31) = 1 / (x * x^(2^31 - 1))
            if(n == Integer.MIN_VALUE){
                return 1 / (x * pow(x, -n + 1));
            }

            // General negative power case
            // x^(-n) = 1 / x^n
            return 1 / pow(x, -n);
        }

        // Recursively calculate power for n/2
        double half = pow(x, n / 2);

        // If n is even: x^n = (x^(n/2))^2
        if(n % 2 == 0){
            return half * half;
        }
        // If n is odd: x^n = x * (x^(n/2))^2
        else{
            return x * half * half;
        }
    }

    public static void main(String[] args) {

        // Test cases
        System.out.println(pow(3, 0));   // 1
        System.out.println(pow(3, 3));   // 27
        System.out.println(pow(3, -3));  // 0.037037...
    }
}
