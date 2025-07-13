// |---------------|----------------------------------------------------|------------------------------------------------|------------------------------------------------------------------------------------------------------------|
// | Concept       | Explanation                                        | Declaration                                    | Return                                                                                                     |
// | ------------- | -------------------------------------------------- | ---------------------------------------------- | -----------------------------------------------------------------------------------------------------------|
// | HashSet       | Stores unique elements, no order                   | HashSet<Type> setName = new HashSet<>()        | Create a New Hashset with name 'setName'                                                                   |
// | Iterator      | Used to loop over collection without index         | Iterator<Type> ItrName = setName.iterator()    | Create a New Iterator obn with name 'ItrName'                                                              | 
// | .add()        | Adds element if not already present                | setName.add(E e)                               | Adds element if not already present                                                                        |   
// | .remove()     | Removes the element                                | setName.remove(Object o)                       | Removes the element                                                                                        |
// | .size()       | Returns number of elements                         | setName.size()                                 | Returns number of elements                                                                                 | 
// | .contains()   | Checks if element exists                           | setName.contains(Object o)                     | Return `true` if element exists                                                                            |
// | .isEmpty()    | Returns true if set is empty                       | setName.isEmpty()                              | Return `true` if set is empty                                                                              |
// | .iterator()   | Returns an iterator                                | setName.iterator()                             | Return an iterator (need to store in Itertor object like Iterator<type> ItrName = setName.iterator())      |    
// | .clear()      | Removes all elements                               | setName.clear()                                | Remove all Element in set                                         |                                        |
// | .hasNext()    | Checks if another element exists                   | ItrName.hasNext()                              | Return `true` if another element Exist                                                                     |
// | .next()       | Returns next element                               | ItrName.next()                                 | Return next element in HashSet (in collection of items/elements)                                           |
// | .remove()     | Safely removes current element during iteration    | ItrName.remove()                               | Remove the current element in HashSet (in Collection of items/elements)                                    |
// |---------------|----------------------------------------------------|------------------------------------------------|------------------------------------------------------------------------------------------------------------|

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class hashSet_basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaration of HashSet
        HashSet<String> set = new HashSet<>(); 


        // Static insertion of element string
        set.add("abc");
        set.add("def");
        set.add("ghi");
        set.add("jkl");


        // Dynamic insertion of element string
        System.out.print("Enter hashset element (e):- ");
        set.add(sc.next());


        // Printing of HashSet 
        System.out.println(set);  // "[abc, def]" --return like list(in python)


        // remove element from HashSet
        set.remove("abc");  // HashSet -> [def, ghi, jkl, ...] after removing 'abc'
        System.out.println(set);  


        // Check element Presence (contain)  (Return :- true/false)
        System.out.println(set.contains("abc")); // false   [Removed above so return false else true]


        // Check HashSet is Empty (Return true if Set is Empty)
        System.out.println(set.isEmpty());  // false


        // Return Number of Elements
        System.out.println(set.size()); // 4


        //Iterator  [ITERATOR :- It is a tool which is used for over loop each and every element present in data structure like array, hashset]
        Iterator<String> it = set.iterator();   // declaration [Iterator<data_type> it_name = data_structureName.iterator();]
        while(it.hasNext()){                    // .hasNext() return true if next element exist / Returns true if another element exists
            String str = it.next();             // .next()    return element in data structure  / Returns the next element
            System.out.println(str);
            if(str.equals("def")){
                it.remove();                   // .remove()   remove the current element safely
            }           
        }

        System.out.println(set);       // set -> [ghi, jkl, mno]    ~ 'def' is removed using iterator above so 

        // Clear (Delete) all Elements in HashSet
        set.clear();
        System.out.println(set); // Should print []
    }
}
