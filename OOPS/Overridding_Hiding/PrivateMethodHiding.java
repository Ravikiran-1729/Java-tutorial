public class PrivateMethodHiding {

    private void prints(){
        System.out.println("Parent class");
    }
    public static void main(String[] args) {

        // Parent class reference -> child class object
        PrivateMethodHiding obj = new PrivateMethodHidingChild();
        // Calls parent's private method (Child class prints() method is NOT overriding, it just hide parent class print() method) 
        obj.prints();  // Parent Class


        // child class reference -> child class object
        PrivateMethodHidingChild obj1 = new PrivateMethodHidingChild();
        // Calls child class method
        obj1.prints();  // Child Class
    }
}


class PrivateMethodHidingChild extends PrivateMethodHiding{
    public void prints(){
        System.out.println("Child Class");
    }
}