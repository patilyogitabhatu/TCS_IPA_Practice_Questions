/*
 Example : take an integer as input and calculate the sum of its digit.
 if the sum is divisible by 3 , then print true , else print false
 Input : 123
 output : True

 Input : 1234
 Output : False
 */
import java.util.*;
public class IPAQ9{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int sum=0, rem = 0;

        while(num>0){
            rem = num%10;
            sum += rem;
            num = num/10;
        }
        if(sum%3==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}