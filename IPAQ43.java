/* Take a number. If it odd then reverse it, otherwise print "Can not reverse"
 * 
 * Input : 123
 * Output : 321
 * 
 * Input : 234
 * Output : Can not reverse
 */
import java.util.*;
public class IPAQ43{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if(num%2 != 0){
            int rem,rev=0;
            while(num > 0){
                rem = num%10;
                rev = (rev*10)+rem;
                num = num/10;
            }
            System.out.println(rev);
        }else{
            System.out.println("Can not reverse");
        }
    }
}