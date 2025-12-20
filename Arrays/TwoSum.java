import java.util.HashMap;

public class TwoSum {
/* 
| Approach             | Time     | Space    |
| -------------------- | -------- | -------- |
| Brute Force          | O(n²)    | O(1)     |
| Two Pointer (sorted) | O(n)     | O(1)     |
| HashMap              | **O(n)** | **O(n)** |
*/


    public static int[] twoSum_Brute(int[] nums, int target) {
        // Brute-force approach (commented)
        // Time: O(n^2)\
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
    
    public static int[] twoSum_TwoPointer(int[] nums, int target) {
        // Two-pointer approach (ASSUMES array is sorted)
        
        int left = 0;
        int right = nums.length - 1;

        while(left < right){

            // Calculate sum of elements at two pointers
            int sum = nums[left] + nums[right];

            // If target is found, return indices
            if(sum == target){
                return new int[]{left, right};
            }

            // If sum is greater than target, reduce the sum
            else if(sum > target){

                // Move the pointer which has the larger value
                if(nums[left] > nums[right]){
                    left++;
                }else{
                    right--;
                }
            }

            // If sum is smaller than target, increase the sum
            else{
                // Move the pointer which has the smaller value
                if(nums[left] < nums[right]){
                    left++;
                }else{
                    right--;
                }
            }
        }

        // If no pair is found
        return new int[]{-1, -1};
        
    }

    public static int[] twoSum_HashMap(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }

            int required = target - nums[i];


            map.put(required, i);
        }
        return new int[]{-1,-1};
    }


    

    public static void main(String[] args) {

        // Test input
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // -------- Brute Force --------
        int[] resultBrute = twoSum_Brute(nums, target);
        System.out.println("Brute Force Result:");
        printResult(resultBrute);

        // -------- Two Pointer (Sorted Array Required) --------
        // NOTE: nums is already sorted here
        int[] resultTwoPointer = twoSum_TwoPointer(nums, target);
        System.out.println("Two Pointer Result:");
        printResult(resultTwoPointer);

        // -------- HashMap (Best for Unsorted Array) --------
        int[] resultHashMap = twoSum_HashMap(nums, target);
        System.out.println("HashMap Result:");
        printResult(resultHashMap);
    }



    private static void printResult(int[] result) {
        if(result.length == 0 || result[0] == -1){
            System.out.println("No valid pair found");
        } else {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }
        System.out.println("---------------------------");
    }
}