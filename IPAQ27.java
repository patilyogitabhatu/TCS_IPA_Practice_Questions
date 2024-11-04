/* Count the words in a sentence which are start with vowel. 
 * 
 * Input: Arijit is student of MCA
 * Output: 3
 * 
 * Input: Sara plays tennis
 * Output: No such words
*/
import java.util.*;
public class IPAQ27{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        int count = 0;
        String vowels = "aeiouAEIOU";

        String arr[] = str.split(" ");
        for(int i=0 ; i<arr.length ; i++){
            if(vowels.contains(String.valueOf(arr[i].charAt(0)))){
                count +=1;
            }
        }
        if(count>0){
            System.out.println(count);
        }else{
            System.out.println("No such words");
        }
        
    }
}