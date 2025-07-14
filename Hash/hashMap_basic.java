// ✅ HashMap in Java — Quick Theory (Key Points)
//
// - Stores key-value pairs (Map interface).
// - Keys must be unique; values can be duplicate.
// - No guaranteed order of elements.
// - Allows one null key and multiple null values.
// - Not thread-safe (use ConcurrentHashMap for threads).
// - Provides O(1) average time for put/get operations.
// - Backed by a hash table (internally uses hashing).
// - Introduced in Java 1.2 (in java.util package).
// - Supports advanced methods like merge(), putIfAbsent(), replace(), etc.

/*
|----------------------------|------------------------------------------------------------|---------------------------------------------------------------|------------------------------------------------------------|
| Concept                    | Explanation                                                | Declaration                                                   | Return                                                     |
|----------------------------|------------------------------------------------------------|---------------------------------------------------------------|------------------------------------------------------------|
| ✅ HashMap<K, V>          | Unordered key-value store                                  | HashMap<K, V> map = new HashMap<>()                           | Allows null keys/values, not thread-safe                    |
| .put(k,v)                  | Add/update entry                                           | map.put(key, value)                                           | Adds/updates, returns previous value or null               |
| .get(k)                    | Get value for a key                                        | map.get(key)                                                  | Returns value or null                                      |
| .remove(k)                 | Remove entry                                               | map.remove(key)                                               | Removes key, returns old value or null                     |
| .containsKey(k)            | Checks if key exists                                       | map.containsKey(key)                                          | Returns true/false                                         |
| .containsValue(v)          | Checks if value exists                                     | map.containsValue(value)                                      | Returns true/false                                         |
| .isEmpty()                 | Checks if map is empty                                     | map.isEmpty()                                                 | Returns true if map is empty                               |
| .size()                    | Number of entries                                          | map.size()                                                    | Returns int                                                |
| .clear()                   | Removes all key-value pairs                                | map.clear()                                                   | Returns void                                               |
| .keySet()                  | Gets set of all keys                                       | map.keySet()                                                  | Returns Set<K>                                             |
| .values()                  | Gets collection of all values                              | map.values()                                                  | Returns Collection<V>                                      |
| .entrySet()                | Gets set of key-value mappings                             | map.entrySet()                                                | Returns Set<Map.Entry<K, V>>                               |
| .clone()                   | Creates shallow copy of map                                | HashMap<K, V> newMap = (HashMap<K,V>) map.clone();            | Returns Object (cast needed)                               |
| .putAll(map2)              | Adds all mappings from map2 into current map               | map.putAll(map2)                                              | Copies entries, returns void                               |
| .putIfAbsent(k, v)         | Puts key-value only if key not already present             | map.putIfAbsent("A", 0)                                       | Returns null if added, else existing value                 |
| .replace(k, v)             | Replaces value for a key                                   | map.replace("A", 100)                                         | Returns previous value or null                             |
| .merge(k, v, bifunc)       | Combines old & new values with logic (lambda/function)     | map.merge(k, v, (oldV,newV)->oldV+newV)                       | Adds, merges, modifies — returns final value               |
| .equals(map2)              | Compares two maps (key-value-wise)                         | map.equals(map2)                                              | Returns true if equal (same keys + same values)            |
|----------------------------|------------------------------------------------------------|---------------------------------------------------------------|------------------------------------------------------------|
*/




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