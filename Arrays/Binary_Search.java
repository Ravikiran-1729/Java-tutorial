public class Binary_Search {

    public static int binarySearch(int arr[], int key, int l, int r){
        if (l>r) {
            return -1;
        }

        int mid = l + (r-l) / 2;

        if(arr[mid] == key){
            return mid;
        }else if(arr[mid] < key){
            return binarySearch(arr, key, mid+1, r);
        }else{
            return binarySearch(arr, key, l, mid-1);
        }
    }

    public static int search(int[] nums, int target) {
        int l = 0; 
        int r = nums.length - 1;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};

        int size = arr.length;
        int index = binarySearch(arr, 9, 0, size -1);
        int index1 = search(arr, 9);
        System.out.println(index + " , "+ index1);
    }
}
