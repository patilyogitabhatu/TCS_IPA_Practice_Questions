/* Remove duplicate characters in a string
 * 
 * Input : Arijit Ghosh
 * Output : Arijt Ghos
 */
import java.util.*;
public class IPAQ49{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String result = "";
        for(int i=0 ; i<str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                if(!result.contains(String.valueOf(str.charAt(i)))){
                    result += str.charAt(i);
                }
            }
            else if(str.charAt(i) == ' '){
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}