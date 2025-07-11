
import java.util.Scanner;
public class PracQues3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("give size of array: ");

        int n = sc.nextInt(); // Size of array
        System.out.println("enter the no. of queries : ");
        int q = sc.nextInt(); // Number of queries
        int[] A = new int[n];

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt(); // left index
            int r = sc.nextInt(); // right index
            int val = sc.nextInt(); // value to add


            for (int j = l; j <= r; j++) {
                A[j] += val;
            }
        }


        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}
