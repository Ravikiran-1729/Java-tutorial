import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

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
        

        //Iterator  [ITERATOR :- It is a tool which is used for over loop each and every element present in data structure like array, hashset]
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int e = it.next();
            if(e == 4){
                it.remove();
                continue;
            }
            System.out.println(e);
        }
        System.out.println(list);

        // Add at idx
        list.add(1, 4);
        System.out.println(list);

        // Sort ArrayList Using Collections framework
        Collections.sort(list);
        System.out.println(list);

        boolean isexists = list.contains(2);
        System.out.println(isexists);

        boolean isEmpty = list.isEmpty();
        System.out.println(isEmpty);

        boolean isEqual = list.equals(new ArrayList<>(java.util.Arrays.asList(1, 2, 3, 4)));
        System.out.println(isEqual);


        // clears or delete all elements in ArrayList
        list.clear();
    }
}
