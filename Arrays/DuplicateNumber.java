import java.util.HashSet;

public class DuplicateNumber {

    // Brute-force approach: O(n²)
    private static boolean hasDuplicate_BruteForce(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true; // duplicate found
                }
            }
        }
        return false; // all elements are unique
    }

    // HashSet approach: O(n)
    private static boolean hasDuplicate(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                return true; // duplicate found
            }
            set.add(num);
        }
        return false; // all elements are unique
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1};

        System.out.println(hasDuplicate(arr));              // true
        System.out.println(hasDuplicate_BruteForce(arr));  // true
    }
}
