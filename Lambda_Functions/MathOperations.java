// . Elaborate Lambda Expressions and Functional Interfaces 
// A. Create a Functional Interface MathOperation with a method int operate(int a, int b). 
// B. Use Lambda Expressions to define: a.Addition b. Subtraction c. Multiplication d. Division
//  C. Create a method that accepts two integers and a MathOperation and returns the result

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

class MathOperations {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> {return a + b;};
        MathOperation divide = (a, b) -> {return a / b;};
        MathOperation sub = (a, b) -> {return a-b;};
        MathOperation mul = (a, b) -> {return a * b;};

        result(10, 10, add);
        result(10, 10, sub);
        result(10, 10, mul);
        result(10, 0, divide);
    }

    public static void result(int a, int b, MathOperation op){
        try {
            System.out.println("result is :- "+ op.operate(a, b));
        } catch (Exception e) {
            System.out.println("MATHEMATICAL ERROR OCCURED :- "+ e);
        }

    }
}