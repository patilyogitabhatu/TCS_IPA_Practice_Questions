/*
/*
 *Input : 1 2 4 8 9 11 12 14
 *Output : 3 5 6 7 10 13
*/

import java.util.*;
public class IPAQ41 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int arr[] = new int[8];
        int ans[] = new int[0];

        for(int i=0 ; i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        for(int i=arr[0] ; i<arr[arr.length-1]; i++){
            boolean flag=false;
            for(int j=0 ; j<arr.length ; j++){
                if(i == arr[j]){
                    flag=true;
                }
            }
            if(!flag){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = i;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
