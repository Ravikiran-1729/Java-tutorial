public class MaxSubarraySum_KadanesAlgo{

    public static int kadaneAlgorithm(int arr[], int size){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxNegNo = Integer.MIN_VALUE;
        boolean hasPostive = false;

        for(int i = 0; i<size; i++){

            if(arr[i] > 0){
                hasPostive = true;
            }

            if(arr[i] <= 0 && maxNegNo < arr[i]){
                maxNegNo = arr[i];
            }

            currSum += arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Integer.max(maxSum, currSum);
        }
        if(!hasPostive){
            return maxNegNo;
        }
        return maxSum;
    }

    public static int kadane(int arr[], int size){
        int currSum = arr[0];
        int maxSum = arr[0];

        for(int i = 1; i<size; i++){
            currSum = Integer.max(arr[i], currSum+arr[i]);
            maxSum = Integer.max(currSum, maxSum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        // int arr[] = {1,-2,3,-4,5,6,7,8,-9};
        // int arr[] = {-1,-2,-3,0};
        // int arr[] = {-1,-2,-3};
        int arr[] = {0,0,5};

        int max = kadaneAlgorithm(arr, arr.length);
        int max12 = kadane(arr, arr.length);
        System.out.println(max);
        System.out.println(max12);
    }
}