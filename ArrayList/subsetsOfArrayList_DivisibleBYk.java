// Count the number of subarrays whose sum is divisible by k.
import java.util.ArrayList;
import java.util.Arrays;

public class subsetsOfArrayList_DivisibleBYk {
    public static ArrayList<ArrayList<Integer>> subLists = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> SublistsDivisibleByK = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        subArrayLists(list, 0, new ArrayList<>());
        
        System.out.println("ArrayList :- "+ list);
        System.out.println("All Possible SubArraylists are :- "+subLists.size());
        System.out.println(subLists);

        int k = 9;
        int count = findSublistsDivisibleByK(k);

        System.out.println("\nNumber of subArrays whose sum is divisible by " + k + " are :- " + count);
        System.out.print(SublistsDivisibleByK);
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

    public static int findSublistsDivisibleByK(int k){
        int count = 0;
        for(int i = 0; i < subLists.size(); i++){
            ArrayList<Integer> subList = subLists.get(i);
            if(subList.isEmpty()) continue;
            int sum = 0; 

            for(int j = 0; j< subList.size(); j++){
                sum += subList.get(j);
            }

            if(sum > 0 && sum % k == 0){
                SublistsDivisibleByK.add(new ArrayList<>(subList));
                count++;
            }
        }

        return count;
    }

}
