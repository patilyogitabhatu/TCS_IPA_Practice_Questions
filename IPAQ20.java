/* Find Characters of a string at odd index
 * Arijit = rjt
 * priyanka = ryna
*/
import java.util.*;
public class IPAQ20{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        String result = "";
        for(int i=0 ; i<str.length() ;i++){
            if(i%2!=0){
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}