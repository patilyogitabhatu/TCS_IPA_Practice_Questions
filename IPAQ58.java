/* Count number of spaces and characters in a string 
 * Input
 * ---------
 * Arijit is bad boy
 * 
 * Output
 * ------------------
 * Number of space : 3
   Number of character : 14
*/
import java.util.*;
public class IPAQ58{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int sp = 0;
        int ch =0;
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i)== ' '){
                sp +=1;
            }else{
                ch +=1;
            }
        }
        System.out.println("Number of space: "+sp);
        System.out.println("Number of character : "+ch);
    }
}