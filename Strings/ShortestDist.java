import java.util.*;

public class ShortestDist{
    public static double calShortestDist(String path){
        int x = 0, y = 0;

        for(int i = 0; i<path.length(); i++){
            char p = path.charAt(i);

            if(p == 'N'){
                y++;
            }else if(p == 'S'){
                y--;
            }else if(p == 'E'){
                x++;
            }else if(p == 'W'){
                x--;
            }else{
                System.out.println("Invalid Path");
                return -1;
            }
        }

        double dist = Math.sqrt((x*x + y*y));

        return dist;
    }


    public static void main(String[] args){
        String path = "WNEENESENNN";

        double dist = calShortestDist(path);

        System.out.println(dist);
    }
}