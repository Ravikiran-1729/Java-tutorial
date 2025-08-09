// Find the length of the longest subarray with sum ≤ k (non-negative integers).

import java.util.ArrayList;
import java.util.Arrays;

public class longestSubarraySumEqK {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int k_sum = 14;
        ArrayList<Integer> longest = new ArrayList<>();

        subArrayLists(list, 0, k_sum, new ArrayList<>(), 0,  longest);
        
        System.out.println("Longest subarray with sum ≤ "+ k_sum + " is :- " + longest);
        System.out.println("Length of longest subarray with sum ≤ "+ k_sum + " is :- " + longest.size());
    }



    public static void subArrayLists(ArrayList<Integer> list, int idx, int sum, ArrayList<Integer> curr_subList, int curr_sum, ArrayList<Integer> longest){
        if(idx == list.size()){
            if(curr_sum == sum && longest.size() <= curr_subList.size()){
                longest.clear();
                longest.addAll(curr_subList);
            }
            return;
        }
        curr_subList.add(list.get(idx));
        subArrayLists(list, idx+1, sum, curr_subList, curr_sum+list.get(idx), longest);

        curr_subList.remove(curr_subList.size()-1);
        subArrayLists(list, idx+1, sum,  curr_subList, curr_sum, longest);
    }
}
