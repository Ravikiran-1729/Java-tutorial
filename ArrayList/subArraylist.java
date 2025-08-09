// Find all subarrays of the arraylist

import java.util.ArrayList;
import java.util.Arrays;

public class subArraylist {
    public static ArrayList<ArrayList<Integer>> subLists = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        subArrayLists(list, 0, new ArrayList<>());
        
        System.out.println("ArrayList :- "+ list);
        System.out.println("All Possible SubArraylists are :- "+subLists.size());
        System.out.println(subLists);

    }

    public static void subArrayLists(ArrayList<Integer> list, int idx, ArrayList<Integer> subList){
        if(idx == list.size()){
            subLists.add(new ArrayList<>(subList));
            return;
        }
        subList.add(list.get(idx));
        subArrayLists(list, idx+1, subList);

        subList.remove(subList.size()-1);
        subArrayLists(list, idx+1, subList);
    }



}
