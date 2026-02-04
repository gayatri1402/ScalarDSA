import java.util.Scanner;;
public class FactP1 {
    public static int P1(int n){
        int count = 0;
        for (int i =1; i<=n/2; i++)
        {
            if(n%i==0)
            {
                count++;
            }
         }
    count++;
    return count;
    
}

public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();

    int result = P1(n);
    System.out.println("Total number of factors of " + n +" = "+result);
    sc.close();

}
}
