/*
Example : Find Character of a string at odd index
input : Management
output : aaeet
 */
import java.util.*;
public class IPAQ08 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.next();

        String result = "";
        for(int i=0 ; i<str.length() ; i++){
            if(!(i%2 == 0)){
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
