/* Check a string is palindrome or not
 * Input: pop
 * Output: Palindrome
 * 
 * Input: Papa
 * Output: None
 */
import java.util.*;
public class IPAQ44{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int left=0;
        int right=str.length()-1;
        boolean flag= true;
        while(left<=right){
            if(str.charAt(left) != str.charAt(right)){
                flag=false;
                break;
            }
            left++;
            right--;
        }
        if(flag){
            System.out.println("Palindrome");
        }else{
            System.out.println("None");
        }
    }
}