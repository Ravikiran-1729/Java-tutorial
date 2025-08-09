// Count subarrays with sum exactly k (array may contain negative numbers).

import java.util.ArrayList;
import java.util.Arrays;

public class allSubArraylistSumEqK {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int k_sum = 8;
        ArrayList<ArrayList<Integer>> SubArrays_SumEqK = new ArrayList<>();

        subArrayLists(list, 0, k_sum, new ArrayList<>(), 0,  SubArrays_SumEqK);
        
        System.out.println("Subarrays with sum exactly "+ k_sum + " is :- " + SubArrays_SumEqK);
        System.out.println("Count of subarrays with sum exactly "+ k_sum + " is :- " + SubArrays_SumEqK.size());
    }



    public static void subArrayLists(ArrayList<Integer> list, int idx, int k_sum, ArrayList<Integer> curr_subList, int curr_sum, ArrayList<ArrayList<Integer>> SubArrays_SumEqK){
        if(idx == list.size()){
            if(curr_sum == k_sum){
                SubArrays_SumEqK.add(new ArrayList<>(curr_subList));
            }
            return;
        }
        curr_subList.add(list.get(idx));
        subArrayLists(list, idx+1, k_sum, curr_subList, curr_sum+list.get(idx), SubArrays_SumEqK);

        curr_subList.remove(curr_subList.size()-1);
        subArrayLists(list, idx+1, k_sum,  curr_subList, curr_sum, SubArrays_SumEqK);
    }
}
