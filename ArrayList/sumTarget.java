import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class sumTarget {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(-1, 0, 0, 1, 2, 2, 3, 13));
        
        System.out.println("Result ArrayList :- "+list1);
        int target = 1;
        
        // ArrayList<Integer> idx = idxArray(list1, target);
        ArrayList<Integer> idx = idx_HashMap(list1, target);
        
        if(!(idx.isEmpty())){
            System.out.println(idx);
            return;
        }
        System.out.println("No choice Found..?");
    }

    //Basic Iteration and .contains & .indexOf methods ---Time complexity :- O(n square) for .contain O(n) & for .indexOf O(n) overall O(n square)
    public static ArrayList<Integer> idx_Array(ArrayList<Integer> list, int target){
        for(int i = 0; i<list.size(); i++){
            int need = target - list.get(i);
            if(list.contains(need)){
                return new ArrayList<>(Arrays.asList(i, list.indexOf(need)));
            }
        }
        return new ArrayList<>();
        
    }

    //Using Hashmap where time complexity is O(n) ( Advance )
    public static ArrayList<Integer> idx_HashMap(ArrayList<Integer> list, int target){
        HashMap<Integer, Integer> seen = new HashMap<>();
        for(int i = 0; i<list.size(); i++){
            int x = list.get(i);
            int need = target - x;
            Integer j = seen.get(need);
            if(j != null){
                return new ArrayList<>(Arrays.asList(j, i));
            }
            seen.putIfAbsent(x, i);
        }
        return new ArrayList<>();
    }


}
