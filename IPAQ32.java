/*Write a Java program to find the first non-repeated character in a given string.

Here's an example of the expected input and output:

Input string: "minimum"
Output: "n"

*/
import java.util.*;
public class IPAQ32{
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        for(int i = 0 ;i<str.length() ; i++){
            boolean flag = false;
            for(int j = 0 ; j<str.length() ; j++){
                char c = str.charAt(i);
                if(i!=j && str.charAt(i) == str.charAt(j)){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(str.charAt(i));
                break;
            }  
        } 
    }
}