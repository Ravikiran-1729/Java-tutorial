public class SB_inbuilt_fun {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("HI I am String Builder");


        System.out.println(sb.length());

        
        System.out.println(sb.charAt(5));


        sb.append(" ");
        sb.append("Thank to Explore Me!!!");
        System.out.println(sb);


        sb.insert(3, "Budy ");
        System.out.println(sb);

        
        sb.setCharAt(2, '_');
        System.out.println(sb);


        sb.delete(3, 8);
        System.out.println(sb);
    }
}
