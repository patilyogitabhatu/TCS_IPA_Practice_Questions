/* Check a number is perfect or not

 * Input : 6
 * Output : Perfect Number
 * 
 * Explaination
 * --------------------------
 * The divisors of 6 = 1,2,3. 1+2+3 = 6
 * Sum of the factors is equal to the given number. So this is perfect
 * 
 * Input : 8
 * Output : Not Perfect Number
 * 
 * Explaination
 * -------------------------
 * Factors of 8 = 1,2,4, but 1+2+4 = 7 not equal to 8.
 */
import java.util.*;
public class IPAQ46{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum=0;

        for(int i=1 ; i<num ; i++){
            if(num%i == 0){
                sum +=i;
            }
        }
        if(sum == num){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not Perfect Number");
        }
    }
}