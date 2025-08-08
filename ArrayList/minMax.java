// Find the minimum and maximum values in a single pass.

import java.util.ArrayList;
import java.util.Arrays;

public class minMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-1, 2, 3, 13,2,1));

        int min = list.get(0), max = list.get(0);

        for(int i = 0; i<list.size(); i++){
            int v = list.get(i);
            if(v<min) min = v;
            if(v>max) max = v;
        }

        System.out.println(min +" is Min \n" + max +" is Max.");
    }
}
