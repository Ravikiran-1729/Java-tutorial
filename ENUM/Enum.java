
enum level {
    LOW,
    MEDIUM,
    HIGH
}



public class Enum {
    public static void main(String[] args) {
        level myVar = level.LOW;
        System.out.println(myVar);

        for(level myLevel : level.values()){
            System.out.println(myLevel);
        }
    }
}
