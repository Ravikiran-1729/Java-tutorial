import java.util.HashSet;

public class FindMissingAndRepeatedValues {
    public static int[] findMissingAndRepeatedValues_HashSet(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();
        int result[] = new int[2];

        for(int[] nums : grid){
            for(int num : nums){
                if(!set.add(num)){
                    result[0] = num;
                }
            }

        }
        int size = grid[0].length * grid[0].length;
        for(int i = 1; i<=size; i++){
            if(!set.contains(i)){
                result[1] = i;
                break;
            }
        }
        return result;
    }

    // Optimized
    public static int[] findMissingAndRepeatedValues_Array(int[][] grid) {

        int n = grid.length;
        int size = n * n;
        int[] count = new int[size+1];
        for(int[] nums : grid){
            for(int num : nums){
                count[num] += 1;
            }
        }
        int a = -1, b = -1;
        for(int i = 1; i<count.length; i++){
            if(count[i] == 2){
                a = i;
            }else if(count[i] == 0){
                b = i;
            }
        }
        return new int[]{a, b};
    }
    public static int[] findMissingAndRepeatedValues_Mathematically(int[][] grid) {

        int size = (int) Math.pow(grid.length, 2);

        int expectedSum = size * (size+1) / 2;
        int expectedSqrSum = size * (size + 1) * (2* size + 1) / 6;

        int actualSum = 0, actualSqrSum = 0;

        for(int[] nums : grid){
            for(int num : nums){
                actualSum += num;
                actualSqrSum += Math.pow(num, 2);
            }
        }

        int change = actualSum - expectedSum;

        int a = (actualSqrSum - expectedSqrSum + (int)(Math.pow(change,  2))) / (2 * change);
        int b = a - change;

        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int[][] grid = {{9,1,7},{8,9,2},{3,4,6}};
        int result[] = findMissingAndRepeatedValues_Array(grid);
        int result1[] = findMissingAndRepeatedValues_HashSet(grid);
        int result2[] = findMissingAndRepeatedValues_Mathematically(grid);

        for(int i = 0; i<result.length; i++){
            System.out.print(result[i]);
        }
        System.out.println();

        for(int i = 0; i<result1.length; i++){
            System.out.print(result1[i]);
        }
        System.out.println();

        for(int i = 0; i<result2.length; i++){
            System.out.print(result2[i]);
        }
        System.out.println();
    }
}
