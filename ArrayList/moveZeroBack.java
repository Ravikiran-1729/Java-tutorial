// Move all zeros to the end of the ArrayList while keeping relative order of non-zeros.
import java.util.ArrayList;
import java.util.Arrays;

public class moveZeroBack {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-1, 0, 2, 3, 0, 13, 2, 1));

        int count = 0;
        for(int i = 0; i<list.size(); i++){
            if(list.get(i) == 0){
                list.remove(i);
                count++;
            }
        }
        for(int i = 0; i<count; i++){
            list.add(0);
        }
        System.out.println(list);
    }
}
