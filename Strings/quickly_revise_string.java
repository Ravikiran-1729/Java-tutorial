public class quickly_revise_string {
    public static void main(String[] args) {
        String s = " Hello Java World! ";

        // 1. length() - returns number of characters
        System.out.println(s.length()); // 19

        // 2. charAt(int index) - returns character at given index
        System.out.println(s.charAt(4)); // 'l'

        // 3. substring(int beginIndex, int endIndex) - substring from index to end
        System.out.println(s.substring(7, 8)); // "Java World! "

        // 4. substring(int begin, int end) - substring between indexes
        System.out.println(s.substring(7, 11)); // "Java"

        // 5. toLowerCase() - converts to lowercase
        System.out.println(s.toLowerCase()); // " hello java world! "

        // 6. toUpperCase() - converts to uppercase
        System.out.println(s.toUpperCase()); // " HELLO JAVA WORLD! "

        // 7. trim() - removes leading and trailing spaces
        System.out.println(s.trim()); // "Hello Java World!"

        // 8. equals(String another) - compares content (case-sensitive)
        System.out.println(s.equals(" Hello Java World! ")); // true

        // 9. equalsIgnoreCase(String another) - compares content ignoring case
        System.out.println(s.trim().equalsIgnoreCase("hello java world!")); // true

        // 10. contains(CharSequence seq) - checks if substring exists
        System.out.println(s.contains("Java")); // true

        // 11. startsWith(String prefix) - checks if string starts with prefix
        System.out.println(s.trim().startsWith("Hello")); // true

        // 12. endsWith(String suffix) - checks if string ends with suffix
        System.out.println(s.trim().endsWith("World!")); // true

        // 13. indexOf(String str) - returns index of first occurrence
        System.out.println(s.indexOf("Java")); // 7

        // 14. lastIndexOf(String str) - index of last occurrence
        System.out.println(s.lastIndexOf("a")); // 13

        // 15. replace(char old, char new) - replaces characters
        System.out.println(s.replace('a', '@')); // replaces all 'a' with '@'

        // 16. replaceAll(String regex, String replacement) - regex-based replacement
        System.out.println(s.replaceAll("\\s", "_")); // replaces all spaces with '_'

        // 17. split(String regex) - splits string into array
        String[] words = s.trim().split(" ");
        for (String word : words)
            System.out.println(word); // Prints each word

        // 18. isEmpty() - checks if string is empty
        System.out.println("".isEmpty()); // true

        // 19. compareTo(String another) - compares lexicographically
        System.out.println("abc".compareTo("xyz")); // negative (abc < xyz)

        // 20. concat(String str) - joins strings
        System.out.println("Hello".concat(" World")); // "Hello World"

    }
}
