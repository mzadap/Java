package interview.strings.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FriendshipTesting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        /*while(tc-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int res = 1;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i = 0; i < n-1; i++){
                if(arr[i] != arr[i+1]){
                    res++;
                }
            }
            System.out.println(res);
        }*/

        while (tc-->0) {
            int n = 2;
            int[] arr = new int[n];
            int count = 1;
            arr[0] = 1;
            arr[1] = 1;
            Arrays.sort(arr);
            for (int i = 0; i<n-1; i++) {
                if (arr[i] != arr[i+1]) {
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}
