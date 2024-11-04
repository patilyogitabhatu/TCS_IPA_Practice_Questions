/*
 Example :
 Find the index for input character.
 String Input    : Xplore
 Character Input : r

 output : 4 
 */
import java.util.*;
public class IPAQ01 {
    public static int findChar(String str, char c){
        for(int i = 0 ; i< str.length(); i++){
            if(str.charAt(i)==c){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char c = s.next().charAt(0);

        int ans = findChar(str,c);
        System.out.println(ans);
        
    }
    
}
