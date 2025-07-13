// ✅ FULL EXPLANATION & OPERATIONS OF ALL MAJOR JAVA HASH METHODS
// This Java program demonstrates declaration, insertion, deletion,
// access, and iteration for each major hash-based class in Java
// like HashMap, LinkedHashSet, LinkedHashMap, Hashtable, ConcurrentHashMap,
// WeakHashMap, EnumMap, TreeMap, TreeSet.
// 
// Each section is structured like your HashSet example:
// - Declaration
// - Static and dynamic insertion
// - Access and removal
// - Use of contains(), size(), isEmpty(), keySet(), values(), entrySet()
// - Use of iterator() or enhanced for loop where applicable
// - Explanation for each line
// ✅ MASTER TABLE: JAVA HASH COLLECTIONS WITH METHODS (DETAILED PER METHOD)
// Table Format: Collection | Purpose | Declaration | Method/Operation Description

/*
|------------------------|----------------------------------------------------------|---------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
| Collection Type        | Purpose                                                  | Declaration                                                   | Method / Description                                                                                           |
|------------------------|----------------------------------------------------------|---------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
| HashSet<E>             | Unique, unordered elements                               | HashSet<E> set = new HashSet<>()                              | .add(e)                                                - Adds an element to set if not already pr              |
|                        |                                                          |                                                               | .remove(e)                                             - Removes specified element from the set                |
|                        |                                                          |                                                               | .contains(e)                                           - Returns true if element exists                        |
|                        |                                                          |                                                               | .size()                                                - Returns number of elements                            |
|                        |                                                          |                                                               | .clear()                                               - Removes all elements from the set                     |
|                        |                                                          |                                                               | .isEmpty()                                             - Returns true if the set is empty                      |
|                        |                                                          |                                                               | .iterator()                                            - Returns an iterator over the set                      |
|------------------------|----------------------------------------------------------|---------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
| LinkedHashSet<E>       | Unique elements, preserves insertion order               | LinkedHashSet<E> set = new LinkedHashSet<>()                  | .add(e)                                                - Adds an element to set if not already pr              |
|                        |                                                          |                                                               | .remove(e)                                             - Removes specified element from the set                |
|                        |                                                          |                                                               | .contains(e)                                           - Returns true if element exists                        |
|                        |                                                          |                                                               | .size()                                                - Returns number of elements                            |
|                        |                                                          |                                                               | .clear()                                               - Removes all elements from the set                     |
|                        |                                                          |                                                               | .isEmpty()                                             - Returns true if the set is empty                      |
|                        |                                                          |                                                               | .iterator()                                            - Returns an iterator over the set                      |
|------------------------|----------------------------------------------------------|---------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
| TreeSet<E>             | Sorted unique elements                                   | TreeSet<E> set = new TreeSet<>()                              | .add(e)                                                - Adds element and keeps sorted                         |
|                        |                                                          |                                                               | .remove(e)                                             - Removes element                                       |
|                        |                                                          |                                                               | .first(), .last()                                      - Returns first/last element                            |
|                        |                                                          |                                                               | .headSet(), .tailSet(), .subSet()                      - Returns subset based on range                         |
|                        |                                                          |                                                               | .contains(e), .isEmpty(), .iterator()                  - Standard set ops                                      |
|------------------------|----------------------------------------------------------|---------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
| HashMap<K, V>          | Unordered key-value pairs                                | HashMap<K, V> map = new HashMap<>()                           | .put(k,v)                                              - Adds or updates key-value pair                        |
|                        |                                                          |                                                               | .get(k)                                                - Returns value for key                                 |
|                        |                                                          |                                                               | .remove(k)                                             - Removes key and its value                             |
|                        |                                                          |                                                               | .containsKey(k), .containsValue(v)                     - Check key/value presence                              |
|                        |                                                          |                                                               | .size(), .clear(), .keySet(), .values(), .entrySet()   - Standard map ops                                      |
|------------------------|----------------------------------------------------------|---------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
| LinkedHashMap<K, V>    | Maintains insertion order                                | LinkedHashMap<K, V> map = new LinkedHashMap<>()               | .put(k,v)                                              - Adds or updates key-value pair                        |
|                        |                                                          |                                                               | .get(k)                                                - Returns value for key                                 |
|                        |                                                          |                                                               | .remove(k)                                             - Removes key and its value                             |
|                        |                                                          |                                                               | .containsKey(k), .containsValue(v)                     - Check key/value presence                              |
|                        |                                                          |                                                               | .size(), .clear(), .keySet(), .values(), .entrySet()   - Standard map ops                                      |
|------------------------|----------------------------------------------------------|---------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
| TreeMap<K, V>          | Sorted key-value pairs                                   | TreeMap<K, V> map = new TreeMap<>()                           | .put(), .get(), .remove()                              - Same as HashMap                                       |
|                        |                                                          |                                                               | .firstKey(), .lastKey()                                - Sorted key boundaries                                 |
|                        |                                                          |                                                               | .headMap(), .tailMap(), .subMap()                      - Sorted range views                                    |
|------------------------|----------------------------------------------------------|---------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
| Hashtable<K, V>        | Thread-safe map (no null keys/values)                    | Hashtable<K, V> table = new Hashtable<>()                     | .put(), .get(), .remove()                              - Standard map ops                                      |
|                        |                                                          |                                                               | .containsKey(), .containsValue()                       - Lookup operations                                     |
|                        |                                                          |                                                               | .keySet(), .elements()                                 - Returns keys/values                                   |
|------------------------|----------------------------------------------------------|---------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
| ConcurrentHashMap<K,V> | Thread-safe concurrent map                               | ConcurrentHashMap<K,V> cmap = new ConcurrentHashMap<>()       | .put(), .get(), .putIfAbsent()                         - Concurrent-friendly write ops                         |
|                        |                                                          |                                                               | .remove(), .replace()                                  - Concurrent updates                                    |
|                        |                                                          |                                                               | .keySet(), .values(), .entrySet(), .forEach()          - Iteration and collection views                        |
|------------------------|----------------------------------------------------------|---------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
| WeakHashMap<K, V>      | Keys removed when GC collects them                       | WeakHashMap<Object, V> map = new WeakHashMap<>()              | Same methods as HashMap; key auto-deletion after garbage collection                                            |
|------------------------|----------------------------------------------------------|---------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
| EnumMap<Enum, V>       | Optimized for enum keys                                  | EnumMap<EnumType, V> emap = new EnumMap<>(EnumType.class)     | .put(), .get(), .remove()                              - Enum-based key operations                             |
|                        |                                                          |                                                               | .keySet(), .values(), .entrySet()                      - Collection views                                      |
|------------------------|----------------------------------------------------------|---------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
| Iterator<E>            | Loop over collection without index                       | Iterator<E> it = set.iterator()                               | .hasNext()                                             - Returns true if next element exists                   |
|                        |                                                          |                                                               | .next()                                                - Returns next element                                  |
|                        |                                                          |                                                               | .remove()                                              - Safely removes current element during iteration       |
|------------------------|----------------------------------------------------------|---------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
*/

import java.util.*;
import java.util.concurrent.*;

public class JavaHashCollectionsDemo {
    enum Day { MON, TUE, WED }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        // ✅ 1. HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        hashMap.put(sc.next(), sc.nextInt());  // dynamic insert
        System.out.println("HashMap: " + hashMap);
        hashMap.remove("A");
        System.out.println("Contains 'A': " + hashMap.containsKey("A"));
        System.out.println("HashMap Size: " + hashMap.size());
        System.out.println("Is HashMap Empty: " + hashMap.isEmpty());
        System.out.println("HashMap Keys: " + hashMap.keySet());
        System.out.println("HashMap Values: " + hashMap.values());
        System.out.println("HashMap Entries:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // ✅ 2. LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("one");
        linkedHashSet.add("two");
        linkedHashSet.add(sc.next());  // dynamic
        System.out.println("LinkedHashSet: " + linkedHashSet);
        linkedHashSet.remove("one");
        System.out.println("Contains 'one': " + linkedHashSet.contains("one"));
        System.out.println("LinkedHashSet Size: " + linkedHashSet.size());
        System.out.println("Is LinkedHashSet Empty: " + linkedHashSet.isEmpty());
        System.out.println("Iterating LinkedHashSet:");
        for (String item : linkedHashSet) System.out.println(item);

        // ✅ 3. LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Java", 8);
        linkedHashMap.put("Python", 3);
        linkedHashMap.put(sc.next(), sc.nextInt());
        System.out.println("LinkedHashMap: " + linkedHashMap);
        linkedHashMap.remove("Java");
        System.out.println("Contains 'Java': " + linkedHashMap.containsKey("Java"));
        System.out.println("LinkedHashMap Keys: " + linkedHashMap.keySet());
        System.out.println("LinkedHashMap Values: " + linkedHashMap.values());
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        // ✅ 4. Hashtable
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("User1", "admin");
        hashtable.put("User2", "root");
        hashtable.put(sc.next(), sc.next());
        System.out.println("Hashtable: " + hashtable);
        hashtable.remove("User1");
        System.out.println("Contains 'User1': " + hashtable.containsKey("User1"));
        System.out.println("Hashtable Keys: " + hashtable.keySet());
        System.out.println("Hashtable Values: " + hashtable.values());

        // ✅ 5. ConcurrentHashMap
        ConcurrentHashMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put(1, "A");
        concurrentMap.put(2, "B");
        concurrentMap.put(sc.nextInt(), sc.next());
        System.out.println("ConcurrentHashMap: " + concurrentMap);
        concurrentMap.remove(1);
        System.out.println("Contains key 1: " + concurrentMap.containsKey(1));
        System.out.println("ConcurrentHashMap Keys: " + concurrentMap.keySet());
        System.out.println("ConcurrentHashMap Values: " + concurrentMap.values());

        // ✅ 6. WeakHashMap
        WeakHashMap<Object, String> weakMap = new WeakHashMap<>();
        Object key1 = new Object();
        weakMap.put(key1, "WeakRef");
        System.out.println("WeakHashMap before GC: " + weakMap);
        key1 = null; System.gc(); Thread.sleep(100);
        System.out.println("WeakHashMap after GC: " + weakMap);

        // ✅ 7. EnumMap
        EnumMap<Day, String> enumMap = new EnumMap<>(Day.class);
        enumMap.put(Day.MON, "Work");
        enumMap.put(Day.TUE, "Meeting");
        System.out.println("EnumMap: " + enumMap);
        System.out.println("EnumMap Keys: " + enumMap.keySet());
        System.out.println("EnumMap Values: " + enumMap.values());

        // ✅ 8. TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Orange", 1);
        treeMap.put("Apple", 2);
        treeMap.put(sc.next(), sc.nextInt());
        System.out.println("TreeMap (sorted): " + treeMap);
        treeMap.remove("Orange");
        System.out.println("TreeMap Keys: " + treeMap.keySet());
        System.out.println("TreeMap Values: " + treeMap.values());

        // ✅ 9. TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(sc.nextInt());
        System.out.println("TreeSet (sorted): " + treeSet);
        treeSet.remove(10);
        System.out.println("Contains 5: " + treeSet.contains(5));
        System.out.println("TreeSet Size: " + treeSet.size());
        System.out.println("Is TreeSet Empty: " + treeSet.isEmpty());
        System.out.println("Iterating TreeSet:");
        for (Integer num : treeSet) System.out.println(num);

        sc.close();
    }
}
