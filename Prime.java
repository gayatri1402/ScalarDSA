/*Problem Description

Given a number A. Return 1 if A is prime and return 0 if not. 

Note : 
The value of A can cross the range of Integer.


Problem Constraints

1 <= A <= 109


Input Format

The first argument is a single integer A.


Output Format

Return 1 if A is prime else return 0.


Example Input

Input 1:
A = 5
Input 2:

A = 10


Example Output

Output 1:
1
Output 2:

0


Example Explanation

Explanation 1:
5 is a prime number.
Explanation 2:

10 is not a prime number. */
 
 
 import java.util.Scanner;
 public class Prime{
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
public static int isPrime(int n){



         if(countFactors(n)==2){
            return 1;
         }
         else
         {
               return 0;

         }
            
      
    
}
    

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

System.out.println(isPrime(n));

        sc.close();
    }
}