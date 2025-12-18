public class MergeSortedArray {

    private static int[] merge(int[] arr1, int[] arr2){
        int size = arr1.length + arr2.length;
        int[] newArray = new int[size];

        int i = 0;
        int j = 0;
        int k = -1;
        while (i != arr1.length && j != arr2.length) {
            if(arr1[i] < arr2[j]){
                newArray[++k] = arr1[i++];
            }else{
                newArray[++k] = arr2[j++];
            }
        }
        while (i != arr1.length) {
            newArray[++k] = arr1[i++];
        }
        
        while (j != arr2.length) {
            newArray[++k] = arr2[j++];
        }
        return newArray;
        
    }
    public static void main(String[] args) {
        int[] arr1= {1,1,5};
        int[] arr2 = {2,3,4,6};


        int[] result = merge(arr1, arr2);

        for(int i = 0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }
}
