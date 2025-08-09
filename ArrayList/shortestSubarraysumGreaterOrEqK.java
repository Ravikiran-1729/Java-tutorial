// Find the minimal length of a subarray with sum ≥ target (positive integers).

import java.util.ArrayList;
import java.util.Arrays;

public class shortestSubarraysumGreaterOrEqK {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int k_sum = 5;
        ArrayList<Integer> shortest = new ArrayList<>();

        subArrayLists(list, 0, k_sum, new ArrayList<>(), 0,  shortest);
        
        System.out.println("Shortest subarray with sum >= "+ k_sum + " is :- " + shortest);
        System.out.println("Length of shortest subarray with sum >= "+ k_sum + " is :- " + shortest.size());
    }



    public static void subArrayLists(ArrayList<Integer> list, int idx, int k_sum, ArrayList<Integer> curr_subList, int curr_sum, ArrayList<Integer> shortest){
        if(idx == list.size()){
            if(curr_sum >= k_sum ){
                if(shortest.size() == 0){
                    shortest.addAll(curr_subList);
                }else if(shortest.size() >= curr_subList.size()){
                    shortest.clear();
                    shortest.addAll(curr_subList);
                }
            }
            return;
        }
        curr_subList.add(list.get(idx));
        subArrayLists(list, idx+1, k_sum, curr_subList, curr_sum+list.get(idx), shortest);

        curr_subList.remove(curr_subList.size()-1);
        subArrayLists(list, idx+1, k_sum,  curr_subList, curr_sum, shortest);
    }
}
