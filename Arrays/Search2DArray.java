public class Search2DArray {

    // Binary search on a globally sorted 2D matrix
    private static boolean search(int[][] matrix, int target){

        int m = matrix.length;        // number of rows
        int n = matrix[0].length;     // number of columns

        // Treat matrix as a 1D array of size m*n
        int left = 0;
        int right = m * n - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Convert 1D index to 2D indices
            int mid_i = mid / n;
            int mid_j = mid % n;

            // Target found
            if(matrix[mid_i][mid_j] == target){
                System.out.println(
                    "1D Array idx = " + mid +
                    "\n2D Array idx = (" + mid_i + ", " + mid_j + ")"
                );
                return true;
            }
            // Search left half
            else if(matrix[mid_i][mid_j] > target){
                right = mid - 1;
            }
            // Search right half
            else{
                left = mid + 1;
            }
        }

        // Target not found
        return false;
    }

    public static void main(String[] args) {

        // Globally sorted 2D matrix
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        boolean exists = search(matrix, 16);
        System.out.println(exists);
    }
}
