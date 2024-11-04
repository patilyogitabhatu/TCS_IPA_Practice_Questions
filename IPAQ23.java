/* Count number of prime digit in a Number 
 * Input : 254786135
 * Output : 5
*/
import java.util.*;
public class IPAQ23{
    public static boolean isPrime(int num){
        boolean prime = true;
        for(int i=2 ; i<num ;i++){
            if(num%i ==0){
                prime = false;
            }
        }
        return prime;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        int no = 0 , co = 0;

        for(int i = 0; i<num.length();i++){
            no = Integer.parseInt(String.valueOf(num.charAt(i)));
            if(no !=1){
                if(isPrime(no)){
                    co +=1;
                }
            }
        }
        System.out.println(co);
    }
}