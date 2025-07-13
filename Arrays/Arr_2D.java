public class Arr_2D {
    public static void main(String args[]){
        int arr[][] =new int[2][4];

        //INPUT 2D Array
        for(int i=1; i<3;i++){
            for(int j= 1; j<5; j++){
                arr[i-1][j-1] = (i+j)*5;
            }
        }

        //Print 2D Array
        System.out.println("Array is :- ");
        for(int i=0; i<2;i++){
            for(int j= 0; j<4; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
