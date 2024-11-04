/* Count number of word in a string
*Note : Always ignore the spaces if more than 1 space given between two word

Sample Input : 1
------------------------
Kalyani Goverment Engineering College

Process
---------------------------
[Kalyani, Goverment, Engineering, College]

Output
---------------------------
Number of word : 4
*************************************
Sample Input : 2
------------------------
Kalyani Goverment  Engineering College

Process
---------------------------
[Kalyani, Goverment, , Engineering, College]

Output
---------------------------
Number of word : 4
*/
import java.util.*;
public class IPAQ26{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String strArray[] = str.split(" ");

        int count = 0;
        System.out.println(Arrays.toString(strArray));

        for(int i=0 ;i <strArray.length;i++){
           if(!strArray[i].isEmpty()){
            count +=1;
           } 
        }
        System.out.println(count);
    }
}