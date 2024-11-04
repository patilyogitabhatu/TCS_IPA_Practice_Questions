/*
 * Sum of EvenDigit
 * input : 145236
 * output : 4+2+6 = 12
 */
import java.util.*;
public class IPAQ61 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();

        int sum = 0 ;

        for(int i=0 ; i<num.length() ; i++){
            if((i+1)%2 == 0){
                sum += Integer.parseInt(String.valueOf(num.charAt(i)));
            }
        }
        System.out.println(sum);

    }
    
}
