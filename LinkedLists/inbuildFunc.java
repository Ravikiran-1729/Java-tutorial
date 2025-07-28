import java.util.LinkedList;

public class inbuildFunc {
    public static void main(String[] args) {
        //Declaration
        LinkedList<String> list = new LinkedList<>();

        // Add elements in LinkedList
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("list");

        // Add element at idx
        list.add(3, "linked");
        System.out.println(list);

        // Print LinkedList
        System.out.println(list);

        // Get element at idx
        String e = list.get(3);
        System.out.println(e);


        // Get index of element in linkedList
        int idx = list.indexOf("This");
        System.out.println("Index of 'This' is "+ idx);

        // remove first element
        list.removeFirst();
        System.out.println(list);
        
        // remove last element
        list.removeLast();
        System.out.println(list);
        
        // remove element at idx
        list.remove(1);
        System.out.println(list);

        LinkedList<String> listrev = list.reversed();
        System.out.println(listrev);
    }
}
