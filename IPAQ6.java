/*
Example : Print the number of spaces in the perticular string.
Input : Hello what is your name
output : 4

condition : if the count is greater than or equal to 3 them print the count else print NA as it is.
 */
import java.util.*;
public class IPAQ06 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        int count = 0 ;
        for(int i =0 ; i< str.length() ; i++){
            if(str.charAt(i) == ' '){
                count += 1;
            }
        }
        if(count>=3){
            System.out.print(count);
        }else{
            System.out.print("NA");
        }
        
    }
}
