/* Find number of lower case in a string
 * AriJIt = 3
 */
import java.util.*;
public class IPAQ25{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int count = 0;
        for(int i=0 ; i<str.length() ; i++){
            if(Character.isLowerCase(str.charAt(i))){
                count +=1;
            }
        }
        System.out.println(count);
    }
}