/* Remove a character from a string
 * Input
 * --------------
 * Arijit
 * i
 * Output
 * ---------------
 * Arjt
 */
import java.util.*;
public class IPAQ48 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char a= s.nextLine().charAt(0);

        String result = "";
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i)!=a){
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
