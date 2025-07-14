public class permutationOfString {
    public static void main(String[] args) {
        String str = "abc";

        permutation(str, "");

    }

    public static void permutation(String str, String combination){
        if(str.length() == 0){
            System.out.println(combination);
            return;
        }

        for(int i = 0; i<str.length();i++){
            char currchar = str.charAt(i);
            String newstr = str.substring(0, i)+str.substring(i+1);

            permutation(newstr, combination+currchar);  // bc  a
                                                        //          b   c
                                                        // c   ab
                                                        //          c   b
                                                        // b   ac
        }   
    }
}
