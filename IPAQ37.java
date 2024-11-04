// Majority of an element means if an element is present in an array for more than n/2 times, 
//  where n is the length of the Array
//  Array = {3, 3, 4, 2, 4, 4, 2, 4, 4} => 4
import java.util.*;
public class IPAQ37{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for(int i= 0 ; i<n ; i++){
            arr[i]= s.nextInt();
        }
        for(int i=0 ; i<n ; i++){
            int count = 0;
            for(int j=0 ; j<n ; j++){
                if(arr[i]==arr[j]){
                    count +=1;
                }
            }
            if(count > (n/2)){
                System.out.println(arr[i]);
                break;
            }

        }
    }
}