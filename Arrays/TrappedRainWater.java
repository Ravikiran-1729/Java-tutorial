public class TrappedRainWater {

    /*
     * APPROACH 1: Prefix Max Arrays
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int trappedWater(int arr[], int size) {

        // Stores maximum height to the left of each index
        int leftMax[] = new int[size];

        // Stores maximum height to the right of each index
        int rightMax[] = new int[size];

        // Initialize boundary values
        leftMax[0] = arr[0];
        rightMax[size - 1] = arr[size - 1];

        // Build leftMax array
        for (int i = 1; i < size; i++) {
            leftMax[i] = Integer.max(arr[i], leftMax[i - 1]);
        }

        // Build rightMax array
        for (int i = size - 2; i >= 0; i--) {
            rightMax[i] = Integer.max(arr[i], rightMax[i + 1]);
        }

        // Calculate trapped water
        int water = 0;
        for (int i = 0; i < size; i++) {

            // Minimum of left and right boundary
            int boundary = Integer.min(leftMax[i], rightMax[i]);

            // Water stored at index i
            water += boundary - arr[i];
        }

        return water;
    }

    /*
     * APPROACH 2: Two Pointer (Optimized)
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int trapWater2P(int arr[], int size) {

        int left = 0, right = size - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        // Traverse until pointers meet
        while (left < right) {

            // Move the pointer with smaller height
            if (arr[left] < arr[right]) {

                // Update left maximum
                if (arr[left] > leftMax) {
                    leftMax = arr[left];
                } else {
                    // Water trapped at left index
                    water += leftMax - arr[left];
                }
                left++;

            } else {

                // Update right maximum
                if (arr[right] > rightMax) {
                    rightMax = arr[right];
                } else {
                    // Water trapped at right index
                    water += rightMax - arr[right];
                }
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {

        // Sample test case
        // int arr[] = {1, 5, 3, 2, 0, 1, 2};
        int arr[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};

        // Using prefix max arrays
        int a = trappedWater(arr, arr.length);

        // Using two-pointer optimized approach
        int a1 = trapWater2P(arr, arr.length);

        System.out.println(a);   // Output: 4
        System.out.println(a1);  // Output: 4
    }
}
