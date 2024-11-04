/* Write a Java program that takes a user input integer n and prints the Fibonacci series up to n.

The Fibonacci series is a series of numbers in which each number is the sum of the two preceding numbers. 
The first two numbers in the series are 0 and 1. For example, the first 10 numbers in the Fibonacci series are: 
0, 1, 1, 2, 3, 5, 8, 13, 21, 34.

The program should use a for loop to generate the series.

Sample Input:
20

Sample Output:
0 1 1 2 3 5 8 13

Explanation:
The Fibonacci series up to 20 is: 0, 1, 1, 2, 3, 5, 8, 13. Therefore, the output is "0 1 1 2 3 5 8 13". 
*/
import java.util.*;
public class IPAQ28{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int first = 0 ,second =1;

        while(first<num+1){
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}