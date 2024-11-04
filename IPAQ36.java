/* Last Character of each word of a sentence

 * Input: Kalyani Government Engineering College
 * Output: itge
 */
import java.util.*;
public class IPAQ36 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String ans = "";
        for(int i=0 ;i<str.length() ;i++){
            if(str.charAt(i)==' '){
                if(Character.isLetter(str.charAt(i-1)))
                {
                    ans += String.valueOf(str.charAt(i-1));
                } 
            }
            if(i == str.length()-1){
                if(Character.isLetter(str.charAt(i)))
                {
                    ans += String.valueOf(str.charAt(i));
                } 
            }
        }
        System.out.println(ans);
    }
}
