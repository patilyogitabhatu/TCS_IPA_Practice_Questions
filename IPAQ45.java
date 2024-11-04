/* Find the palindrome words from the sentence and print them and also count
 * 
 * Input:
 * ----------------
 * My name is nitin and I can speak malayalam
 * 
 * Output:
 * ----------------
 * nitin
 * I
 * malayalam
 * 3
 */
import java.util.*;
public class IPAQ45{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split(" ");

        int count =0;
        for(int str=0 ; str<arr.length ; str++){
            int left=0;
            int right=arr[str].length()-1;
            boolean flag= true;
            while(left<=right){
                if(arr[str].charAt(left) != arr[str].charAt(right)){
                    flag=false;
                    break;
                }
                left++;
                right--;
            }
            if(flag || arr[str].length() == 1){
                count +=1;
                System.out.println(arr[str]);
            }
        }
        System.out.println(count);
    }
}