 /*Problem Description

Given an integer A, you need to find the count of it's factors.

Factor of a number is the number which divides it perfectly leaving no remainder.

Example : 1, 2, 3, 6 are factors of 6


Problem Constraints

1 <= A <= 109


Input Format

First and only argument is an integer A.


Output Format

Return the count of factors of A.


Example Input

Input 1:
5
Input 2:
10

Example Output

Output 1:
2
Output 2:
4
 */
 
 
 import java.util.Scanner;
 public class CountFactor{
    public static int countFactors(int n)
    {
    
        int count = 0;
        for(int i = 1; i<= n/2; i++)
            
        {
            if (n%i==0)
            {
            count++;
            }
}
    count++;
        
    
         return count;
    
}
    

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = countFactors(n);

        System.out.println("Total number of factors of " + n + " = " + result);

        sc.close();
    }
}