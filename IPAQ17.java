/*Write a Java program to check if a given number is an Armstrong number or not.

Here's an example of the expected input and output:

Input number: 153
Output: "Yes, the number is an Armstrong number."

*/
import java.util.*;
public class IPAQ17{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int finalNum = num ;
        int sum=0 , rem=0;

        while(num>0){
            rem = num%10;
            sum +=  Math.pow(rem,3);
            num = num/10;
        }
        if(sum == finalNum){
            System.out.println("Yes, the number is an Armstrong number.");
        }else{
            System.out.println("Yes, the number is not an Armstrong number.");
        }
        
    }
}