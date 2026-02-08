import java.util.Scanner;

public class Array3{

    public static int[] solve(int[] A, int B, int C) {
        while (B < C) {
            int temp = A[B];
            A[B] = A[C];
            A[C] = temp;
            B++;
            C--;
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int N = sc.nextInt();

        int[] A = new int[N];

        System.out.println("Enter array elements:");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter B index: ");
        int B = sc.nextInt();

        System.out.print("Enter C index: ");
        int C = sc.nextInt();

        // Call function
        int[] result = solve(A, B, C);

        // Print result
        System.out.println("Array after reversing:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
