import java.util.ArrayList;
import java.util.Arrays;

public class SubsetSumDivisiblyBYK_arr {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));   
        int k = 5;

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        subsetSumDivisible_k(list, k, 0, new ArrayList<>(), 0, result);

        System.out.println("Subsets divisible by " + k + " = " + result); 
        System.out.println("Count of subsets divisible by " + k + " = " + result.size());

    }

    public static void subsetSumDivisible_k(ArrayList<Integer> list, int k, int idx, ArrayList<Integer> curr_sublist, int curr_sum, ArrayList<ArrayList<Integer>> result){
        if(idx == list.size()){
            if(!curr_sublist.isEmpty() && curr_sum % k == 0){
                result.add(new ArrayList<>(curr_sublist));
            }
            return;
        }
        curr_sublist.add(list.get(idx));
        subsetSumDivisible_k(list, k, idx+1, curr_sublist, curr_sum+list.get(idx), result);

        curr_sublist.remove(curr_sublist.size()-1);
        subsetSumDivisible_k(list, k, idx+1, curr_sublist, curr_sum, result);
    }


}
