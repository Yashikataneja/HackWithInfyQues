import java.util.Scanner;

public class BinaryArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the arr ele: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        /* in maxlength var, the val of longest subarray will be stored!)*/
        int maxLen = 0;


        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                arr[i] = 1; // Flip

                 //if all are 1 in array, in this case, no need of flipping array
                //currLength var= continuous 1 ka count rkhega
                //longest var will store : sabse longest 1's ki value ab tak mili wali
                int currLen = 0, longest = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == 1) {
                        currLen++;
                        if (currLen > longest) longest = currLen;
                    } else {
                        currLen = 0;
                    }
                }
                if (longest > maxLen) maxLen = longest;

                arr[i] = 0;
            }
        }


        int currLen = 0, longest = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] == 1) {
                currLen++;
                if (currLen > longest) longest = currLen;
            } else {
                currLen = 0;
            }
        }
        if (longest > maxLen) maxLen = longest;

        System.out.println(maxLen);
    }
}






