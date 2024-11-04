/* Find the index number of a character in a String
 * Input1 :
 --------------
  Carrot
  a
 
 * Output:
 ---------------
   1

 * Input2:
 ----------------
   Carrot
   z

 * Output:
  --------------
   NA
 */
import java.util.*;
public class IPAQ33{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char ch = s.nextLine().charAt(0);
        boolean flag = false;
        for(int i= 0 ; i<str.length() ; i++){
            if(str.charAt(i) == ch){
                System.out.println(i);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("NA");
        }


    }
}