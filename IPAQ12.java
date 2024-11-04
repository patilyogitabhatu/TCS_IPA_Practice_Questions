/*
Example : Find the maximun number divisible by the given number.
Input :
4   #number of value need to store.
5
5
10
15
5

Output : MAXIMUM NUMBER COMPLETELY DIVISIBLE : 15

Note :
if there is no max number completly divisible by diven number.
print "No number found".
 */
import java.util.*;
public class IPAQ12 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int list[] = new int[num];
        for(int i=0 ; i<num ; i++){
            list[i] = s.nextInt();
        }

        int divnum = s.nextInt();
        int maximun = 0;
        for(int i : list){
            if( i% divnum == 0){
                if(maximun<i){
                    maximun = i;
                }
            }
        }
        if(maximun==0){
            System.out.println("No number found");
        }
        else{
            System.out.println("MAXIMUM NUMBER COMPLETELY DIVISIBLE : "+maximun);
        }
    }
}
