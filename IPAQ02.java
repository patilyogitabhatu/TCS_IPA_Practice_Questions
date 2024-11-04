/*
Example : Find the count for small leters present in the string.
String input : DataBaSe
Output : 5;
 */
import java.util.*;
public class IPAQ2 {
    public static int findSmallCount(String str){
        int count = 0;
        for(int i=0 ;i<str.length() ; i++ ){
            char c = str.charAt(i);
            if(c >='a' && c <= 'z'){
                count++;
            }
        }
        return count;
    }
    // public static int findSmallCount(String str){
    //     int count = 0;
    //     for(int i=0 ;i<str.length() ; i++ ){
    //         char c = str.charAt(i);
    //         if(Character.isLowerCase(c)){
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.next();

        int ans = findSmallCount(str);
        System.out.println(ans);
    }
}
