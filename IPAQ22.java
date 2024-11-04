/* Find the characters in odd position of a string which are consonent
 * 
 * Input: Arijit Ghosh
 * Output: hs
 * Note Start indexing from 1
 */
import java.util.*;
public class IPAQ22{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        
        String vowels = "aeiouAEIOU";
        for(int i = 0 ; i<str.length() ;i++){
            char demo = str.charAt(i);
            if(((i+1) % 2 !=0) &&(demo != ' ') && (!vowels.contains(String.valueOf(str.charAt(i))))){
                System.out.print(str.charAt(i));
            }
        }
    }
}
