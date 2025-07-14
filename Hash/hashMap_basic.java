import java.util.HashMap;
import java.util.Scanner;
@SuppressWarnings("unchecked")

public class hashMap_basic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> hashmap = new HashMap<>();

        hashmap.put("A", 0);
        hashmap.put("B", 1);
        hashmap.put("F", 5);
        hashmap.put("D", 3);
        hashmap.put("E", 4);
        hashmap.put("C", 2);

        System.out.println("____________________________________________________________________________________________________________________");
        
        System.out.println("HashMap:- "+hashmap);   //HashMap:- {A=0, B=1, C=2, D=3, E=4, F=5}
        
        System.out.println("____________________________________________________________________________________________________________________");
        
        hashmap.remove("A");  // remove "A=0" 
        
//      System.out.println("____________________________________________________________________________________________________________________");
        
        System.out.println("HashMap After removing 'A':- "+hashmap);    //HashMap After removing 'A':- {B=1, C=2, D=3, E=4, F=5}
        
        System.out.println("____________________________________________________________________________________________________________________");
        
        System.out.println("Contain key-> 'A':- "+hashmap.containsKey("A"));   //Contain key-> 'A':- false
        
        System.out.println("____________________________________________________________________________________________________________________");
        
        System.out.println("Contain Value-> 3:- "+hashmap.containsValue(3));   //Contain Value-> 3:- true
        
        System.out.println("____________________________________________________________________________________________________________________");
        
        System.out.println("Is hashMap Empty:- "+hashmap.isEmpty());    //Is hashMap Empty:- false
        
        System.out.println("____________________________________________________________________________________________________________________");
        
        System.out.println("HashMap Size :- "+hashmap.size());  //HashMap Size :- 5
        
        System.out.println("____________________________________________________________________________________________________________________");
        
        System.out.println("HashMap Keys:- "+hashmap.keySet());    //HashMap Keys:- [B, C, D, E, F]
        
        System.out.println("HashMap Values:- "+hashmap.values());  //HashMap Values:- [1, 2, 3, 4, 5]
        
        System.out.println("____________________________________________________________________________________________________________________");
        
        System.out.println("HashMap Value for key- 'C':- "+hashmap.get("C"));   //HashMap Value for key- 'C':- 2
        
        System.out.println("____________________________________________________________________________________________________________________");
        
        System.out.println("HashMap key-value pairs:- "+hashmap.entrySet());     // HashMap key-value pairs:- [B=1, C=2, D=3, E=4, F=5]
        
        System.out.println("____________________________________________________________________________________________________________________");
        
        // Using Clone() -> create shallow copy
        HashMap<String, Integer> cloneMap = (HashMap<String, Integer>) hashmap.clone();
        
        // Using putAll() -> copy all entries
        HashMap<String, Integer>  putAllMap = new HashMap<>();
        putAllMap.putAll(hashmap);
        
//      System.out.println("____________________________________________________________________________________________________________________");
        
        // Check equality of HashMap (/Obj) after Cloning using ".equal()""
        System.out.println("Is original HashMap equals with CloneMap:-"+hashmap.equals(cloneMap));   // true
        System.out.println("Is putAllMap equals with CloneMap:-"+putAllMap.equals(cloneMap));        // true
        
        System.out.println("____________________________________________________________________________________________________________________");
        
        //Modify orignal hashmap
        hashmap.put("G", 6);
        System.out.println("G=6 Get added to orignal HashMap");
        
        System.out.println("____________________________________________________________________________________________________________________");
        
        System.out.println("Orignal Map after Modification:- "+hashmap); // {B=1, C=2, D=3, E=4, F=5, G=6}
        System.out.println("Cloned Map :- "+cloneMap);                   // {B=1, C=2, D=3, E=4, F=5}
        System.out.println("PutAll Map:- "+putAllMap);                   // {B=1, C=2, D=3, E=4, F=5}
        
        System.out.println("____________________________________________________________________________________________________________________");
        
        hashmap.putIfAbsent("A", 0);   // puts if only key is not exist
        System.out.println("HashMap after putIfAbsent('A', 0) :- "+hashmap);      // {A=0, B=1, C=2, D=3, E=4, F=5, G=6}
        
        System.out.println("____________________________________________________________________________________________________________________");
        
        // Using put() ->  Modify the Value associated with corresponding Key
        hashmap.put("A", 1);    // existing key-value pair :- "A = 0"
        System.out.println("HashMap After replacing value of key 'A' from 0 to 1 using 'put(k,v)':-"+hashmap);      // {A=1, B=1, C=2, D=3, E=4, F=5, G=6}
        
        System.out.println("____________________________________________________________________________________________________________________");
        
        // Using replace() -> Modify the Value associated with corresponding key 
        hashmap.replace("A", 0);
        System.out.println("HashMap After replacing value of key 'A' from 1 to 0 using 'replace(k,v)' :- "+hashmap);  // {A=0, B=1, C=2, D=3, E=4, F=5, G=6}
        
        System.out.println("____________________________________________________________________________________________________________________");
        
        // Using merge() -> Modification with userdefined operation like addition(concatination), multiplication, etc.
        hashmap.merge("A", 1, (oldVal,newVal)->oldVal+newVal);  // syntax -> 'hashmap.merge(key, value, (oldVal,newVal)-> result)'
        System.out.println("HashMap modification using 'merge(k,v, lambda fun())':- "+hashmap);                       //  {A=1, B=1, C=2, D=3, E=4, F=5, G=6}
        
        System.out.println("____________________________________________________________________________________________________________________");
        
        hashmap.clear();
        System.out.println("HashMap after (.clear()):- "+hashmap);   // {}
        
        System.out.println("____________________________________________________________________________________________________________________");
        
        
        
        
        sc.close();
    }
}