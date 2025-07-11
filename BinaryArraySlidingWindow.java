import java.util.Scanner;

public class BinaryArraySlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the arr ele: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0, right = 0;
        int zeroCount = 0;
        int maxLen = 0;

        // Sliding window
        while (right < n) {
            if (arr[right] == 0) {
                zeroCount++;
            }

            // If more than one zero in window, move left pointer
            while (zeroCount > 1) {
                if (arr[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // Update max length
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        System.out.println(maxLen);
    }
}

