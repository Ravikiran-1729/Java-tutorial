public class Final_Variables {
    final int speed = 39;

    void show(){

        // Cannot Assign a value to final variable
        /* 

        speed = 499;   

        */

        int speed = 393;  // local variable (Shadowing )
        System.out.println("Speed is :- "+speed);  // prints 393
    }

    public static void main(String[] args) {
        Final_Variables fv = new Final_Variables();
        fv.show();
    }
}
