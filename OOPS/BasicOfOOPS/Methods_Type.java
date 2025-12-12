public class Methods_Type {

    public static void StaticMethod(){
        System.out.println("This is Static Method");
    }

    public void InstanceMethod(){
        System.out.println("This is Instance Method");
    }

    // final method Never get overridden by subclass
    public final void FinalMethod(){
        System.out.println("This is Final Method");
    }

    // Abstract Method can only be defined in Abstract Class
    // abstract void AbstractMethod(); 
    
    // Used in Multithreading.
	// Only one thread can execute at a time.
    public synchronized void SynchronizedMethod(){
        System.out.println("This is Synchronized Method");
    }

    // Native class has No body
    // Method implemented in non-java languages like C/C++.
	// Declared using native keyword.
    public native void NativeMethod();
    

    // Getter & Setter Methods to access private attributes
    public void getterMethod(){
        System.out.println("this is Getter method");
    }

    public void setterMethod(){
        System.out.println("This is Setter Method");
    }
    public static void main(String[] args) {
        System.out.println("This is main method");
    }
}
