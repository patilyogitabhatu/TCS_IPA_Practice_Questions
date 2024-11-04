/* Remove Vowel From A String 

 * Input : Arijit Ghosh
 * Output : rjt Ghsh
 */
import java.util.*;
class IPAQ50{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        String vowels = "aeiouAEIOU";
        String result = "";

        for(int i=0 ; i<str.length() ; i++){
            char c = str.charAt(i);

            if(!vowels.contains(String.valueOf(c))){
                result +=c;
            }
        }
        System.out.println(result);
    }
}