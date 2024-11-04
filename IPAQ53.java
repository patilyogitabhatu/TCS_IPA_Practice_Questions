/* Calculate the sum of all digits of a numbers. If the sum is greater than 9 then again sum the digits. The sum is 
continuing until the sum becomes one digit.

Input : 195
Output : 6

Explanation: 1+9+5 =15>9, so 1+5=6 */
import java.util.*;
public class IPAQ53 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int result;

        if(num>9){
            result = sumdigit(num);
            System.out.println(result);
        }
        else{
            System.out.println(num);
        }

        

    }
    public static int sumdigit(int num){
        int rem=0, rev=0;
        while(num>0){
            rem = num%10;
            rev += +rem;
            num = num/10;
        }
        if(rev>9){
            return sumdigit(rev);
        }
        return rev;

    }
}
