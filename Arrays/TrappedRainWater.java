public class TrappedRainWater {
    public static int trappedWater(int arr[], int size) {
        int leftMax[] = new int[size];
        int rightMax[] = new int[size];

        leftMax[0] = arr[0];
        rightMax[size-1] = arr[size-1];

        for(int i = 1; i<size; i++){
            leftMax[i] = Integer.max(arr[i], leftMax[i-1]);
        }
        for(int i = size-2; i>=0; i--){
            rightMax[i] = Integer.max(arr[i], rightMax[i+1]);
        }
        
        int water = 0;
        for(int i = 0; i<size; i++){
            int boundary = Integer.min(leftMax[i], rightMax[i]);
            int height = arr[i];
            water += boundary - height;
        }
        return water;
    }
    public static void main(String[] args) {
        // int arr[] = {4,2,0,6,3,2,5};
        // int arr[] = {1,2,3,4,5,6,7,8,9};
        // int arr[] = {9,8,7,6,5,4,3,2,1};
        int arr[] = {1,5,3,2,0,1,2};
        int a = trappedWater(arr, arr.length);
        System.out.println(a);
    }
}
