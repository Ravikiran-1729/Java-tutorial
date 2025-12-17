public class rotateArray {

    private static void leftRotate(int arr[], int key){
        int n = arr.length;
        int k = key % n;
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }

    private static void rightRotate(int arr[], int key){
        int n = arr.length;
        int k = key % n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }
    

    private static void reverse(int arr[], int start, int end){
        int left = start;
        int right = end;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    private static void print(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2,3,9,5,6,1};
        int key = 2;
        leftRotate(arr, key);
        print(arr);
        // leftRotate output = {9,5,6,1,2,3}
        
        // Approach Step 1 = {3,2,9,5,6,1}
        // Approach Step 2 = {3,2,1,6,5,9}
        // Approach Step 3 = {9,5,6,1,2,3}
        
        
        int arr1[] = {2,3,9,5,6,1};
        int key1 = 2;
        rightRotate(arr1, key1);
        print(arr1);
        // RightRotate output = {6,1,2,3,9,5}

        // Approach Step 1 = {1,6,5,9,3,2}
        // Approach Step 2 = {6,1,5,9,3,2}
        // Approach Step 3 = {6,1,2,3,9,5}
        }
    }
