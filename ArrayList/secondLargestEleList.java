import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class secondLargestEleList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 3,2,1));

        
        ArrayList<Integer> distinctList = new ArrayList<>();
        for(int i = 0; i<list.size(); i++){
            if(distinctList.contains(list.get(i))){
                continue;
            }
            distinctList.add(list.get(i));
        }

        Collections.sort(distinctList);
        
        int secLargestEle = distinctList.get(distinctList.size()-2);
        System.out.println(secLargestEle+" is the second largest element in the arraylist");

    }
}
