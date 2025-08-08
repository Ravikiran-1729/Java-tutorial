//Check if an ArrayList forms a palindrome.

import java.util.ArrayList;
import java.util.Arrays;

public class listPalindrome {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 3,2,1));

        for (int i = 0; i < list.size() / 2; i++) {
            if (list.get(i) != list.get(list.size() - 1 - i)) {
                System.out.println(list);
                System.out.println("Nope! this is not palindromic ArrayList");
                return;
            }
        }
        System.out.println(list);
        System.out.println("Yes!! this is palindromic Arraylist.");
    }
}
