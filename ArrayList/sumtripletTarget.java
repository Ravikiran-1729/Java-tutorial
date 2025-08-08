// Find all unique triplets that sum to a target (no duplicate triplets).

import java.util.ArrayList;
import java.util.Arrays;

public class sumtripletTarget {
    public static void main(String[] args) {
        int list[] = { 1, 5, 9, 8, 5, 6, 3, 5, 8, 45, 5, 9, 4, 6, 85, 4, 5, 8, 9, 6, 8, 4, 5, 8, 5, 8, 5, 6, 5, 6 };
        int target = 15;

        ArrayList<ArrayList<Integer>> triplets = uniqueTriplet_threeSum(list, target);
        System.out.println("Unique triplets summing to " + target + ": " + triplets);

    }

    public static ArrayList<ArrayList<Integer>> uniqueTriplet_threeSum(int[] list, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        Arrays.sort(list); // Sort to help skip duplicates earlier

        for (int i = 0; i < list.length - 2; i++) {
            if (i > 0 && list[i] == list[i - 1])
                continue; // skip duplicate 'i' i.e first number

            int left = i + 1;
            int right = list.length - 1;

            while (left < right) {
                int sum = list[i] + list[left] + list[right];

                if (sum == target) {
                    result.add(new ArrayList<>(Arrays.asList(list[i], list[left], list[right])));

                    // Skip duplicates for 'left' and 'right' i.e, second & third number
                    while (left < right && list[left] == list[left + 1]) left++;
                    while (left < right && list[right] == list[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return result;
    }
}
