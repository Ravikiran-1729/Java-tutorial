public class SortColors {

    // Dutch National Flag Algorithm
    // Sorts array containing only 0s, 1s, and 2s in O(n) time and O(1) space
    private static void sortColor(int[] nums){

        int low = 0;                  // boundary for 0s
        int mid = 0;                  // current element
        int high = nums.length - 1;   // boundary for 2s

        // Process elements until mid crosses high
        while (mid <= high) {

            if(nums[mid] == 1){
                // 1 is already in correct region
                mid++;
            }
            else if(nums[mid] == 2){
                // Move 2 to the right region
                swap(nums, mid, high--);
            }
            else{ // nums[mid] == 0
                // Move 0 to the left region
                swap(nums, mid++, low++);
            }
        }
    }

    // Swaps two elements using XOR (no extra space)
    private static void swap(int[] nums, int idx1, int idx2){
        nums[idx1] = nums[idx1] ^ nums[idx2];
        nums[idx2] = nums[idx1] ^ nums[idx2];
        nums[idx1] = nums[idx1] ^ nums[idx2];
    }

    public static void main(String[] args) {

        int[] colors = {2, 0, 2, 1, 1, 0, 1};

        sortColor(colors);

        // Print sorted colors
        for(int color : colors){
            System.out.print(color + ", ");
        }
    }
}
