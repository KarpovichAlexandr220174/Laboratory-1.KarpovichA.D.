import java.util.Scanner;

public class findMinimum {
    //a recursive function for finding Minimum in array...
    public static int findMininum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else {
            return Math.min(findMininum(arr, n - 1), arr[n - 1]); //main recursive algorithm
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); //array filling by user
        }
        System.out.println(findMininum(arr, n)); //using our recursive function with parameters by user
    }
}
