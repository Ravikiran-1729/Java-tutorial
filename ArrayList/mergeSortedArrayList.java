// Merge two sorted ArrayLists into one sorted ArrayList.

import java.util.ArrayList;
import java.util.Arrays;

public class mergeSortedArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(-1, 0, 0, 1, 2, 2, 3, 13));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(0, 5, 6, 6, 8, 9, 9, 42, 66, 66, 142));
        ArrayList<Integer> list3 = mergeSorted(list1, list2);

        System.out.println("first ArrayList :-  "+list1);
        System.out.println("Second ArrayList :- "+list2);
        System.out.println("Result ArrayList :- "+list3);
        
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>(list1.size() + list2.size());
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }
        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }
        return result;
    }

}
