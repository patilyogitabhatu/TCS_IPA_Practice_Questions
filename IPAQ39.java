/* Find maximum prime from diagonals of a matrix
 * 7 8 9
 * 4 5 6
 * 1 2 3
 * Max prime of two diagonal = 7
 */
import java.util.*;
public class IPAQ39{
    public static boolean findPrime(int no){
        boolean flag = true;

        for(int i = 2 ; i<no ; i++){
            if(no%i == 0){
                flag = false;
            }
        }
        return flag;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int row = s.nextInt();
        System.out.println("Enter cols: ");
        int cols = s.nextInt();

        int arr[][] = new int[row][cols];

        for(int i = 0 ; i<row ; i++){
            for(int j=0 ; j<cols ; j++){
                arr[i][j] = s.nextInt();
            }
        }
        int max=0;
        for(int i = 0 ; i<row ; i++){
            for(int j=0 ; j<cols ; j++){
                if(findPrime(arr[i][j])){
                    max = Math.max(max, arr[i][j]);
                }
            }
        }
        System.out.println(max);
    }
}