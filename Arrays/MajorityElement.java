public class MajorityElement {
    private static int majorityElement(int nums[]){
        int candidate = nums[0];
        int count = 1;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            count += (candidate == num) ? 1 : -1;
        }
        count = 0;
        for(int num:nums){
            if(candidate == num){count++;}
        }

        return (count > nums.length/2) ? candidate : -1;
    }
    public static void main(String[] args) {
        // int arr[] = {2,2,1,1,1,2,2};
        // int arr[] = {2,2,1,3,4,2,2};
        // int arr[] = {2,0,0,0,0,2,2};
        // int arr[] = {3,2,3};
        int arr[] = {3,2,4};
        int majorityEl = majorityElement(arr);
        System.out.println(majorityEl);
    }
}
