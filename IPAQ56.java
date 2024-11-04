/* Minimum Ascii valued character in a String */
import java.util.*;
public class IPAQ56{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        char ch = str.charAt(0);
        for(int i=1 ; i<str.length(); i++){
            if((int) str.charAt(i) < (int) ch){
                ch = str.charAt(i); 
            }
        }
        System.out.print(ch);
    }
}