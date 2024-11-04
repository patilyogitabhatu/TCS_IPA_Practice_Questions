/*Count the number of words in a sentence that start and end with the same letter.

Input: Anna asked about the Ginseng recipe
Output: 2

Explanation: There are two words in the sentence that start and end with the same letter - "Anna" and "Ginseng". */
import java.util.*;
public class IPAQ55{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String[] str = s.nextLine().split(" ");
        int count =0;
        
        for(int i=0 ; i<str.length; i++){
            String a = str[i];
            if(String.valueOf(a.charAt(0)).equalsIgnoreCase(String.valueOf(a.charAt(a.length()-1)))){
                count +=1;
            }
        }
        System.out.println(count);
    }
}