/* Find the Maximum Ascii valued character in a String
 * Arijit = t
 * priyanka = y
 * Aa = a
 */
import java.util.*;
public class IPAQ40{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        
        char val = str.charAt(0);
        for(int i =1 ; i<str.length() ; i++){
            if((int)val <  (int)str.charAt(i)){
                val = str.charAt(i);
            }
        }
        System.out.println(val);
    }
}