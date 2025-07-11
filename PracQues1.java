// #include<iostream>
// using namespace std;
// int main(){
//     /* You are given an array of n integers.
// Find the number of sub arrays whose sum is even and starts with an odd number*/
//     int n;
//     cout<<"Enter the size of array : "<<endl;
//     cin>>n;

//     int arr[n];
//     cout<<"Enter the array ele: "<<endl;
//     for(int i=0;i<n;i++){
//         cin>>arr[i];
//     }
//     int count=0;
//     for(int i=0;i<n;i++){
//         if(arr[i]%2!=0){
//             int sum=0;
//             for(int j=i;j<n;j++){
//                 sum+=arr[j];
//                 if(sum%2==0){
//                     count++;
//                 }
//             }
//         }
//     }
//     cout<<"the no. of subarrays are : " <<count<<endl;
//     //cout<<"the subarrays are : "<<endl;
//     return 0;

// }





import java.util.Scanner;

public class PracQues1{
    public static void main(String[] args) {
        // You are given an array of n integers.
        // Find the number of sub arrays whose sum is even and starts with an odd number

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array ele: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) { // starts with an odd number
                int sum = 0;
                for (int j = i; j < n; j++) {
                    sum += arr[j];
                    if (sum % 2 == 0) {
                        count++;
                    }
                }
            }
        }

        System.out.println("the no. of subarrays are : " + count);
    }
}
