/*Count the number of words in a sentence that contain at least two consecutive vowels (a, e, i, o, u) in them.
Here's a sample input and output:

Input: I enjoy eating spaghetti and meatballs for dinner
Output: 2
Explanation: There are two words in the sentence that contain at least two consecutive vowels 
- "enjoy" and "meatballs".
 */
import java.util.*;
public class IPAQ21{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        String strArray[] = str.split(" ");
        int count = 0 ;
        for(int i=0 ;i<strArray.length ; i++){
            String demo = String.valueOf(strArray[i]);
            
            if(demo.length()>=2){
                
                for(int j=1 ; j< demo.length()-1 ; j++){
                    
                    if(isVowel(demo.charAt(j))){
                        
                        if(isVowel(demo.charAt(j-1)) || isVowel(demo.charAt(j+1))){
                            
                            count +=1;
                            System.out.println(demo);
                            break;
                        }
                    }
                }
            }
        }    
        System.out.println(count);
    }
    public static boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }else{
            return false;
        }
    }
}