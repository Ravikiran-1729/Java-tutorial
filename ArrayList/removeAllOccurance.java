import java.util.ArrayList;
import java.util.Scanner;

public class removeAllOccurance {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(4);
        list.add(13);
        list.add(24);
        list.add(1);
        list.add(8);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(3);

        System.out.println(list);

        //RemoveAll Occurance of number

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to remove");
        int element = sc.nextInt();

        int count = removeAll(list, element);
        System.out.println(list+"count is "+count);

        sc.close();
    }



    public static int removeAll(ArrayList<Integer> a, int element){
        int count = 0;

        //METHOD ONE ITERATION with O(a.size)
        // for(int i = 0; i<a.size(); i++){
        //     if(a.get(i) == element){
        //         a.remove(i);
        //         i--; // Decrement i to check the new element at this index
        //         count++;
        //     }
        // }

        // METHOD TWO ITERATION WITH O(1), O(2), etc
        while (a.remove(Integer.valueOf(element))) {
            count++;
        }
        return count;
    }
}
