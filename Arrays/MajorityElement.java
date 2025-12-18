public class MajorityElement {
    private static int majorityElement(int nums[]){
        int candidate = nums[0];
        int count = 1;
        for(int i = 1; i<nums.length; i++){
            if(count == 0){
                candidate = nums[i];
                count++;
                continue;
            }
            if(nums[i] == candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        // int arr[] = {2,2,1,1,1,2,2};
        // int arr[] = {2,2,1,3,4,2,2};
        // int arr[] = {2,0,0,0,0,2,2};
        int arr[] = {3,2,3};
        int majorityEl = majorityElement(arr);
        System.out.println(majorityEl);
    }
}
