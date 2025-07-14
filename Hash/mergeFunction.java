// |----------------------------|------------------------------------------------------------|---------------------------------------------------------------|------------------------------------------------------------|
// | Concept                    | Explanation                                                | Declaration                                                   | Return                                                     |
// |----------------------------|------------------------------------------------------------|---------------------------------------------------------------|------------------------------------------------------------|
// | .merge(k, v, bifunc)       | Combines old & new values with logic (lambda/function)     | map.merge(k, v, (oldV,newV)->oldV+newV)                       | Adds, merges, modifies — returns final value               |
// |----------------------------|------------------------------------------------------------|---------------------------------------------------------------|------------------------------------------------------------|



import java.util.HashMap;

public class mergeFunction {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Ravi");
        hashMap.put(2,"Yash");
        hashMap.put(3,"Raj");
        hashMap.put(4,"Aniket");

        System.out.println("____________________________________________________________________________________________________________________\n");


        System.out.println("HashMap is :- "+hashMap+"");     // {1=Ravi, 2=Yash, 3=Raj, 4=Aniket}


        System.out.println("____________________________________________________________________________________________________________________\n");
        

        concatString(hashMap);
        System.out.println("Concatination of (String) Values in HashMap");
        System.out.println("Using Merge() Merging values of key 1 -> ie., 'Ravi' with 'Kiran' :- ");   //{1=RaviKiran, 2=Yash, 3=Raj, 4=Aniket, 5=Nagesh}
        System.out.println(hashMap);

        System.out.println("____________________________________________________________________________________________________________________\n");
        
        
        HashMap<String , Integer> hashMap2 = new HashMap<>();
        String fruits[] = {"Mango", "Banana", "Orange", "Banana", "Orange", "Orange"};
        
        freqCount(hashMap2, fruits);
        System.out.println("Frequency Count HashMap");
        System.out.println("Frequency Count HashMap is :- "+hashMap2);  // {Mango=1, Orange=3, Banana=2}


        System.out.println("____________________________________________________________________________________________________________________\n");
    }



    public static void concatString(HashMap<Integer, String> hashMap){

        // concatenate
        hashMap.merge(1, "Kiran", (oldVal, newOld)->oldVal+newOld);     //concatenate
        hashMap.merge(5, "Nagesh", (oldVal, newVal)->oldVal+newVal);    // new Entry 
    }



    public static void freqCount(HashMap<String,Integer> hashMap2, String fruits[]){

        // Count frequency of word
        for(String fruit : fruits){
            hashMap2.merge(fruit, 1, (oldVal,newVal)-> oldVal+newVal);    // {Mango=1, Orange=3, Banana=2}
        }
    }

}
