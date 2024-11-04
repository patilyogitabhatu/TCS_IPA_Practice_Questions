/*
 Example : return the input string by ignoring the repeated char
 Input String : experience 
 output : exprinc
 */
import java.util.*;
public class IPAQ3 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String ans = "";
        for(int i=0 ; i<str.length() ; i++){
            char c = str.charAt(i);
            if(!ans.contains(""+c)){
                ans +=c;
            }
        }
        System.out.println(ans);
    }
}
