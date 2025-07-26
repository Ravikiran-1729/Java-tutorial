import java.util.ArrayList;
import java.util.Iterator;

public class inBuildFunc {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add Elements
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);

        // Print ArrayList
        System.out.println(list);

        // Get Element by index
        int element = list.get(1);
        System.out.println(element);

        //Update or Modify Element by idx
        list.set(0, 1);
        System.out.println(list);

        //remove or delete element by idx
        list.remove(4);
        System.out.println(list);

        //Size pf the ArrayList 
        int size = list.size();
        System.out.println(size);

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int e = it.next();
            System.out.println(e);
            
            if(it.next() == 4){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
