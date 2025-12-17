public class ContainerWithMostWater {

    /*
     * Two Pointer Approach
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    private static int maxWater(int height[]) {

        int n = height.length;

        // Two pointers starting from both ends
        int left = 0, right = n - 1;

        // Stores maximum water found so far
        int maxWater = 0;

        // Continue until pointers meet
        while (left < right) {

            // Width between the two lines
            int width = right - left;

            // Height is limited by the shorter line
            int minHeight = Math.min(height[left], height[right]);

            // Water that can be stored between current lines
            int water = minHeight * width;

            // Update maximum water
            maxWater = Math.max(maxWater, water);

            // Move the pointer with smaller height
            // (moving taller line cannot increase area)
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {

        // Sample input
        int arr[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        // Calculate maximum water container
        int maxWater = maxWater(arr);

        // Output: 49
        System.out.println(maxWater);
    }
}
