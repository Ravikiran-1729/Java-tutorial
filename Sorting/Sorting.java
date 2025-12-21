public class Sorting {

    private static void bubbleSort(int[] nums){
        for(int i = 0; i<nums.length-1; i++){
            for(int j = 0; j<nums.length-i-1; j++){
                if(nums[j] > nums[j+1]){
                    nums[j] = nums[j] ^ nums[j+1];
                    nums[j+1] = nums[j] ^ nums[j+1];
                    nums[j] = nums[j] ^ nums[j+1];
                }
            }
        }
    }
    private static void selectionSort(int[] nums){
        for(int i = 0; i<nums.length-1; i++){
            int min = i;

            for(int j = i+1; j<nums.length; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
    }

    private static void insertionSort(int[] nums){
        for(int i = 1; i<nums.length; i++){
            int j = i-1;
            int curr = nums[i];
            while (j>=0 && curr < nums[j]) {
                nums[j+1] = nums[j];
                j--; 
            }
            nums[j+1] = curr;
        }
    }

    private static void mergeSort(int[] nums, int si, int ei){
        if(si<ei){
            int mid = si + (ei - si) / 2;
            mergeSort(nums, si, mid);
            mergeSort(nums, mid+1, ei);
            conquer(nums, mid, si, ei);
        }
    }

    private static void conquer(int[] nums, int mid, int si, int ei){
        int idx1 = si;
        int idx2 = mid+1;
        int[] sorted = new int[ei-si+1];
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if(nums[idx1] < nums[idx2]){
                sorted[x++] = nums[idx1++];
            }else{
                sorted[x++] = nums[idx2++];
            }
        }
        while (idx1<=mid) {
            sorted[x++] = nums[idx1++];
        }
        while (idx2<=ei) {
            sorted[x++] = nums[idx2++];
        }

        for(int i = 0, j = si; i<sorted.length; i++, j++){
            nums[j] = sorted[i];
        }
    }

    private static void countingSort(int[] nums){
        int[] countArray = new int[nums.length+1];

        for(int i = 1; i<countArray.length; i++){
            countArray[nums[i-1]] += 1;
        }

        int k = 0;
        int j = 0;
        while (j != countArray.length) {
            if(countArray[j] > 0){
                nums[k++] = j;
                countArray[j] -= 1;
            }else{
                j++;
            }
        }
    }

    private static void print(int[] nums){
        for(int num : nums){
                System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = {5,4,3,2,1};
        // bubbleSort(nums);
        // print(nums);
        // selectionSort(nums);
        // print(nums);
        // insertionSort(nums);
        // print(nums);
        // mergeSort(nums, 0, nums.length-1);
        print(nums);

        countingSort(nums);
        print(nums);
    }
}
