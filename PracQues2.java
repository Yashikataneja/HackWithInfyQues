import java.util.Scanner;

public class PracQues2 {
    public static void main(String[] args){
        /* Given an array of n integers, find the maximum sum of a subarray where no two
         adjacent elements are selected. */
        
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size : ");

         int n=sc.nextInt();
         int[] arr=new int[n];
         System.out.println("enter array ele: ");
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

            int inc=arr[0]; //include 1st ele
            int exc=0; //exclude ist ele
            for(int i=0;i<n;i++){
                int newInc=exc+arr[i]; //include curr ele
                int newExc=Math.max(inc,exc); //exc curr ele
                inc=newInc; //update inc
                exc=newExc; //update exc

            }
            int maxSum=Math.max(inc,exc); //max of inc and exc
            System.out.println("The maximum sum of a subarray where no two adjacent elements are selected is: " + maxSum);
            sc.close();
    }
}
