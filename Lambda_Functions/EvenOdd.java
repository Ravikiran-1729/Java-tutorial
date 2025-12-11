@FunctionalInterface
interface EvenOddCheck{
    void check(int n);
}


public class EvenOdd {
    public static void main(String [] args){
        EvenOddCheck eo = (n) -> {
            System.out.println((n%2 == 0)? "Even" : "Odd");
        };

        eo.check(10);
    }
}
